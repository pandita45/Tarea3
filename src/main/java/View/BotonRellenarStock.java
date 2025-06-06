package View;

import Algoritmo.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonRellenarStock extends JButton {
    public BotonRellenarStock(){
        super();
        setBackground(new Color(0, 128, 255, 100)); // Color azul con opacidad (100/255)
        setOpaque(false);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelExpendedor.exp.rellenar();
                Ventana.actualizar();
            }
        });
    }
}
