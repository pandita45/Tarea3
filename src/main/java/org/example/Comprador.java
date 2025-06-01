package org.example;


import java.util.ArrayList;

class Comprador {
    private String sonido;
    private int cuantoDinero;
    private ArrayList<Moneda> bolsillo;

    public Comprador(int cuantoDinero) {
        bolsillo = new ArrayList<Moneda>();

        for(int i = 0; i < cuantoDinero/1000; i++){
            cuantoDinero = cuantoDinero - 1000;
            bolsillo.add(new Moneda1000());
        }

        for(int i = 0; i < cuantoDinero/500; i ++){
            cuantoDinero = cuantoDinero - 500;
            bolsillo.add(new Moneda500());
        }

        for (int i = 0; i < cuantoDinero / 100; i++) {
            bolsillo.add(new Moneda100());
        }
    }

    /**
     * @return Devuelve el vuelto
     */
    public int cuantoVuelto() {
        return cuantoDinero;
    }

    /**
     * @return Devuelve el sonido
     */
    public String queCompraste() {
        return sonido;
    }

    public void comprar(Moneda m, ProductoYPrecios NumPad, Expendedor exp) throws Errores{
        exp.comprarProducto(m,NumPad);
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
            cuantoDinero += mon.getValor();
        }
    }
}