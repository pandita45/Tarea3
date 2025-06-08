package View;

import Algoritmo.Expendedor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BotonRecogerVuelto extends JButton {
    /**
     * Boton que llama a la funcion RecogerVuelto de comprador y transforma el vuelto del expendedor en 0
     */
    public BotonRecogerVuelto(){
        super();
        setBackground(new Color(0, 128, 255, 100));
        setOpaque(false);
        setBorderPainted(false);
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