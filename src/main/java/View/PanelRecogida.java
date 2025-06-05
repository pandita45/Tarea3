package View;

import javax.swing.*;
import java.awt.*;

public class PanelRecogida extends JPanel {
    int productoComprado;
    String imagen;
    public PanelRecogida(){
        super();
        setSize(1920,1080);
        setOpaque(false);
        int a = PanelExpendedor.exp.getOpcion();
        switch (a) {
            case 1 -> imagen = "cocacolaflip.png";
            case 2 -> imagen = "spriteflip.png";
            case 3 -> imagen = "fantaflip.png";
            case 4 -> imagen = "super8flip.png";
            case 5 -> imagen = "snickerflip.png";
            default -> {
            }
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(imagen));
                Image image = imageIcon.getImage();
                g.drawImage(image,403, 252, 48,85,null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen");
            }
        }
    }

