package View;

import javax.swing.*;
import java.awt.*;
import Algoritmo.Expendedor;
import Algoritmo.App;
import Algoritmo.ProductoYPrecios;
public class PanelExpendedor extends JPanel {
    public static Expendedor exp;
    private PanelCocaCola coca;
    private PanelSuper8 super8;
    private PanelSnickers snickers;
    private PanelFanta fanta;
    private PanelSprite sprite;
    private TextoExpendedor DatosCoca;
    private TextoExpendedor DatosSprite;
    private TextoExpendedor DatosFanta;
    private TextoExpendedor DatosSuper8;
    private TextoExpendedor DatosSnickers;
    private TextoExpendedor Saldo;

    public PanelExpendedor(){
        super();
        exp= new Expendedor(App.CANTIDAD_PRODUCTOS);
        DatosCoca = new TextoExpendedor("$" + ProductoYPrecios.COCACOLA.getPrecio()+"  Stock: " + exp.CocaCola.getStock());
        DatosCoca.setBounds(145,300,700,30);
        DatosSprite = new TextoExpendedor("$" +ProductoYPrecios.SPRITE.getPrecio()+"  Stock: " + exp.Sprite.getStock());
        DatosSprite.setBounds(145,405,700,30);
        DatosFanta = new TextoExpendedor("$" +ProductoYPrecios.FANTA.getPrecio()+"  Stock: " + exp.Fanta.getStock());
        DatosFanta.setBounds(145,510,700,30);
        DatosSuper8 = new TextoExpendedor("$" +ProductoYPrecios.SUPER8.getPrecio()+"  Stock: " + exp.Super8.getStock());
        DatosSuper8.setBounds(145,615,700,30);
        DatosSnickers = new TextoExpendedor("$" +ProductoYPrecios.SNICKER.getPrecio()+"  Stock: " + exp.Snickers.getStock());
        DatosSnickers.setBounds(145,720,700,30);
        Saldo = new TextoExpendedor("$"+exp.getSaldo());
        Saldo.setBounds(745,320,700,30);
        setLayout(null);
        setSize(1920,1080);
        setOpaque(false);
        coca = new PanelCocaCola();
        super8 = new PanelSuper8();
        snickers = new PanelSnickers();
        fanta = new PanelFanta();
        sprite = new PanelSprite();
        add(sprite);
        add(coca);
        add(super8);
        add(fanta);
        add(snickers);
        add(DatosCoca);
        add(DatosSprite);
        add(DatosFanta);
        add(DatosSuper8);
        add(DatosSnickers);
        add(Saldo);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Doom_Machine.jpg"));
            Image image = imageIcon.getImage();
            g.drawImage(image,0, 0,950,900,null);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen del expendedor");
        }
    }
    public void actualizarDatos() {
        DatosCoca.setText("$" + ProductoYPrecios.COCACOLA.getPrecio() + "  Stock: " + exp.CocaCola.getStock());
        DatosSprite.setText("$" + ProductoYPrecios.SPRITE.getPrecio() + "  Stock: " + exp.Sprite.getStock());
        DatosFanta.setText("$" + ProductoYPrecios.FANTA.getPrecio() + "  Stock: " + exp.Fanta.getStock());
        DatosSuper8.setText("$" + ProductoYPrecios.SUPER8.getPrecio() + "  Stock: " + exp.Super8.getStock());
        DatosSnickers.setText("$" + ProductoYPrecios.SNICKER.getPrecio() + "  Stock: " + exp.Snickers.getStock());
        Saldo.setText("$" + exp.getSaldo());
        revalidate();
        repaint();
    }

}
