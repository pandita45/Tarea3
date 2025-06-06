package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonMenu extends JButton {
    public BotonMenu(String texto) {
        super(texto);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (PanelComprador.queMenu==0){
                    //mostrar monedero
                    PanelComprador.queMenu++;
                }
                else {
                    //muestra inventario
                    PanelComprador.queMenu--;
                }
                Ventana.actualizar();
            }
        });
    }
}
