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
    private Texto DatosCoca;
    private Texto DatosSprite;
    private Texto DatosFanta;
    private Texto DatosSuper8;
    private Texto DatosSnickers;
    private Texto Saldo;
    private Texto vuelto;
    private PanelRecogida productoComprado;
    private BotonCompra botonCompra;
    private BotonRecogerProducto botonProducto;
    private BotonRecogerVuelto botonVuelto;
    private BotonRellenarStock botonRellenarStock;
    public PanelExpendedor(){
        super();
        productoComprado = new PanelRecogida();
        exp = new Expendedor(App.CANTIDAD_PRODUCTOS);
        DatosCoca = new Texto(null);
        DatosCoca.setBounds(Escalar.X(145), Escalar.Y(300), Escalar.X(700), Escalar.Y(30));
        DatosSprite = new Texto(null);
        DatosSprite.setBounds(Escalar.X(145), Escalar.Y(405), Escalar.X(700), Escalar.Y(30));
        DatosFanta = new Texto(null);
        DatosFanta.setBounds(Escalar.X(145), Escalar.Y(510), Escalar.X(700), Escalar.Y(30));
        DatosSuper8 = new Texto(null);
        DatosSuper8.setBounds(Escalar.X(145), Escalar.Y(720), Escalar.X(700), Escalar.Y(30));
        DatosSnickers = new Texto(null);
        DatosSnickers.setBounds(Escalar.X(145), Escalar.Y(615), Escalar.X(700), Escalar.Y(30));
        Saldo = new Texto(null);
        Saldo.setBounds(Escalar.X(745), Escalar.Y(320), Escalar.X(700), Escalar.Y(30));
        vuelto = new Texto(null);
        vuelto.setBounds(Escalar.X(745), Escalar.Y(700), Escalar.X(300), Escalar.Y(30));
        setLayout(null);
        setSize(Escalar.X(1920), Escalar.Y(1080));
        setOpaque(false);
        coca = new PanelCocaCola();
        super8 = new PanelSuper8();
        snickers = new PanelSnickers();
        fanta = new PanelFanta();
        sprite = new PanelSprite();
        botonCompra = new BotonCompra();
        botonCompra.setBounds(Escalar.X(133), Escalar.Y(240), Escalar.X(230), Escalar.Y(527));
        botonProducto = new BotonRecogerProducto();
        botonProducto.setBounds(Escalar.X(410), Escalar.Y(782), Escalar.X(250), Escalar.Y(60));
        botonVuelto = new BotonRecogerVuelto();
        botonVuelto.setBounds(Escalar.X(753), Escalar.Y(782), Escalar.X(60), Escalar.Y(50));
        botonRellenarStock = new BotonRellenarStock();
        botonRellenarStock.setBounds(Escalar.X(395), Escalar.Y(240), Escalar.X(283), Escalar.Y(527));
        add(sprite);
        add(coca);
        add(super8);
        add(fanta);
        add(snickers);
        add(DatosCoca);
        add(DatosSprite);
        add(DatosFanta);
        add(DatosSnickers);
        add(DatosSuper8);
        add(Saldo);
        add(productoComprado);
        add(botonCompra);
        add(botonProducto);
        add(botonVuelto);
        add(botonRellenarStock);
        add(vuelto);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Doom_Machine.png"));
            Image image = imageIcon.getImage();
            g.drawImage(image, Escalar.X(0), Escalar.Y(0), Escalar.X(950), Escalar.Y(900), null);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen del expendedor");
        }
        DatosCoca.setText("$" + ProductoYPrecios.COCACOLA.getPrecio() + "  Stock: " + exp.CocaCola.getStock());
        DatosSprite.setText("$" + ProductoYPrecios.SPRITE.getPrecio() + "  Stock: " + exp.Sprite.getStock());
        DatosFanta.setText("$" + ProductoYPrecios.FANTA.getPrecio() + "  Stock: " + exp.Fanta.getStock());
        DatosSnickers.setText("$" + ProductoYPrecios.SNICKER.getPrecio() + "  Stock: " + exp.Snickers.getStock());
        DatosSuper8.setText("$" + ProductoYPrecios.SUPER8.getPrecio() + "  Stock: " + exp.Super8.getStock());
        Saldo.setText("$" + exp.getSaldo());
        vuelto.setText("$" + exp.getVueltoInt());
    }
}
