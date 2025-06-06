package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonAgregarMoneda extends JButton {
    private int valor;
    public BotonAgregarMoneda(int valor){
        super();
        this.valor = valor;
        setBackground(new Color(0, 128, 255, 100)); // Color azul con opacidad (100/255)
        setOpaque(false);
        setBorderPainted(false);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelComprador.comprador.meterMoneda(PanelExpendedor.exp,valor);
                Ventana.actualizar();
            }
        });
    }
}
