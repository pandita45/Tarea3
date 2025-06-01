package org.example;


class Comprador {
    private String sonido;
    private int vuelto;

    /**
     * Comprador ingresando una moneda y seleccionando un producto en una Expendedora, despues se ejecuta comprarProducto
     * para hacer la compra o de ser el caso, hacer throw de un error, luego se le asigna el valor a sonido (producto que compro)
     * y finalmente se le asigna valor al vuelto.
     * @param m Moneda que ingresa el Comprador.
     * @param NumPad Producto seleccionado en la Expendedora.
     * @param exp Expendedora con la que se interactua.
     * @throws PagoIncorrectoException en caso de que no se ingrese una moneda.
     * @throws PagoInsuficienteException en caso de que no se page lo suficiente para comprar el producto solicitado.
     * @throws NoHayProductoException en caso de que no quede stcok del producto solicitado.
     */
    public Comprador(Moneda m, ProductoYPrecios NumPad, Expendedor exp) throws Errores{
        exp.comprarProducto(m,NumPad);
    }

    /**
     * @return Devuelve el vuelto
     */
    public int cuantoVuelto() {
        return vuelto;
    }

    /**
     * @return Devuelve el sonido
     */
    public String queCompraste() {
        return sonido;
    }

    public void recogerProducto(Expendedor exp){
        Producto b = exp.getProducto();
        if (b != null) {
            sonido = b.accion();
        } else {
            sonido = null;
        }
        Moneda mon;
        while ((mon = exp.getVuelto()) != null) {
            vuelto += mon.getValor();
        }
    }
}