package Tp3;

import Model.ResultModel;
import MyClasses.IRandomizableIntRange;
import MyClasses.Print;
import Percistencia.Writer;

import java.util.*;

import static java.lang.Thread.sleep;

/**
 * Created by Yo on 13/4/2018.
 */
public class Jugador extends Observable implements Runnable , IRandomizableIntRange{

    private boolean endgame;
    private String name;
    private Repartidor repartidor;
    private List<Carta> mano;
    private scoreBoard scoreBoard;
    private int score;
    private Writer writer;

    public Jugador(String name, Repartidor repartidor, Observer observer, scoreBoard scoreBoard, Writer writer) {
        this.name = name;
        this.repartidor = repartidor;
        this.mano = new ArrayList<Carta>();
        this.scoreBoard = scoreBoard;
        this.writer = writer;
        addObserver(observer);
        score = 0;
        endgame = false;
    }

    public void run() {
        while (!this.endgame) {
            this.cartaValida(repartidor.repartir());
       /*     if(!this.endgame) {*/
                try {
                    sleep(getRandomOnRange(5, 10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            /*}else{
                // matar hilo
                notifyObservers(this);
                ResultModel r = new ResultModel(name,score);
                writer.add(r);
            }*/
        }
        ResultModel r = new ResultModel(name,score);
        writer.add(r);
    }

    private void cartaValida(Carta c){
        if(c.getSimbolo() != "ninguno"){
            mano.add(c);
            sumarPuntaje(c);
        }else{
            endgame = true;
        }
    }

    private void sumarPuntaje(Carta c){
        score += this.scoreBoard.score(c);
        String msg = "El Jugador " + this.name + " ha recivido la carta " +
                c.getSimbolo() + " de " + c.getPalo() + ". El Jugador " + this.name + " tiene un puntaje de " + score + ".";
        notificar(msg);
    }

    private void notificar(String msg){
        setChanged();
        notifyObservers(msg);
    }

    public int getRandomOnRange(int min, int max) {
        Random r = new Random();
        int result = r.nextInt(max-min) + min;
        return result;
    }
}
