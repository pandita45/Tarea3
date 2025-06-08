package View;

import Algoritmo.Comprador;
import Algoritmo.Errores;
import Algoritmo.ProductoYPrecios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonCompra extends JButton {
    double posY;
    public BotonCompra() {
        super();
        setBackground(new Color(0, 128, 255, 100)); // Color azul con opacidad (100/255)
        setOpaque(false);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                posY = MouseInfo.getPointerInfo().getLocation().getY();
                if(posY > Escalar.Y(263) && posY < Escalar.Y(368)){
                    try {
                        PanelComprador.comprador.comprar(ProductoYPrecios.COCACOLA, PanelExpendedor.exp);
                        BotonRecogerProducto.recogida = 0;
                    } catch (Errores ex) {
                        throw new RuntimeException(ex);
                    }
                }
                if(posY > Escalar.Y(368) && posY < Escalar.Y(473)){
                    try {
                        PanelComprador.comprador.comprar(ProductoYPrecios.SPRITE, PanelExpendedor.exp);
                        BotonRecogerProducto.recogida = 0;
                    } catch (Errores ex) {
                        throw new RuntimeException(ex);
                    }
                }
                if(posY > Escalar.Y(473) && posY < Escalar.Y(578)){
                    try {
                        PanelComprador.comprador.comprar(ProductoYPrecios.FANTA, PanelExpendedor.exp);
                        BotonRecogerProducto.recogida = 0;
                    } catch (Errores ex) {
                        throw new RuntimeException(ex);
                    }
                }
                if(posY > Escalar.Y(578) && posY < Escalar.Y(683)){
                    try {
                        PanelComprador.comprador.comprar(ProductoYPrecios.SNICKER, PanelExpendedor.exp);
                        BotonRecogerProducto.recogida = 0;
                    } catch (Errores ex) {
                        throw new RuntimeException(ex);
                    }
                }
                if(posY > Escalar.Y(683) && posY < Escalar.Y(788)){
                    try {
                        PanelComprador.comprador.comprar(ProductoYPrecios.SUPER8, PanelExpendedor.exp);
                        BotonRecogerProducto.recogida = 0;
                    } catch (Errores ex) {
                        throw new RuntimeException(ex);
                    }
                }
                Ventana.actualizar();
            }
        });
    }
}
