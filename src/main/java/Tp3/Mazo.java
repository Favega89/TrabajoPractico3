package Tp3;

import MyClasses.MainRandomGenerator;
import MyClasses.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yo on 14/4/2018.
 */
public class Mazo extends MainRandomGenerator<String>{

    private List<String> simbolos;
    private List<String> palos;

    private List<Carta> cartas;


    public Mazo() {
        simbolos = new ArrayList<String>();
        palos = new ArrayList<String>();
        cartas = new ArrayList<Carta>();

        this.simbolos.addAll(Arrays.asList("A","2","3","4","5","6","7","8","9","10","J","Q","K"));
        this.palos.addAll(Arrays.asList("Diamantes","Picas","Treboles","Corazones"));

        this.armarMazo();
    }

    private void armarMazo() {
        for (int i = 0; i < 52; i++) {
            String simbolo = super.getRandomByOptions(simbolos);
            String palo = super.getRandomByOptions(palos);
            Carta nueva = new Carta(simbolo, palo);
            if (!this.existeLaCartaEnElMazo(nueva)){
                getCartas().add(nueva);
                Print.msgTab("CARTA: " + nueva.getSimbolo() + " de " + nueva.getPalo() + ".");
            } else {
                i--;
            }
        }
        Print.msgTab("Tamaño: " + getCartas().size() );
    }

    private boolean existeLaCartaEnElMazo(Carta nueva){
        for(Carta c : getCartas()){
            if ((c.getPalo() == nueva.getPalo())&&(c.getSimbolo() == nueva.getSimbolo())){
                return true;
            }
        }
        return false;
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}
