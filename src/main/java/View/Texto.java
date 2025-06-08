package View;

import javax.swing.*;
import java.awt.*;

public class Texto extends JLabel {
    public static Font minecraftFont;
    public Texto(String a){
        super(a);
        setFont(minecraftFont);
        setForeground(Color.WHITE);
        setOpaque(false);
    }
    static {
        try {
            minecraftFont = Font.createFont(Font.TRUETYPE_FONT, Texto.class.getClassLoader().getResourceAsStream("Minecraft.ttf"));
            minecraftFont = minecraftFont.deriveFont(Font.PLAIN, Escalar.X(27));
        } catch (Exception e) {
            System.out.println("Error al cargar fuente Minecraft.ttf: " + e.getMessage());
            minecraftFont = new Font("Arial", Font.BOLD, 40);
        }
    }


}