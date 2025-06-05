package View;

import javax.swing.*;
import java.awt.*;

public class PanelMonedero extends JPanel {
    public PanelMonedero(){
        super();
        setLayout(null);
        setOpaque(false);
        setSize(1920,1080);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("monedero.png"));
            Image image = imageIcon.getImage();
            g.drawImage(image,800, 50,1100,900,null);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen del monedero");
        }

    }

}
