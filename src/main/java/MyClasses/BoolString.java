package MyClasses;

/**
 * Created by Yo on 30/3/2018.
 */
public class BoolString {

    private Boolean booleanAtr;
    private String stringAtr;

    public void setBooleanAtr(Boolean booleanAtr) {
        this.booleanAtr = booleanAtr;
    }

    public void setStringAtr(String stringAtr) {
        this.stringAtr = stringAtr;
    }

    public Boolean getBooleanAtr() {

        return booleanAtr;
    }

    public String getStringAtr() {
        return stringAtr;
    }

    public BoolString(Boolean booleanAtr, String stringAtr) {

        this.booleanAtr = booleanAtr;
        this.stringAtr = stringAtr;
    }
    public BoolString(String stringAtr, Boolean booleanAtr) {

        this.booleanAtr = booleanAtr;
        this.stringAtr = stringAtr;
    }


    // ESTE CONSTRUCTOR DEBERIA SER CREADO COMO METODO + NOMBRE ? EJ (boolStringCheckMin)

    // CONSTRUCTOR BOOLSTRING QUE DEVUELVE TRUE SI EL TAMAÑO DE LA COLECCION ES MAYOR AL MINIMO PERMITIDO.
    public BoolString(int collectionSize, int minValue, String msgTrue, String msgFalse){
        BoolString result = (collectionSize > minValue ? new BoolString(true,msgTrue) :
        new BoolString(false,msgFalse));
    }


}
