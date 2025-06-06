package View;
import Algoritmo.ProductoYPrecios;

import javax.swing.*;
import java.awt.*;
public class PanelFanta extends JPanel {
    public PanelFanta() {
        super();
        setSize(1920,1080);
        setOpaque(false);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int a = 5;
        if (PanelExpendedor.exp.Fanta.getStock() < 5) {
            a = PanelExpendedor.exp.Fanta.getStock();
        }
        for (int i = 0; i < a; i++) {
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("fanta.png"));
                Image image = imageIcon.getImage();
                g.drawImage(image, 403 + i * 55, 462, 48, 85, null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen de la fanta");
            }
        }
        int b=8;
        if (PanelComprador.queMenu == 1) {
            if (PanelComprador.comprador.cuantosProductos(ProductoYPrecios.FANTA)<8) {
                b = PanelComprador.comprador.cuantosProductos(ProductoYPrecios.FANTA);
            }
            for (int i = 0; i < b; i++) {
                try {
                    ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("fanta.png"));
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 1020 + i * 55, 525, 40, 67, null);
                } catch (Exception e) {
                    System.out.println("Error al cargar la imagen de la fanta");
                }
            }
        }
    }
}


