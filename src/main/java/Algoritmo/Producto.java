package Algoritmo;

public abstract class Producto {
    private int serie;

    /**
     * @param a Determina el número de serie del producto.
     */
    public Producto(int a){
        this.serie = a;
    }

    /**
     * @return Devuelve el número de serie del producto.
     */
    public int getSerie() {
        return serie;
    }

    /**
     * @return Devuelve la acción correspondiente al producto que se compró.
     */
    public abstract String accion();
}

