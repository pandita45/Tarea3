package View;

import javax.swing.*;
import java.awt.*;

public class TextoExpendedor extends JLabel {
    private JLabel coca;
    private JLabel fanta;
    private JLabel sprite;
    private JLabel snickers;
    private JLabel super8;
    public TextoExpendedor(String a){
        super(a);
        try{
            Font minecraftFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("Minecraft.ttf"));
            minecraftFont = minecraftFont.deriveFont(Font.PLAIN, 24f);
            setFont(minecraftFont);
        } catch (Exception e) {
            System.out.println("Error al cargar fuente Minecraft.ttf: " + e.getMessage());
            setFont(new Font("Arial", Font.BOLD, 40)); // Fuente por defecto si falla
        }
        setForeground(Color.BLACK);
        setOpaque(false);
    }
}
