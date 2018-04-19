package MyClasses;

/**
 * Created by Yo on 30/3/2018.
 */
public interface IRandomWithOptions<O> {
    // ELIJE UNA OPCION RANDOM ENTRE N ARGUMENTOS GENERICOS.
    O getRandomByOptions(O... args);
}
