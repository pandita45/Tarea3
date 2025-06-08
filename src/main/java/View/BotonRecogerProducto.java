package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Boton que llama al metodo RecogerProducto de comprador y ademas cambia la variable recogida, para mostrar el producto que se compro
 */
public class BotonRecogerProducto extends JButton {
    public static int recogida = 0;
    public BotonRecogerProducto(){
        super();
        setBackground(new Color(0, 128, 255, 100));
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
