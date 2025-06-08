package View;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelMoneda extends JPanel {
    ArrayList<String> Monedas;

    /**
     * Panel encargado de dibujar las monedas en el monedero, se agregan sus rutas en una array y se seleccionan mediante un ciclo
     */

    public PanelMoneda(){
        setLayout(null);
        setOpaque(false);
        setSize(Escalar.X(1920), Escalar.Y(1080));
        Monedas = new ArrayList<>();
        Monedas.add("Moneda100.png"); Monedas.add("Moneda500.png"); Monedas.add("Moneda1000.png");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(PanelComprador.queMenu == 0) {
            for (int i = 0; i < 3; i++) {
                try {
                    ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(Monedas.get(i))); Image image = imageIcon.getImage(); g.drawImage(image, Escalar.X(320 + 190 * i), Escalar.Y(420), Escalar.X(200), Escalar.Y(200), null);
                } catch (Exception e) {
                    System.out.println("Error al cargar la imagen del monedero");
                }
            }
        }
    }
}
