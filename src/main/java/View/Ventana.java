package View;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    private PanelPrincipal principal;
    private static Ventana instancia;

    /** Se agrega el panel principal
     * Se maximiza la ventana y se bloquea su deformacion
     */
    private Ventana() {
        super();
        setLayout(null);
        getContentPane().setBackground(Color.decode("#090925"));
        principal = new PanelPrincipal();
        add(principal);

        setTitle("Doom_MachineV9");
        setSize(Escalar.X(1920), Escalar.Y(1080));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

    }

    /**
     * Es un singleton, crea una instancia de ventana
     * @return Devuelve la instancia si ya esta creada, en caso contrario la crea y la devuelve
     */

    public static Ventana getInstancia() {
        if (instancia == null) {
            instancia = new Ventana();
        }
        return instancia;
    }

    /**
     * Fuerza a la instancia creada anteriormente a hacer repaint para actualizar lo que hay en pantalla
     * Es un metodo llamado la final de muchos otros metodos para mantener acutalizada la informacion en pantalla
     */
    public static void actualizar(){
        instancia.repaint();
    }
}
