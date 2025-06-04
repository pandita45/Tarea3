package View;

import javax.swing.*;
import java.awt.*;

public class PanelSuper8 extends JPanel {
    public PanelSuper8() {
        super();
        setSize(1920,1080);
        setOpaque(false);
    }
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        for (int i = 0; i < 5; i++) {
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("super8.png"));
                Image image = imageIcon.getImage();
                g.drawImage(image,403+ i*55, 675, 48,85,null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen de la coca cola");
            }
        }
    }
}
