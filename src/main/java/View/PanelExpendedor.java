package View;

import javax.swing.*;
import java.awt.*;


public class PanelExpendedor extends JPanel {
    private PanelCocaCola coca;
    private PanelSuper8 super8;
    private PanelSnickers snickers;
    private PanelFanta fanta;
    private PanelSprite sprite;
    public PanelExpendedor(){
        super();
        coca = new PanelCocaCola();
        super8 = new PanelSuper8();
        snickers = new PanelSnickers();
        fanta = new PanelFanta();
        sprite = new PanelSprite();
        add(coca);
        add(super8);
        add(sprite);
        add(fanta);
        add(snickers);

    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Doom_Machine.png"));
            Image image = imageIcon.getImage();
            g.drawImage(image,0, 0,null);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen del expendedor");
        }
    }

}
