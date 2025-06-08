package View;

import javax.swing.*;
import java.awt.*;

public class PanelMonedero extends JPanel {
    private PanelMoneda VistaMon;
    private Texto mon100;
    private Texto mon500;
    private Texto mon1000;
    private Texto Dinero;
    private BotonAgregarMoneda agregar100;
    private BotonAgregarMoneda agregar500;
    private BotonAgregarMoneda agregar1000;

    public PanelMonedero() {
        super();
        agregar100 = new BotonAgregarMoneda(100); agregar100.setBounds(Escalar.X(1115), Escalar.Y(495), Escalar.X(150), Escalar.Y(150));
        agregar500 = new BotonAgregarMoneda(500); agregar500.setBounds(Escalar.X(1305), Escalar.Y(490), Escalar.X(150), Escalar.Y(150));
        agregar1000 = new BotonAgregarMoneda(1000); agregar1000.setBounds(Escalar.X(1501), Escalar.Y(490), Escalar.X(150), Escalar.Y(150));

        mon100 = new Texto(null); mon100.setBounds(Escalar.X(1163), Escalar.Y(586), Escalar.X(200), Escalar.Y(200));
        mon500 = new Texto(null); mon500.setBounds(Escalar.X(1363), Escalar.Y(586), Escalar.X(200), Escalar.Y(200));
        mon1000 = new Texto(null); mon1000.setBounds(Escalar.X(1563), Escalar.Y(586), Escalar.X(200), Escalar.Y(200));
        Dinero = new Texto(null); Dinero.setBounds(Escalar.X(1300), Escalar.Y(200), Escalar.X(200), Escalar.Y(200));

        PanelComprador.comprador.saldoActual();
        setLayout(null);
        setOpaque(false);
        setSize(Escalar.X(1920), Escalar.Y(1080));

        VistaMon = new PanelMoneda(); VistaMon.setBounds(Escalar.X(770), Escalar.Y(56), Escalar.X(1920), Escalar.Y(1080));

        add(VistaMon); add(mon100); add(mon500); add(mon1000); add(Dinero); add(agregar100); add(agregar500); add(agregar1000);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (PanelComprador.queMenu == 0) {
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("monedero.png")); Image image = imageIcon.getImage(); g.drawImage(image, Escalar.X(770), Escalar.Y(40), Escalar.X(1200), Escalar.Y(900), null);
            } catch (Exception e) {
                System.out.println("Error al cargar la imagen del monedero");
            }
            mon100.setText("x" + PanelComprador.comprador.cuantasMonedas(100));
            mon500.setText("x" + PanelComprador.comprador.cuantasMonedas(500));
            mon1000.setText("x" + PanelComprador.comprador.cuantasMonedas(1000));
            PanelComprador.comprador.saldoActual();
            Dinero.setText("Dinero: $" + PanelComprador.comprador.cuantoDinero);
            mon100.setVisible(true); mon500.setVisible(true); mon1000.setVisible(true); Dinero.setVisible(true);
            agregar100.setVisible(true); agregar500.setVisible(true); agregar1000.setVisible(true);
        } else {
            mon100.setVisible(false); mon500.setVisible(false); mon1000.setVisible(false); Dinero.setVisible(false);
            agregar100.setVisible(false); agregar500.setVisible(false); agregar1000.setVisible(false);
        }
    }
}
