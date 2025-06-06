package View;

import Algoritmo.Expendedor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonRecogerVuelto extends JButton {
    public static int recogida = 0;
    public BotonRecogerVuelto(){
        super();
        setBackground(new Color(0, 128, 255, 100)); // Color azul con opacidad (100/255)
        setOpaque(false);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelComprador.comprador.recogerVuelto(PanelExpendedor.exp);
                Expendedor.vuelto = 0;
                Ventana.actualizar();
            }
        });
    }
}