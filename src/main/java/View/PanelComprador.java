package View;

import Algoritmo.App;
import Algoritmo.Comprador;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    private PanelMonedero monedero;
    private PanelInventario inventario;
    private BotonMenu toggle;
    public static int queMenu=0;
    public static Comprador comprador;
    public PanelComprador(){
        super();
        setLayout(null);
        setSize(1920,1080);
        setOpaque(false);
        comprador = new Comprador(App.mon100,App.mon500,App.mon1000);
        monedero=new PanelMonedero();
        inventario=new PanelInventario();
        toggle=new BotonMenu("Cambiar menu");
        toggle.setBounds(800,500,100,100);
        add(monedero);
        add(inventario);
        add(toggle);
    }
}
