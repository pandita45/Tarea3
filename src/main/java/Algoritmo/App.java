package Algoritmo;

import View.PanelPrincipal;
import View.Ventana;
import View.PanelExpendedor;

import javax.swing.*;

public class App {
    public static final int CANTIDAD_PRODUCTOS=4;
    private static Ventana v;
    public static void main(String[] args) throws Exception {

        ProductoYPrecios.COCACOLA.setPrecio(600);

        SwingUtilities.invokeLater(() -> {
            v=new Ventana();
            v.setVisible(true);

            // Esperar un poco o ejecutar la actualización después de mostrar la ventana
            // Por ejemplo, simulamos que cambiamos datos y actualizamos luego de 2 segundos
            new Timer(200, e -> {
                // Llamar al método para actualizar datos del panel Expendedor
                PanelExpendedor.exp.agregarSaldo(new Moneda500());
                ProductoYPrecios.COCACOLA.setPrecio(500);
                System.out.println(PanelExpendedor.exp.getSaldo());
                v.actualizar();
            }).start();
        });
    }
}