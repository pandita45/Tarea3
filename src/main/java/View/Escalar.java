package View;
import java.awt.*;

/**
 * Esta clase contiene metodos que obtienen las dimensiones de la pantalla donde se ejecuta el programa
 * y en base a la resolucion 1920x1080, obtienen un escalar de los pixeles para ajustar las dimensiones a cualquier pantalla
 */

public class Escalar {
    private static final int BASE_ANCHO = 1920;
    private static final int BASE_ALTO = 1080;
    private static final Dimension RESOLUCION_ACTUAL = Toolkit.getDefaultToolkit().getScreenSize();

    private static final int ACTUAL_ANCHO = RESOLUCION_ACTUAL.width;
    private static final int ACTUAL_ALTO = RESOLUCION_ACTUAL.height;

    public static int X(int x) {
        return (x * ACTUAL_ANCHO) / BASE_ANCHO;
    }

    public static int Y(int y) {
        return (y * ACTUAL_ALTO) / BASE_ALTO;
    }
}

