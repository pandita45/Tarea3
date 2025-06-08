package View;
import Algoritmo.ProductoYPrecios;

import javax.swing.*;
import java.awt.*;

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
        invStocks.setBounds(Escalar.X(1040), Escalar.Y(840), Escalar.X(450), Escalar.Y(30));
        coca = new PanelCocaCola();
        sprite = new PanelSprite();
        fanta = new PanelFanta();
        snickers = new PanelSnickers();
        super8 = new PanelSuper8();
        setSize(Escalar.X(1920), Escalar.Y(1080));
        setOpaque(false);
        setLayout(null);
        consumirCocaCola = new BotonConsumir("cocacola");
        consumirCocaCola.setBounds(Escalar.X(1030), Escalar.Y(760), Escalar.X(50), Escalar.Y(105));
        consumirSprite = new BotonConsumir("sprite");
        consumirSprite.setBounds(Escalar.X(1130), Escalar.Y(760), Escalar.X(50), Escalar.Y(105));
        consumirFanta = new BotonConsumir("fanta");
        consumirFanta.setBounds(Escalar.X(1230), Escalar.Y(760), Escalar.X(50), Escalar.Y(105));
        consumirSnickers = new BotonConsumir("Snickers");
        consumirSnickers.setBounds(Escalar.X(1330), Escalar.Y(760), Escalar.X(50), Escalar.Y(105));
        consumirSuper8 = new BotonConsumir("Super8");
        consumirSuper8.setBounds(Escalar.X(1425), Escalar.Y(760), Escalar.X(50), Escalar.Y(105));
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
        if (PanelComprador.queMenu == 1) {
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Inventario.png"));
                Image image = imageIcon.getImage();
                g.drawImage(image, Escalar.X(1000), Escalar.Y(60), Escalar.X(820), Escalar.Y(850), null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen del inventario");
            }
            invStocks.setText("x" + PanelComprador.comprador.cuantosProductos(ProductoYPrecios.COCACOLA) +
                    "        x" + PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SPRITE) +
                    "        x" + PanelComprador.comprador.cuantosProductos(ProductoYPrecios.FANTA) +
                    "        x" + PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SNICKER) +
                    "        x" + PanelComprador.comprador.cuantosProductos(ProductoYPrecios.SUPER8));
            consumirCocaCola.setVisible(true);
            consumirSprite.setVisible(true);
            consumirFanta.setVisible(true);
            consumirSnickers.setVisible(true);
            consumirSuper8.setVisible(true);
            invStocks.setVisible(true);
        } else {
            consumirCocaCola.setVisible(false);
            consumirSprite.setVisible(false);
            consumirFanta.setVisible(false);
            consumirSnickers.setVisible(false);
            consumirSuper8.setVisible(false);
            invStocks.setVisible(false);
        }
    }
}
