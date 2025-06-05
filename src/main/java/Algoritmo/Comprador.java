package Algoritmo;


import java.util.ArrayList;

class Comprador {
    private String sonido;
    private int cuantoDinero;
    private ArrayList<Moneda> monedero;
    public Comprador(int a100, int b500, int c1000) {
        monedero = new ArrayList<Moneda>();

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
}
