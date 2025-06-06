package Algoritmo;

import View.PanelCocaCola;
import View.PanelPrincipal;
import View.Ventana;
import View.PanelExpendedor;
import javax.swing.*;
import java.sql.SQLOutput;

public class App {
    public static final int CANTIDAD_PRODUCTOS=3;
    public static final int mon100=10;
    public static final int mon500=10;
    public static final int mon1000=10;
    public static void main(String[] args) throws Exception {
        Ventana.getInstancia().setVisible(true);
        PanelExpendedor.exp.agregarSaldo(new Moneda1000());
    }
}