package View;
import javax.swing.*;
import java.awt.*;
public class PanelInventario extends JPanel {
    public PanelInventario() {
        super();
        setSize(1920,1080);
        setOpaque(false);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Inventario.jpg"));
            Image image = imageIcon.getImage();
            g.drawImage(image,1000, 160,null);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen de la coca cola");
        }

    }
}