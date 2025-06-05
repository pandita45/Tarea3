package View;

import javax.swing.*;
import java.awt.*;
import Algoritmo.


public class PanelExpendedor extends JPanel {
    private PanelCocaCola coca;
    private PanelSuper8 super8;
    private PanelSnickers snickers;
    private PanelFanta fanta;
    private PanelSprite sprite;
    private TextoExpendedor precios;
    public PanelExpendedor(){
        super();
        precios = new TextoExpendedor("1000\n Stock: " + StockCoca);
        precios.setBounds(135,300,700,30);
        setLayout(null);
        setSize(1920,1080);
        setOpaque(false);
        coca = new PanelCocaCola();
        super8 = new PanelSuper8();
        snickers = new PanelSnickers();
        fanta = new PanelFanta();
        sprite = new PanelSprite();
        add(sprite);
        add(coca);
        add(super8);
        add(fanta);
        add(snickers);
        add(precios);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Doom_Machine.jpg"));
            Image image = imageIcon.getImage();
            g.drawImage(image,0, 0,950,900,null);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen del expendedor");
        }
    }
}
