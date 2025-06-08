package Algoritmo;


import java.util.ArrayList;

public class Comprador {
    private String sonido;
    public int cuantoDinero;
    public static int numSerieActual;
    private ArrayList<Moneda> monedero;
    private ArrayList<Producto> inventario;

    /**
     * Constructor de comprador, llena el monedero con monedas.
     * @param a100 cantidad de monedas de 100.
     * @param b500 cantidad de monedas de 500.
     * @param c1000 cantidad de monedas de 1000.
     */
    public Comprador(int a100, int b500, int c1000) {
        monedero = new ArrayList<Moneda>();
        inventario = new ArrayList<Producto>();
        for (int i = 0; i < a100; i++) {
            monedero.add(new Moneda100());
        }
        for (int i = 0; i < b500; i++) {
            monedero.add(new Moneda500());
        }
        for (int i = 0; i < c1000; i++) {
            monedero.add(new Moneda1000());
        }
    }

    /**
     * Recorre el array en donde están las monedas del comprador.
     * @return devuelve la suma de todas las monedas del comprador.
     */
    public int saldoActual() {
        this.cuantoDinero = 0;
        for (Moneda moneda : monedero) {
            this.cuantoDinero += moneda.getValor();
        }
        return this.cuantoDinero;
    }


    /**
     * @return Devuelve el sonido
     */
    public String queCompraste() {
        return sonido;
    }

    /**
     * Metodo para meter monedas a la máquina expendedora desde el monedero del comprador.
     * @param exp a que expendedor se le meterá la moneda.
     * @param a valor de la moneda que se le meterá.
     */
    public void meterMoneda(Expendedor exp, int a) {
        if (a == 100) {
            for (Moneda moneda : monedero) {
                if (moneda.getValor() == 100) {
                    exp.agregarSaldo(moneda);
                    monedero.remove(moneda);
                    break;
                }
            }
        } else if (a == 500) {
            for (Moneda moneda : monedero) {
                if (moneda.getValor() == 500) {
                    exp.agregarSaldo(moneda);
                    monedero.remove(moneda);
                    break;
                }
            }
        } else if (a == 1000) {
            for (Moneda moneda : monedero) {
                if (moneda.getValor() == 1000) {
                    exp.agregarSaldo(moneda);
                    monedero.remove(moneda);
                    break;
                }
            }
        }
    }

    /**
     * Metodo para comprar un producto en una máquina expendedora.
     * @param NumPad que producto se desea comprar.
     * @param exp desde que expendedor se va a comprar.
     * @throws Errores en caso de no haber stock, no ser el saldo suficiente para la compra, no meter moneda o que en
     * el espacio de recogida ya alla un producto, tira un mensaje de error en la compra.
     */
    public void comprar(ProductoYPrecios NumPad, Expendedor exp) throws Errores {
        exp.comprarProducto(NumPad);
    }

    /**
     * Recoge producto desde el espacio de recogida.
     * @param exp de que expendedor se recogera el producto.
     */
    public void recogerProducto(Expendedor exp) {
        Producto b = exp.getProducto();
        if (b != null) {
            inventario.add(b);
            sonido = b.accion();
        } else {
            sonido = null;
        }
    }

    /**
     * Recoge el vuelto de la máquina expendedora, añadiéndolo desde la máquina al monedero.
     * @param exp a que expendedor se le va a recoger el vuelto.
     */
    public void recogerVuelto(Expendedor exp) {
        Moneda mon;
        while ((mon = exp.getVuelto()) != null) {
            monedero.add(mon);
        }
    }

    /**
     * @param valor de que valor se van a contar las monedas.
     * @return cantidad de monedas de "valor" en monedero.
     */
    public int cuantasMonedas(int valor) {
        int cont = 0;
        for (Moneda monedas : monedero) {
            if (monedas.getValor() == valor) {
                cont++;
            }
        }
        return cont;
    }

    /**
     * @param a Qué producto es el que se contara.
     * @return cantidad de "a" que hay en el inventario de comprador.
     */
    public int cuantosProductos(ProductoYPrecios a) {
        int cont;
        switch (a){
            case COCACOLA -> cont=contar("cocacola");
            case SPRITE -> cont=contar("sprite");
            case FANTA -> cont=contar("fanta");
            case SNICKER -> cont=contar("Snickers");
            case SUPER8 -> cont=contar("Super8");
            default -> {
                cont=0;
            }
        }
        return cont;
    }

    /**
     * @param accion String del producto que se desea contar.
     * @return cantidad de "accion" producto en inventario.
     */
    public int contar(String accion) {
        int cont=0;
        for(Producto producto: inventario){
            if(producto.accion()== accion){
                cont++;
            }
        }
        return cont;
    }

    /**
     * Consume producto del inventario del comprador.
     * @param queAccion producto que se desea consumir.
     * @return qué producto es el que se consumió, en caso de que no se tenga el producto que se desea consumir hace return null.
     */
    public String ConsumirProducto(String queAccion) {
        int cont = 0;
        for(Producto producto: inventario){
            if(producto.accion()==queAccion) {
                cont+=1;
                sonido = producto.accion();
                numSerieActual = producto.getSerie();
                inventario.remove(producto);
                break;
            }
        }
        if(cont == 0){
            return null;
        }
        return sonido;
    }
}
