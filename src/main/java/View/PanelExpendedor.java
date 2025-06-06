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
        exp= new Expendedor(App.CANTIDAD_PRODUCTOS);
        DatosCoca = new Texto(null);
        DatosCoca.setBounds(145,300,700,30);
        DatosSprite = new Texto(null);
        DatosSprite.setBounds(145,405,700,30);
        DatosFanta = new Texto(null);
        DatosFanta.setBounds(145,510,700,30);
        DatosSuper8 = new Texto(null);
        DatosSuper8.setBounds(145,720,700,30);
        DatosSnickers = new Texto(null);
        DatosSnickers.setBounds(145,615,700,30);
        Saldo = new Texto(null);
        Saldo.setBounds(745,320,700,30);
        vuelto = new Texto(null);
        vuelto.setBounds(745,700,300,30);
        setLayout(null);
        setSize(1920,1080);
        setOpaque(false);
        coca = new PanelCocaCola();
        super8 = new PanelSuper8();
        snickers = new PanelSnickers();
        fanta = new PanelFanta();
        sprite = new PanelSprite();
        botonCompra =new BotonCompra();
        botonCompra.setBounds(133,240,230,527);
        botonProducto = new BotonRecogerProducto();
        botonProducto.setBounds(410,782,250,60);
        botonVuelto = new BotonRecogerVuelto();
        botonVuelto.setBounds(753,782,60,50);
        botonRellenarStock = new BotonRellenarStock();
        botonRellenarStock.setBounds(395,240,283,527);
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
                g.drawImage(image, 0, 0, 950, 900, null);
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

