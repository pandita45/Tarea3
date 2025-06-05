package View;

import javax.swing.*;
import java.awt.*;

public class PanelRecogida extends JPanel {
    int productoComprado;
    public PanelRecogida(){
        super();
        setSize(1920,1080);
        setOpaque(false);

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // en construccion
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("cocacola.png"));
                Image image = imageIcon.getImage();
                g.drawImage(image,403, 252, 48,85,null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen de la coca cola");
            }
        }
    }

