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
        Ventana.getInstancia().setVisible(true);
    }
}