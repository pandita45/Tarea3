package View;

import javax.swing.*;
import java.awt.*;

public class PanelCocaCola extends JPanel {
    public PanelCocaCola(){
        super();
        setSize(1920,1080);
        setOpaque(false);

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int a=5;
        if(PanelExpendedor.exp.CocaCola.getStock()<5){
            a=PanelExpendedor.exp.CocaCola.getStock();
        }
        for (int i = 0; i < a; i++) {
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("cocacola.png"));
                Image image = imageIcon.getImage();
                g.drawImage(image,403+ i*55, 252, 48,85,null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen de la coca cola");
            }
        }
    }
}
