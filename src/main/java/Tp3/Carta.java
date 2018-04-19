package Tp3;

import java.util.List;

/**
 * Created by Yo on 14/4/2018.
 */
public class Carta {


    private String simbolo;
    private String palo;

    public Carta(String simbolo,String palo) {
        this.simbolo = simbolo;
        this.palo = palo;
    }


    public String getSimbolo() {
        return simbolo;
    }

    public String getPalo() {
        return palo;
    }
}
