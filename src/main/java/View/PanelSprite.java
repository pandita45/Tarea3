package View;

import javax.swing.*;
import java.awt.*;

public class PanelSprite extends JPanel {
    public PanelSprite(){
        super();
        setSize(1920,1080);
        setOpaque(false);

    }

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        for (int i = 0; i < 5; i++) {
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("sprite.png"));
                Image image = imageIcon.getImage();
                g.drawImage(image,403+ i*55, 357, 48,85,null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen de la coca cola");
            }
        }
    }
}
