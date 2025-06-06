package View;

import javax.swing.*;
import java.awt.*;

public class PanelRecogida extends JPanel {
    int productoComprado;
    private String imagen;
    private int a;

    public PanelRecogida() {
        super();
        setSize(1920, 1080);
        setOpaque(false);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        a = PanelExpendedor.exp.getOpcion();
        switch (a) {
            case 1 -> imagen = "cocacolaflip.png";
            case 2 -> imagen = "spriteflip.png";
            case 3 -> imagen = "fantaflip.png";
            case 4 -> imagen = "super8flip.png";
            case 5 -> imagen = "snickerflip.png";
        }
            if (imagen != null) {
                try {
                    ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(imagen));
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 490, 788, 85, 48, null);
                } catch (Exception e) {
                    System.out.println("Error al cargar la imagen: " + imagen);
                }
            }

        }
    }


