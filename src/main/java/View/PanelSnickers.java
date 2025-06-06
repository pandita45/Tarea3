package View;

import Algoritmo.ProductoYPrecios;

import javax.swing.*;
import java.awt.*;

public class PanelSnickers extends JPanel {

    public PanelSnickers(){
        super();
        setSize(1920,1080);
        setOpaque(false);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int a=5;
        if(PanelExpendedor.exp.Snickers.getStock()<5){
            a=PanelExpendedor.exp.Snickers.getStock();
        }
        for (int i = 0; i < a; i++) {
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("snickers.png"));
                Image image = imageIcon.getImage();
                g.drawImage(image,403+ i*55, 567, 48,85,null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen del Snickers");
            }
        }
        int b = 8;
        if (PanelComprador.queMenu == 1) {
            if (PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SNICKER)<8) {
                b = PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SNICKER);
            }
            for (int i = 0; i < b; i++) {
                try {
                    ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("snickers.png"));
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 1020 + i * 55, 595, 40, 67, null);
                } catch (Exception e) {
                    System.out.println("Error al cargar la imagen del snickers");
                }
            }
        }
    }
}



