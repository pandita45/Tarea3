package Algoritmo;

import View.*;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;

public class App {
    public static final int CANTIDAD_PRODUCTOS=5; //Cantidad de stock que se le dara a todos los productos
    public static final int mon100=5; //cantidad monedas de 100 que tendrá el comprador
    public static final int mon500=5; //cantidad monedas de 500 que tendrá el comprador
    public static final int mon1000=5; //cantidad monedas de 1000 que tendrá el comprador
    public static void main(String[] args) throws Exception {
        Ventana.getInstancia().setVisible(true);
    }
}