package View;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelExpendedor expendedor;
    private PanelComprador comprador;
    public PanelPrincipal(){
        super();
        setLayout(null);
        setOpaque(false);
        setSize(1920,1080);
        expendedor = new PanelExpendedor(4);
        comprador = new PanelComprador();
        add(expendedor);
        add(comprador);

    }

}
