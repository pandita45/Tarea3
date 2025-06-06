package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonRecogerProducto extends JButton {
    public static int recogida = 0;
    public BotonRecogerProducto(){
        super();
        setBackground(new Color(0, 128, 255, 100)); // Color azul con opacidad (100/255)
        setOpaque(false);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                recogida = 1;
                PanelComprador.comprador.recogerProducto(PanelExpendedor.exp);
                Ventana.actualizar();
            }
        });
    }
}
