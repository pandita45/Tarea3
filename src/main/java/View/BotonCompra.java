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
                if(posY > 263 && posY < 368){
                    try {
                        PanelComprador.comprador.comprar(ProductoYPrecios.COCACOLA, PanelExpendedor.exp);
                        BotonRecogerProducto.recogida = 0;
                    } catch (Errores ex) {
                        throw new RuntimeException(ex);
                    }
                }
                if(posY > 368 && posY < 473){
                    try {
                        PanelComprador.comprador.comprar(ProductoYPrecios.SPRITE, PanelExpendedor.exp);
                        BotonRecogerProducto.recogida = 0;
                    } catch (Errores ex) {
                        throw new RuntimeException(ex);
                    }
                }
                if(posY > 473 && posY < 578){
                    try {
                        PanelComprador.comprador.comprar(ProductoYPrecios.FANTA, PanelExpendedor.exp);
                        BotonRecogerProducto.recogida = 0;
                    } catch (Errores ex) {
                        throw new RuntimeException(ex);
                    }
                }
                if(posY > 578 && posY < 683){
                    try {
                        PanelComprador.comprador.comprar(ProductoYPrecios.SNICKER, PanelExpendedor.exp);
                        BotonRecogerProducto.recogida = 0;
                    } catch (Errores ex) {
                        throw new RuntimeException(ex);
                    }
                }
                if(posY > 683 && posY < 788){
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

