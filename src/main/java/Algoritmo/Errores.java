package Algoritmo;

public abstract class Errores extends Exception {
    /**
     * Constructor de Errores que tendra el mensaje que aparecera en el error.
     *
     * @param msg mensaje personalizado de error.
     */
    public Errores(String msg) {
        super(msg);
    }
}
