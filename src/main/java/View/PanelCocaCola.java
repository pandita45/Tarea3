package View;

import Algoritmo.ProductoYPrecios;

import javax.swing.*;
import java.awt.*;

public class PanelCocaCola extends JPanel {
    public PanelCocaCola(){
        super();
        setSize(Escalar.X(1920), Escalar.Y(1080));
        setOpaque(false);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int a = 5;
        if (PanelExpendedor.exp.CocaCola.getStock() < 5) {
            a = PanelExpendedor.exp.CocaCola.getStock();
        }
        for (int i = 0; i < a; i++) {
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("cocacola.png"));
                Image image = imageIcon.getImage();
                g.drawImage(image, Escalar.X(403) + i * Escalar.X(55), Escalar.Y(252), Escalar.X(48), Escalar.Y(85), null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen de la coca cola");
            }
        }
        int b = 9;
        if (PanelComprador.queMenu == 1) {
            if (PanelComprador.comprador.cuantosProductos(ProductoYPrecios.COCACOLA) < 9) {
                b = PanelComprador.comprador.cuantosProductos(ProductoYPrecios.COCACOLA);
            }
            for (int i = 0; i < b; i++) {
                try {
                    ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("cocacola.png"));
                    Image image = imageIcon.getImage();
                    g.drawImage(image, Escalar.X(1020) + i * Escalar.X(55), Escalar.Y(385), Escalar.X(40), Escalar.Y(67), null);
                } catch (Exception e) {
                    System.out.println("Error al cargar la imagen de la cocacola");
                }
            }
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("cocacola.png"));
                Image image = imageIcon.getImage();
                g.drawImage(image, Escalar.X(1030), Escalar.Y(760), Escalar.X(50), Escalar.Y(80), null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen de la cocacola");
            }
        }
    }
}
