package View;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Al presionar llama a la funcion Rellenar de Expendedor
 */
public class BotonRellenarStock extends JButton {
    public BotonRellenarStock(){
        super();
        setBackground(new Color(0, 128, 255, 100));
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
