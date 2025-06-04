package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ventana extends JFrame{
    private PanelPrincipal principal;

    public Ventana() {
        super();
        setLayout(null);
        getContentPane().setBackground(Color.decode("#090925"));
        principal = new PanelPrincipal();
        add(principal);

        setTitle("Doom_MachineV9");
        setSize(1920,1080);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
