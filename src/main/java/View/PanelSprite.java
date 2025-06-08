package View;

import Algoritmo.ProductoYPrecios;
import javax.swing.*;
import java.awt.*;

/**
 * Esta clase dibuja todas las imagenes de coca cola  usadas en el programa
 * En base a condicionales dibuja la bebida en una secuencia horizontal, en el expendedor como maximo 5 y en el inventario como maximo 9
 * ademas dibuja la bebida visible en el stock de inventario
 */

public class PanelSprite extends JPanel {
    public PanelSprite(){
        super();
        setSize(Escalar.X(1920), Escalar.Y(1080));
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int a = 5;
        if(PanelExpendedor.exp.Sprite.getStock() < 5) a = PanelExpendedor.exp.Sprite.getStock();
        for (int i = 0; i < a; i++) {
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("sprite.png")); Image image = imageIcon.getImage(); g.drawImage(image, Escalar.X(403 + i * 55), Escalar.Y(357), Escalar.X(48), Escalar.Y(85), null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen de la Sprite");
            }
        }
        int b = 9;
        if (PanelComprador.queMenu == 1) {
            if (PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SPRITE) < 9) b = PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SPRITE);
            for (int i = 0; i < b; i++) {
                try {
                    ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("sprite.png")); Image image = imageIcon.getImage(); g.drawImage(image, Escalar.X(1020 + i * 55), Escalar.Y(455), Escalar.X(40), Escalar.Y(67), null);
                } catch (Exception e) {
                    System.out.println("Error al cargar la imagen de la sprite");
                }
            }
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("sprite.png")); Image image = imageIcon.getImage(); g.drawImage(image, Escalar.X(1130), Escalar.Y(760), Escalar.X(50), Escalar.Y(80), null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen de la sprite");
            }
        }
    }
}
