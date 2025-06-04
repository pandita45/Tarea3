package View;

import javax.swing.*;
import java.awt.*;

public class PanelCocaCola extends JPanel {
    public PanelCocaCola(){
        super();
    }

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        for (int i = 0; i < 4; i++) {
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("coca.png"));
                Image image = imageIcon.getImage();
                g.drawImage(image,50, 30,null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen de la coca cola");
            }
        }
    }
}
