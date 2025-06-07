package View;
import Algoritmo.ProductoYPrecios;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.red;

public class PanelInventario extends JPanel {
    PanelCocaCola coca;
    PanelSprite sprite;
    PanelFanta fanta;
    PanelSnickers snickers;
    PanelSuper8 super8;
    private Texto invStocks;
    public PanelInventario() {
        super();
        invStocks = new Texto("null");
        invStocks.setBounds(1040, 850, 450, 30);
        coca = new PanelCocaCola();
        sprite = new PanelSprite();
        fanta = new PanelFanta();
        snickers = new PanelSnickers();
        super8 = new PanelSuper8();
        setSize(1920,1080);
        setOpaque(false);
        setLayout(null);
        add(coca);
        add(sprite);
        add(fanta);
        add(snickers);
        add(super8);
        add(invStocks);

    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(PanelComprador.queMenu == 1){
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Inventario.png"));
                Image image = imageIcon.getImage();
                g.drawImage(image,1000, 60,820,850,null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen del inventario");
            }
            invStocks.setText("x"+PanelComprador.comprador.cuantosProductos(ProductoYPrecios.COCACOLA)+
                    "        x"+PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SPRITE)+
                    "        x"+PanelComprador.comprador.cuantosProductos(ProductoYPrecios.FANTA)+
                    "        x"+PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SNICKER)+
                    "        x"+PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SUPER8));
            invStocks.setVisible(true);
        }
        else {
            invStocks.setVisible(false);
        }
    }
}