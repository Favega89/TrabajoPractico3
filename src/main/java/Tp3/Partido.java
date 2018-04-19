package Tp3;

import Percistencia.Writer;

/**
 * Created by Yo on 16/4/2018.
 */
public class Partido {

    private ESPN espn;
    private scoreBoard scoreBoard;
    private Repartidor repartidor;
    private Thread j1,j2,j3,j4;

    public Partido() {
        ESPN espn = new ESPN();
        scoreBoard scoreBoard = new scoreBoard();
        Repartidor repartidor = new Repartidor();
        Writer writer = new Writer();
        Thread j1 = new Thread(new Jugador("Ronaldo EL GORDO",repartidor,espn,scoreBoard,writer));
        Thread j2 = new Thread(new Jugador("Neymar",repartidor,espn,scoreBoard,writer));
        Thread j3 = new Thread(new Jugador("Rafa Nadal",repartidor,espn,scoreBoard,writer));
        Thread j4 = new Thread(new Jugador("Usain Bolt",repartidor,espn,scoreBoard,writer));
        j1.start();j2.start();j3.start();j4.start();

    }
}
