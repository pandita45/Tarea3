package View;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelMonedero extends  JPanel{
    private Texto mon100;
    private Texto mon500;
    private Texto mon1000;
    private PanelMoneda VistaMon;
    public PanelMonedero(){
        super();
        setLayout(null);
        setOpaque(false);
        setSize(1920,1080);
        mon100 = new Texto(null);
        mon100.setBounds(1000, 500, 90, 40);
        mon500 = new Texto(null);
        mon500.setBounds(1100, 500, 90, 40);
        mon1000 = new Texto(null);
        mon1000.setBounds(1200, 500, 90, 40);
        VistaMon = new PanelMoneda();
        VistaMon.setBounds(1400, 500, 300, 300);
        add(mon100);
        add(mon500);
        add(mon1000);
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
            mon100.setText("x"+ PanelComprador.comprador.cuantasMonedas(100));
            mon500.setText("x"+ PanelComprador.comprador.cuantasMonedas(500));
            mon1000.setText("x"+ PanelComprador.comprador.cuantasMonedas(1000));
            mon100.setVisible(true);
            mon500.setVisible(true);
            mon1000.setVisible(true);
        }
        else{
            mon100.setVisible(false);
            mon500.setVisible(false);
            mon1000.setVisible(false);
        }
    }
}
