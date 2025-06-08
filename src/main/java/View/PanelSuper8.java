package View;

import Algoritmo.ProductoYPrecios;
import javax.swing.*;
import java.awt.*;

public class PanelSuper8 extends JPanel {
    public PanelSuper8() {
        super();
        setSize(Escalar.X(1920), Escalar.Y(1080));
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int a = 5;
        if (PanelExpendedor.exp.Super8.getStock() < 5) a = PanelExpendedor.exp.Super8.getStock();
        for (int i = 0; i < a; i++) {
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("super8.png")); Image image = imageIcon.getImage(); g.drawImage(image, Escalar.X(403 + i * 55), Escalar.Y(675), Escalar.X(48), Escalar.Y(85), null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen del super 8");
            }
        }

        int b = 9;
        if (PanelComprador.queMenu == 1) {
            if (PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SUPER8) < 9) b = PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SUPER8);
            for (int i = 0; i < b; i++) {
                try {
                    ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("super8.png")); Image image = imageIcon.getImage(); g.drawImage(image, Escalar.X(1020 + i * 55), Escalar.Y(665), Escalar.X(40), Escalar.Y(67), null);
                } catch (Exception e) {
                    System.out.println("Error al cargar la imagen del super8");
                }
            }
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("super8.png")); Image image = imageIcon.getImage(); g.drawImage(image, Escalar.X(1430), Escalar.Y(760), Escalar.X(50), Escalar.Y(80), null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen del super8");
            }
        }
    }
}
