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
     *  El metodo comprarProducto recibe una moneda y una opción numerica.
     *  Comprueba que haya stock, que alcance el dinero y que exista una moneda válida.
     *  Luego llena el depósito de monedas con las correspondiéntes monedas de 100 (vuelto).
     * @param y Corresponde a la opción de producto.
     * @throws NoHayProductoException Cuando el depósito no tiene productos.
     * @throws PagoIncorrectoException Cuando no se ingreso ninguna moneda.
     * @throws PagoInsuficienteException Cuando el valor de moneda es menor al precio.
     */
    public void comprarProducto(ProductoYPrecios y) throws Errores {
            switch (y) {
                case COCACOLA -> compra(ProductoYPrecios.COCACOLA.getPrecio(), y, CocaCola.getStock());
                case SPRITE -> compra(ProductoYPrecios.SPRITE.getPrecio(), y, Sprite.getStock());
                case FANTA -> compra(ProductoYPrecios.FANTA.getPrecio(), y, Fanta.getStock());
                case SNICKER -> compra(ProductoYPrecios.SNICKER.getPrecio(), y, Snickers.getStock());
                case SUPER8 -> compra(ProductoYPrecios.SUPER8.getPrecio(), y, Super8.getStock());
            }
    }

    /**
     * Tomando el valor del vuelto, se agregan mágicamente las monedas necesarias para que se den como vuelto, de mayor a menor valor.
     * @param vuelto es el valor numérico que se debe dar de vuelto.
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
     * Llama a un metodo que saca las monedas del depósito.
     * @return Entrega todas las monedas correspondientes al vuelto.
     */
    public Moneda getVuelto() {
        return monVu.get();
    }

    /**
     * Llama al metodo que saca el producto del depósito de recogida.
     * @return Producto que se compró.
     */
    public Producto getProducto() {
        return recogida.get();
    }

    /**
     * Agrega monedas a la maquina expendedora.
     * @param moneda que moneda se le agregara a la moneda expendedora.
     */
    public void agregarSaldo(Moneda moneda){
        if(moneda != null) {
            this.saldo += moneda.getValor();
            System.out.println("Numero serie moneda agregada: "+moneda.getSerieM());
            monVu.add(moneda);
        }
    }

    /**
     * Rellena los depósitos vacíos de productos de la maquina expendedora.
     */
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

    /**
     * @return devuelve saldo de la maquina.
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @return devuelve la ultima opcion de producto de la máquina.
     */
    public int getOpcion(){
        return this.opcion;
    }

    /**
     * @return devuelve el vuelto luego de comprar productos.
     */
    public int getVueltoInt(){
        return vuelto;
    }

    /**
     * Metodo para comprar un producto.
     * @param precio Precio del producto que se desea comprar.
     * @param y Qué producto se desea comprar.
     * @param stock Stock del producto que se desea comprar.
     * @throws Errores en caso de no haber stock, no ser el saldo suficiente para la compra, no meter moneda o que en
     * el espacio de recogida ya alla un producto, tira un mensaje de error en la compra.
     */
    public void compra(int precio, ProductoYPrecios y, int stock) throws Errores{
        if (this.saldo >= precio && stock != 0 && recogida.getStock() == 0) {
            switch (y){
                case COCACOLA -> recogida.add(CocaCola.get());
                case FANTA -> recogida.add(Fanta.get());
                case SPRITE -> recogida.add(Sprite.get());
                case SNICKER -> recogida.add(Snickers.get());
                case SUPER8 -> recogida.add(Super8.get());
            }
            vuelto += this.saldo - precio;
            monVu.transportar(monVu,monAlmac);
            this.saldo=0;
            this.opcion = y.getId();
            calcularVuelto(vuelto);
        } else if (this.saldo < precio && this.saldo != 0){
            vuelto+=saldo;
            this.saldo=0;
            throw new PagoInsuficienteException();
        } else if (this.saldo == 0){
            throw new PagoIncorrectoException();
        } else if (recogida.getStock() != 0){
            throw new DepositoRecogidaException();
        } else {
            vuelto+=saldo;
            this.saldo=0;
            throw new NoHayProductoException();
        }
    }
}


