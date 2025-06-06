package View;
import javax.swing.*;
import java.awt.*;
public class PanelInventario extends JPanel {
    PanelCocaCola coca;
    PanelSprite sprite;
    PanelFanta fanta;
    PanelSnickers snickers;
    PanelSuper8 super8;
    public PanelInventario() {
        super();
        coca = new PanelCocaCola();
        sprite = new PanelSprite();
        fanta = new PanelFanta();
        snickers = new PanelSnickers();
        super8 = new PanelSuper8();
        setSize(1920,1080);
        setOpaque(false);
        add(coca);
        add(sprite);
        add(fanta);
        add(snickers);
        add(super8);

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
        }
    }
}