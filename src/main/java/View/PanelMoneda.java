package View;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelMoneda extends JPanel {
    ArrayList<String> Monedas;
    public PanelMoneda(){
        setLayout(null);
        setOpaque(false);
        setSize(1920,1080);
        Monedas = new ArrayList<String>();
        Monedas.add("Moneda100.png");
        Monedas.add("Moneda500.png");
        Monedas.add("Moneda1000.png");
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(PanelComprador.queMenu==0){
            for (int i = 0; i < 3; i++) {
                try {
                    ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(Monedas.get(i)));
                    Image image = imageIcon.getImage();
                    g.drawImage(image, 320 + 186*i , 420, 200, 200, null);
                } catch (Exception e) {
                    System.out.println("Error al cargar la imagen del monedero");
                }
            }
        }
    }
}
