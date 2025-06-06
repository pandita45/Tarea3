package View;

import javax.swing.*;
import java.awt.*;

public class Texto extends JLabel {
    public Texto(String a){
        super(a);
        try{
            Font minecraftFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("Minecraft.ttf"));
            minecraftFont = minecraftFont.deriveFont(Font.PLAIN, 27f);
            setFont(minecraftFont);
        } catch (Exception e) {
            System.out.println("Error al cargar fuente Minecraft.ttf: " + e.getMessage());
            setFont(new Font("Arial", Font.BOLD, 40));
        }
        setForeground(Color.WHITE);
        setOpaque(false);
    }
}
