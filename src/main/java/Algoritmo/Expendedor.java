package Algoritmo;
public class Expendedor {
    public DepositoBebida CocaCola;
    public DepositoBebida Sprite;
    public DepositoBebida Fanta;
    public DepositoDulce Super8;
    public DepositoDulce Snickers;
    private DepositoMoneda monVu;
    private DepositoProductos recogida;
    private DepositoMoneda monAlmac;
    private int opcion = 0;
    public int saldo=0;
    public static int serieP=0;
    private int stock;
    public static int vuelto = 0;

    /**
     * El constructor de expendedor crea todos los depósitos necesarios y los llena con base en un parametro "a"
     * @param a Determina la cantidad de elementos que tendrá el expendedor
     */
    public Expendedor(int a) {

        this.monAlmac = new DepositoMoneda();
        this.monVu = new DepositoMoneda();
        this.CocaCola = new DepositoBebida();
        this.Sprite = new DepositoBebida();
        this.Fanta = new DepositoBebida();
        this.Super8 = new DepositoDulce();
        this.Snickers = new DepositoDulce();
        this.recogida = new DepositoProductos();
        this.stock=a;
        for (int i = 0; i < a; i++) {
                CocaCola.add(new CocaCola(serieP++));
                Sprite.add(new Sprite(serieP++));
                Fanta.add(new Fanta(serieP++));
                Super8.add(new Super8(serieP++));
                Snickers.add(new Snickers(serieP++));

        }
    }

    /**
     *  El metodo comprarProducto recibe una moneda y una opción numerica
     *  Comprueba que haya stock, que alcance el dinero y que exista una moneda válida
     *  Luego llena el depósito de monedas con las correspondiéntes monedas de 100 (vuelto)
     * @param y       Corresponde a la opción de producto
     * @throws NoHayProductoException Cuando el depósito no tiene productos
     * @throws PagoIncorrectoException Cuando no se ingreso ninguna moneda
     * @throws PagoInsuficienteException Cuando el valor de moneda es menor al precio
     */

    public void comprarProducto(ProductoYPrecios y) throws Errores {
            switch (y) {
                case COCACOLA: {
                    int precio = ProductoYPrecios.COCACOLA.getPrecio();
                    int b = CocaCola.getStock();
                    if (this.saldo >= precio && b != 0) {
                        vuelto = this.saldo - precio;
                        recogida.add(CocaCola.get());
                        monVu.transportar(monVu,monAlmac);
                        this.saldo=0;
                        this.opcion = y.getId();
                        calcularVuelto(vuelto);
                    } else if (this.saldo < precio){
                        throw new PagoInsuficienteException();
                    } else {
                        throw new NoHayProductoException();
                    }
                    break;
                }

                case SPRITE: {
                    int precio = ProductoYPrecios.SPRITE.getPrecio();
                    int b = Sprite.getStock();
                    if (this.saldo >= precio && b != 0) {
                        vuelto = this.saldo - precio;
                        recogida.add(Sprite.get());
                        monVu.transportar(monVu,monAlmac);

                        this.saldo=0;
                        this.opcion = y.getId();
                        calcularVuelto(vuelto);
                    } else if (this.saldo < precio){
                        throw new PagoInsuficienteException();
                    } else {
                        throw new NoHayProductoException();
                    }
                    break;
                }

                case FANTA: {
                    int precio = ProductoYPrecios.FANTA.getPrecio();
                    int b = Fanta.getStock();
                    if (this.saldo >= precio && b != 0) {
                        vuelto = this.saldo - precio;
                        recogida.add(Fanta.get());
                        monVu.transportar(monVu,monAlmac);
                        this.saldo=0;
                        this.opcion = y.getId();
                        calcularVuelto(vuelto);
                    } else if (this.saldo < precio){
                        throw new PagoInsuficienteException();
                    } else {
                        throw new NoHayProductoException();
                    }
                    break;
                }

                case SUPER8: {
                    int precio = ProductoYPrecios.SUPER8.getPrecio();
                    int b = Super8.getStock();
                    if (this.saldo >= precio && b != 0) {
                        vuelto = this.saldo - precio;
                        recogida.add(Super8.get());
                        monVu.transportar(monVu,monAlmac);
                        this.saldo=0;
                        this.opcion = y.getId();
                        calcularVuelto(vuelto);
                    } else if (this.saldo < precio){
                        throw new PagoInsuficienteException();
                    } else {
                        throw new NoHayProductoException();
                    }
                    break;
                }

                case SNICKER: {
                    int precio = ProductoYPrecios.SNICKER.getPrecio();
                    int b = Snickers.getStock();
                    if (this.saldo >= precio && b != 0) {
                        vuelto = this.saldo - precio;
                        recogida.add(Snickers.get());
                        monVu.transportar(monVu,monAlmac);
                        this.saldo=0;
                        this.opcion = y.getId();
                        calcularVuelto(vuelto);
                    } else if (this.saldo < precio){
                        throw new PagoInsuficienteException();
                    } else {
                        throw new NoHayProductoException();
                    }
                    break;
                }
            }
    }

    /**
     * Tomando el valor del vuelto, se agregan mágicamente las monedas necesarias para que se den como vuelto, de mayor a menor valor.
     * @param vuelto es el valor numérico que se debe dar de vuelto
     */
    private void calcularVuelto(int vuelto){
        int iteraciones = vuelto;
        for(int i = 0; i < iteraciones/1000; i++){
            monVu.add(new Moneda1000());
            vuelto = vuelto - 1000;
        }
        iteraciones = vuelto;
        for(int i = 0; i < iteraciones/500; i ++){
            vuelto = vuelto - 500;
            monVu.add(new Moneda500());
        }
        iteraciones = vuelto;
        for (int i = 0; i < iteraciones / 100; i++) {
            monVu.add(new Moneda100());
        }
    }
    /**
     * getvuelto Llama a un metodo que saca las monedas del depósito.
     * @return Entrega todas las monedas correspondientes al vuelto
     */
    public Moneda getVuelto() {
        return monVu.get();
    }

    /**
     * getProducto llama al metodo que saca el producto del deposito de recogida.
     * @return Producto que se compró
     */
    public Producto getProducto(){
        return recogida.get();
    }
    public void agregarSaldo(Moneda moneda){
        if(moneda != null) {
            this.saldo += moneda.getValor();
            monVu.add(moneda);
        }
    }
    public void rellenar(){
        if(CocaCola.Deposito.isEmpty()) {
            for (int i = 0; i < stock; i++) {
                CocaCola.add(new CocaCola(serieP++));
            }
        }
        if (Sprite.Deposito.isEmpty()) {
            for (int i = 0; i < stock; i++) {
                Sprite.add(new Sprite(serieP++));
            }
        }

        if (Fanta.Deposito.isEmpty()) {
            for (int i = 0; i < stock; i++) {
                Fanta.add(new Fanta(serieP++));
            }
        }

        if (Super8.Deposito.isEmpty()) {
            for (int i = 0; i < stock; i++) {
                Super8.add(new Super8(serieP++));
            }
        }

        if (Snickers.Deposito.isEmpty()) {
            for (int i = 0; i < stock; i++) {
                Snickers.add(new Snickers(serieP++));
            }
        }
    }

    public int getSaldo() {
        return saldo;
    }
    public int getOpcion(){
        return this.opcion;
    }
    public int getVueltoInt(){
        return vuelto;
    }
}


