package Algoritmo;

public enum ProductoYPrecios{
    COCACOLA(1,600),
    SPRITE(2, 400),
    FANTA(3, 800),
    SUPER8(4,300),
    SNICKER(5,1000);

    private final int id;
    private int precio;

    /**
     * El constructor asigna los valores de precio e id a las variables
     * @param id valor numérico correspondiente a la opción de compra
     * @param precio  precio del producto en cuestión
     */
    private ProductoYPrecios(int id, int precio){
        this.id = id;
        this.precio = precio;
    }

    /**
     * Función que permite cambiar el precio de cierto producto
     * @param precio valor numérico correspondiente al precio
     */
    public void setPrecio(int precio){
        this.precio = precio;
    }

    /**
     * @return Devuelve el ID de cierto producto
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return Devuelve el precio de cierto producto en forma de valor numérico
     */
    public int getPrecio() {
        return this.precio;
    }
}
