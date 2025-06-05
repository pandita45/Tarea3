package Algoritmo;

import View.PanelCocaCola;
import View.PanelPrincipal;
import View.Ventana;
import View.PanelExpendedor;
import javax.swing.*;
import java.sql.SQLOutput;

public class App {
    public static final int CANTIDAD_PRODUCTOS=3;
    private static Ventana v;
    public static void main(String[] args) throws Exception {

        ProductoYPrecios.COCACOLA.setPrecio(600);
        Ventana.getInstancia().setVisible(true);
        Thread.sleep(500);


        PanelExpendedor.exp.agregarSaldo(new Moneda1000());

        Ventana.actualizar();

        Thread.sleep(2000);

        PanelExpendedor.exp.agregarSaldo(new Moneda1000());
        Ventana.actualizar();
        PanelExpendedor.exp.comprarProducto(ProductoYPrecios.SPRITE);
        Ventana.actualizar();
        Thread.sleep(2000);
        PanelExpendedor.exp.agregarSaldo(new Moneda1000());
        Ventana.actualizar();
        Thread.sleep(2000);
        PanelExpendedor.exp.comprarProducto(ProductoYPrecios.COCACOLA);
        Ventana.actualizar();
        Thread.sleep(2000);

        Ventana.actualizar();



    }
}