package Tp3;

import MyClasses.Print;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yo on 14/4/2018.
 */
public class ESPN implements Observer {


    public void update(Observable o, Object arg) {
        if(arg instanceof Jugador){
            Print.msg("termino");
        }
        Print.msgTab(arg.toString());
    }

}
