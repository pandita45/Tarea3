package View;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    private PanelMonedero monedero;
    private PanelInventario inventario;
    public PanelComprador(){
        super();
        setLayout(null);
        setSize(1920,1080);
        setOpaque(false);
        monedero=new PanelMonedero();
        inventario=new PanelInventario();
        add(monedero);
        add(inventario);


    }
}
