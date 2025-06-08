package Algoritmo;


import java.util.ArrayList;

public class Comprador {
    private String sonido;
    public int cuantoDinero;
    public static int numSerieActual;
    private ArrayList<Moneda> monedero;
    private ArrayList<Producto> inventario;

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

    public void comprar(ProductoYPrecios NumPad, Expendedor exp) throws Errores {
        exp.comprarProducto(NumPad);
    }

    public void recogerProducto(Expendedor exp) {
        Producto b = exp.getProducto();
        if (b != null) {
            inventario.add(b);
            sonido = b.accion();
        } else {
            sonido = null;
        }
    }

    public void recogerVuelto(Expendedor exp) {
        Moneda mon;
        while ((mon = exp.getVuelto()) != null) {
            monedero.add(mon);
        }
    }

    public int cuantasMonedas(int valor) {
        int cont = 0;
        for (Moneda monedas : monedero) {
            if (monedas.getValor() == valor) {
                cont++;
            }
        }
        return cont;
    }

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

    public int contar(String accion) {
        int cont=0;
        for(Producto producto: inventario){
            if(producto.accion()== accion){
                cont++;
            }
        }
        return cont;
    }

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
