package View;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{

    public Ventana() {
        super();
        setTitle("Doom_MachineV9");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = (int) (screenSize.width);
        int alto = (int) (screenSize.height);

        setSize(ancho, alto);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel fondo = new JPanel(new BorderLayout());
        fondo.setBackground(Color.decode("#090925"));


        add(fondo);
    }

}
