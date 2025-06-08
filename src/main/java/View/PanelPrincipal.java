package View;

import javax.swing.*;

public class PanelPrincipal extends JPanel {
    private PanelExpendedor expendedor;
    private PanelComprador comprador;

    /**
     * Se agregan los panales de Expendedor y  Comprador al panel principal
     */
    public PanelPrincipal(){
        super();
        setLayout(null);
        setOpaque(false);
        setSize(Escalar.X(1920),Escalar.Y(1080));
        expendedor = new PanelExpendedor();
        comprador = new PanelComprador();
        add(expendedor);
        add(comprador);
    }
}
