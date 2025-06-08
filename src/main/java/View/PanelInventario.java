package View;
import Algoritmo.ProductoYPrecios;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static java.awt.Color.red;

public class PanelInventario extends JPanel {
    private PanelCocaCola coca;
    private PanelSprite sprite;
    private PanelFanta fanta;
    private PanelSnickers snickers;
    private PanelSuper8 super8;
    private BotonConsumir consumirCocaCola;
    private BotonConsumir consumirSprite;
    private BotonConsumir consumirFanta;
    private BotonConsumir consumirSnickers;
    private BotonConsumir consumirSuper8;
    private Texto invStocks;
    public PanelInventario() {
        super();
        invStocks = new Texto("null");
        invStocks.setBounds(1040, 840, 450, 30);
        coca = new PanelCocaCola();
        sprite = new PanelSprite();
        fanta = new PanelFanta();
        snickers = new PanelSnickers();
        super8 = new PanelSuper8();
        setSize(1920,1080);
        setOpaque(false);
        setLayout(null);
        consumirCocaCola = new BotonConsumir("cocacola");
        consumirCocaCola.setBounds(1030, 760, 50, 105);
        consumirSprite = new BotonConsumir("sprite");
        consumirSprite.setBounds(1130, 760, 50, 105);
        consumirFanta = new BotonConsumir("fanta");
        consumirFanta.setBounds(1230, 760, 50, 105);
        consumirSnickers = new BotonConsumir("Snickers");
        consumirSnickers.setBounds(1330, 760, 50, 105);
        consumirSuper8 = new BotonConsumir("Super8");
        consumirSuper8.setBounds(1425, 760, 50, 105);
        add(coca);
        add(sprite);
        add(fanta);
        add(snickers);
        add(super8);
        add(invStocks);
        add(consumirCocaCola);
        add(consumirSprite);
        add(consumirFanta);
        add(consumirSnickers);
        add(consumirSuper8);

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
            consumirCocaCola.setVisible(true);
            consumirSprite.setVisible(true);
            consumirFanta.setVisible(true);
            consumirSnickers.setVisible(true);
            consumirSuper8.setVisible(true);
            invStocks.setVisible(true);
        }
        else {
            consumirCocaCola.setVisible(false);
            consumirSprite.setVisible(false);
            consumirFanta.setVisible(false);
            consumirSnickers.setVisible(false);
            consumirSuper8.setVisible(false);
            invStocks.setVisible(false);
        }
    }
}