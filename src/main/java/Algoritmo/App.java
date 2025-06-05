package Algoritmo;

import View.PanelCocaCola;
import View.PanelPrincipal;
import View.Ventana;
import View.PanelExpendedor;
import javax.swing.*;
import java.sql.SQLOutput;

public class App {
    public static final int CANTIDAD_PRODUCTOS=4;
    private static Ventana v;
    public static void main(String[] args) throws Exception {

        ProductoYPrecios.COCACOLA.setPrecio(600);
        Ventana.getInstancia().setVisible(true);
        Thread.sleep(500);


        PanelExpendedor.exp.agregarSaldo(new Moneda500());
        ProductoYPrecios.COCACOLA.setPrecio(500);
        Ventana.actualizar();

        Thread.sleep(500);

        PanelExpendedor.exp.agregarSaldo(new Moneda1000());

        Ventana.actualizar();

        PanelExpendedor.exp.comprarProducto(ProductoYPrecios.COCACOLA);

        System.out.println(PanelExpendedor.exp.CocaCola.getStock());
        System.out.println(PanelExpendedor.exp.Sprite.getStock());


    }
}