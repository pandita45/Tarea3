package View;

import javax.swing.*;
import java.awt.*;

public class PanelMonedero extends  JPanel{
    private PanelMoneda VistaMon;
    public PanelMonedero(){
        super();
        setLayout(null);
        setOpaque(false);
        setSize(1920,1080);
        VistaMon = new PanelMoneda();
        VistaMon.setBounds(780, 40, 1920, 1080);
        add(VistaMon);

    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(PanelComprador.queMenu==0){
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("monedero.png"));
                Image image = imageIcon.getImage();
                g.drawImage(image,770, 40,1200,900,null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen del monedero");
            }
        }
    }
}
