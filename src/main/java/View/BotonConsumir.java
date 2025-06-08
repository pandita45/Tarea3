package View;

import Algoritmo.Comprador;
import Algoritmo.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonConsumir extends JButton {
    /**
     *
     * @param queAccion El boton recibe una accion en formato de string, que corresponde
     *                  a Coca, Fanta, Super8, etc. Cuando es precionado muestra una ventana con la accion y
     *                  el num de serie del producto
     */
    public BotonConsumir(String queAccion){
        super();
        setBackground(new Color(0, 128, 255, 100));
        setOpaque(false);
        setBorderPainted(false);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(PanelComprador.comprador.ConsumirProducto(queAccion) != null){
                    JOptionPane.showMessageDialog(null, "Usted a consumido: " + queAccion + ".\nNumero de serie: " + Comprador.numSerieActual, "", JOptionPane.INFORMATION_MESSAGE);
                }
                Ventana.actualizar();
            }
        });
    }
}
