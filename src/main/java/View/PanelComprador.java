package View;

import Algoritmo.App;
import Algoritmo.Comprador;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    private PanelMonedero monedero;
    private PanelInventario inventario;
    private BotonMenu toggle;
    public static int queMenu = 0;
    public static Comprador comprador;

    public PanelComprador() {
        super();
        setLayout(null);
        setSize(Escalar.X(1920), Escalar.Y(1080));
        setOpaque(false);
        comprador = new Comprador(App.mon100, App.mon500, App.mon1000);
        monedero = new PanelMonedero();
        inventario = new PanelInventario();
        toggle = new BotonMenu("INVENTARIO");
        toggle.setBounds(Escalar.X(1270), Escalar.Y(930), Escalar.X(240), Escalar.Y(60));
        add(monedero);
        add(inventario);
        add(toggle);
    }
}
