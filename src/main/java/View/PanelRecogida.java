package View;

import javax.swing.*;
import java.awt.*;

public class PanelRecogida extends JPanel {
    private String imagen;
    private int Opcion;

    public PanelRecogida() {
        super();
        setSize(Escalar.X(1920), Escalar.Y(1080));
        setOpaque(false);
    }

    /**
     * En base a la opcion escogida para comprar, usamos un switch para decidir que imagen de producto se mostrara en el panel de recogida
     */

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Opcion = PanelExpendedor.exp.getOpcion();
        switch (Opcion) {
            case 1 -> imagen = "cocacolaflip.png";
            case 2 -> imagen = "spriteflip.png";
            case 3 -> imagen = "fantaflip.png";
            case 4 -> imagen = "super8flip.png";
            case 5 -> imagen = "snickerflip.png";
        }
        if (BotonRecogerProducto.recogida == 0) {
            if (imagen != null) {
                try {
                    ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(imagen)); Image image = imageIcon.getImage(); g.drawImage(image, Escalar.X(490), Escalar.Y(788), Escalar.X(85), Escalar.Y(48), null);
                } catch (Exception e) {
                    System.out.println("Error al cargar la imagen: " + imagen);
                }
            }
        }
    }
}

