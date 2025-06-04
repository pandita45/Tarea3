package View;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelExpendedor expendedor;
    private PanelComprador comprador;
    public PanelPrincipal(){
        super();
        expendedor = new PanelExpendedor();
        comprador = new PanelComprador();
        add(expendedor);
        add(comprador);

    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }


}
