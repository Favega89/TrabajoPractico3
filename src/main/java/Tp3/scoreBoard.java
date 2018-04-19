package Tp3;

/**
 * Created by Yo on 14/4/2018.
 */
public class scoreBoard {


    public int score(Carta c){
        int scoreParcial;
        if (c.getPalo().toString().equals("Diamantes")) {
             scoreParcial= 5;
        } else if (c.getPalo().toString().equals("Corazones")) {
             scoreParcial = 3;
        } else if (c.getPalo().toString().equals("Picas")) {
            scoreParcial = 2;
        } else {
            scoreParcial = 6;
        }
        scoreParcial = scoreParcial + score2(c);
        return scoreParcial;
    }

    private int score2(Carta carta){
        int scoreDelNumero;
        if(carta.getSimbolo() == "J"){
            scoreDelNumero = 11;
        }else if(carta.getSimbolo() == "Q"){
            scoreDelNumero = 12;
        }else if(carta.getSimbolo() == "K"){
            scoreDelNumero = 13;
        }else if(carta.getSimbolo() == "A") {
            scoreDelNumero = 14;
        }else {
            scoreDelNumero = Integer.parseInt(carta.getSimbolo());
        }
        return scoreDelNumero;
    }
}
