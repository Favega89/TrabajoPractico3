package Tp3;

import MyClasses.MainRandomGenerator;

import static javafx.scene.input.KeyCode.O;

/**
 * Created by Yo on 14/4/2018.
 */
public class Repartidor {

    private Mazo mazo;
    private boolean noHayMasCartas;
    private int counter;

    public Repartidor() {
        counter = 0;
        mazo = new Mazo();
        this.noHayMasCartas = false;
    }

    public synchronized Carta repartir(){
        Carta c = nuevaCarta();
        while(noHayMasCartas){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(c.getSimbolo() == "ninguno") {
            counter++;
        }
        if(counter >= 4){
            noHayMasCartas = true;
        }
        notifyAll();
        return c;
    }

    private Carta nuevaCarta(){
        if(mazo.getCartas().size() > 0) {
           Carta carta = mazo.getCartas().get(mazo.getCartas().size()-1);
           mazo.getCartas().remove(carta);
           return carta;
        }else{
           return new Carta("ninguno","ninguno");
        }
    }
}
