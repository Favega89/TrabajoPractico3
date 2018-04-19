package Model;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * Created by Yo on 17/4/2018.
 */
public class ResultModel {

    private String name;
    private int puntaje;

    public String getName() {
        return name;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public ResultModel(String name, int puntaje) {
        this.name = name;
        this.puntaje = puntaje;
    }
}
