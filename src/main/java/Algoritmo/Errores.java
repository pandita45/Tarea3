package Algoritmo;

public abstract class Errores extends Exception {
    /**
     * Constructor de Errores que tendrá el mensaje que aparecerá en el error.
     * @param msg mensaje personalizado de error.
     */
    public Errores(String msg) {
        super(msg);
    }
}
