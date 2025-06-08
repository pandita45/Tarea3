package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonMenu extends JButton {
    /**
     * @param texto Parametro que define que texto se mostrara en el boton
     */
    public BotonMenu(String texto) {
        super(texto);
        setFont(Texto.minecraftFont);
        setBackground(new Color(24, 24, 99));
        setForeground(Color.WHITE);
        setFocusPainted(false);
        setBorder(BorderFactory.createLineBorder(new Color(0, 120, 215), 2, true));
        this.addActionListener(new ActionListener() {
            @Override
            /**
             * queMenu es una variable numerica static que varia entre 0 y 1 para mostrar el texto correspondiente
             */
            public void actionPerformed(ActionEvent e) {
                if (PanelComprador.queMenu==0){
                    PanelComprador.queMenu++;
                    setText("MONEDERO");
                }
                else {
                    PanelComprador.queMenu--;
                    setText("INVENTARIO");
                }
                Ventana.actualizar();
            }
        });
    }
}
