package View;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    private PanelMonedero monedero;
    private PanelInventario inventario;
    private BotonMenu toggle;
    public static int queMenu=0;
    public PanelComprador(){
        super();
        setLayout(null);
        setSize(1920,1080);
        setOpaque(false);
        monedero=new PanelMonedero();
        inventario=new PanelInventario();
        toggle=new BotonMenu("Cambiar menu");
        toggle.setBounds(500,500,100,100);
        add(monedero);
        add(inventario);
        add(toggle);
    }
}
