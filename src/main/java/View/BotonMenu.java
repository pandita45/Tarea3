package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonMenu extends JButton {
    public BotonMenu(String texto) {
        super(texto);
        setFont(Texto.minecraftFont);  // Aquí usas la fuente estática ya cargada en Texto
        setBackground(new Color(24, 24, 99));
        setForeground(Color.WHITE);
        setFocusPainted(false);
        setBorder(BorderFactory.createLineBorder(new Color(0, 120, 215), 2, true));
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (PanelComprador.queMenu==0){
                    //mostrar monedero
                    PanelComprador.queMenu++;
                    setText("MONEDERO");
                }
                else {
                    //muestra inventario
                    PanelComprador.queMenu--;

                    setText("INVENTARIO");
                }
                Ventana.actualizar();
            }
        });
    }
}
