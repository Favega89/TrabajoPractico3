package MyClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Yo on 30/3/2018.
 */
public class MainRandomGenerator<O> implements IRandomizableIntRange,IRandomWithOptions<O> {

    // IMPLEMENTACION DE LAS 2 INTERFACES RANDOM (INT EN RANGO Y GENERICO ENTRE OPCIONES)
    public int getRandomOnRange(int min, int max) {
        Random r = new Random();
        int result = r.nextInt(max-min) + min;
        return result;
    }

    private int selector;

    public O getRandomByOptions(O... args) {

        this.selector = 0;
        List<O> options = new ArrayList<O>();
        for(O o : args) {
            selector++;
            options.add(o);
        }
        return options.get(this.getRandomOnRange(0,selector));
    }

    public O getRandomByOptions(List<O> args){
        return args.get(this.getRandomOnRange(0,args.size()));
    }
}
