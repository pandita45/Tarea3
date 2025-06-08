package View;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    private PanelPrincipal principal;
    private static Ventana instancia;
    private Ventana() {
        super();
        setLayout(null);
        getContentPane().setBackground(Color.decode("#090925"));
        principal = new PanelPrincipal();
        add(principal);

        setTitle("Doom_MachineV9");
        setSize(Escalar.X(1920), Escalar.Y(1080));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

    }

    public static Ventana getInstancia() {
        if (instancia == null) {
            instancia = new Ventana();
        }
        return instancia;
    }
    public static void actualizar(){
        instancia.repaint();
    }
}
