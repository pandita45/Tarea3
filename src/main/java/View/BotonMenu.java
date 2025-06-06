package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonMenu extends JButton {
    public BotonMenu(String texto) {
        super(texto);
        try{
            Font minecraftFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("Minecraft.ttf"));
            minecraftFont = minecraftFont.deriveFont(Font.PLAIN, 27f);
            setFont(minecraftFont);
        } catch (Exception e) {
            System.out.println("Error al cargar fuente Minecraft.ttf: " + e.getMessage());
            setFont(new Font("Arial", Font.BOLD, 40)); // Fuente por defecto si falla
        }
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
