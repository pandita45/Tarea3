package Algoritmo;

abstract class Moneda implements Comparable<Moneda>{
    private int serieM=0;
    public static int cont=1;

    /**
     * Se le da un número de serie a las monedas, empezando por 0 y se le suma 1 a cada número de serie siguiente
     */
    public Moneda() {
        this.serieM=cont;
        cont++;
    }

    /**
     * @return devuelve número de serie de la moneda.
     */
    public int getSerieM() {
        return serieM;
    }

    /**
     * Compara esta moneda con otra moneda según su serie.
     * @param Moneda la moneda con la que se va a comparar.
     * @return un valor negativo si esta moneda tiene una serie menor que la otra,
     *         cero si son iguales, o un valor positivo si es mayor.
     */
    @Override
    public int compareTo(Moneda Moneda) {
        return this.getSerie().compareTo(Moneda.getSerie());
    }

    /**
     * @return Devuelve en forma de string la direccion de la moneda en la memoria
     */

    public String getSerie() {
        return this.toString();
    }

    /** Metodo abstracto que sirva para que cada clase moneda pueda devolver su valor
     * @return Devuelve el valor de moneda en forma de int
     */
    public abstract int getValor();
}

class Moneda1000 extends Moneda {
    public Moneda1000() {
        super();
    }
    @Override
    public int getValor() {
        return 1000;
    }
}

class Moneda500 extends Moneda {
    public Moneda500() {
        super();
    }
    @Override
    public int getValor() {
        return 500;
    }
}

class Moneda100 extends Moneda {
    public Moneda100() {
        super();
    }

    @Override
    public int getValor() {
        return 100;
    }
}
