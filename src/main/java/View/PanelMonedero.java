package View;

import javax.swing.*;
import java.awt.*;

public class PanelMonedero extends  JPanel{
    private PanelMoneda VistaMon;
    private Texto mon100;
    private Texto mon500;
    private Texto mon1000;
    private Texto Dinero;
    public PanelMonedero(){
        super();
        mon100 = new Texto(null);
        mon100.setBounds(1163, 586, 200, 200);
        mon500 = new Texto(null);
        mon500.setBounds(1363, 586, 200, 200);
        mon1000 = new Texto(null);
        mon1000.setBounds(1563, 586, 200, 200);
        Dinero = new Texto(null);
        Dinero.setBounds(1300,200, 200, 200);
        PanelComprador.comprador.saldoActual();
        setLayout(null);
        setOpaque(false);
        setSize(1920,1080);
        VistaMon = new PanelMoneda();
        VistaMon.setBounds(770, 56, 1920, 1080);
        add(VistaMon);
        add(mon100);
        add(mon500);
        add(mon1000);
        add(Dinero);
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
            PanelComprador.comprador.saldoActual();
            Dinero.setText("Dinero: $"+ PanelComprador.comprador.cuantoDinero);
            mon100.setVisible(true);
            mon500.setVisible(true);
            mon1000.setVisible(true);
            Dinero.setVisible(true);

        }
        else{
            mon100.setVisible(false);
            mon500.setVisible(false);
            mon1000.setVisible(false);
            Dinero.setVisible(false);
        }
        }
    }

