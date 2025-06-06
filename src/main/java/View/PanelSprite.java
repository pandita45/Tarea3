package View;

import Algoritmo.ProductoYPrecios;

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
        int a=5;
        if(PanelExpendedor.exp.Sprite.getStock()<5){
            a=PanelExpendedor.exp.Sprite.getStock();
        }
        for (int i = 0; i < a; i++) {
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("sprite.png"));
                Image image = imageIcon.getImage();
                g.drawImage(image,403+ i*55, 357, 48,85,null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen de la Sprite");
            }
        }
        int b = 8;
        if (PanelComprador.queMenu == 1) {
            if (PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SPRITE)<8) {
                b = PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SPRITE);
            }
            for (int i = 0; i < b; i++) {
                try {
                    ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("sprite.png"));
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 1020 + i * 55, 455, 40, 67, null);
                } catch (Exception e) {
                    System.out.println("Error al cargar la imagen de la sprite");
                }
            }
        }
    }
}
