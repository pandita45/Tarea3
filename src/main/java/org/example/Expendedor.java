package org.example;

class Expendedor {
    private DepositoBebida CocaCola;
    private DepositoBebida Sprite;
    private DepositoBebida Fanta;
    private DepositoDulce Super8;
    private DepositoDulce Snickers;
    private DepositoMoneda monVu;
    private DepositoProductos recogida;

    /**
     * El constructor de expendedor crea todos los depósitos necesarios y los llena con base en un parametro "a"
     * @param a Determina la cantidad de elementos que tendrá el expendedor
     */
    public Expendedor(int a) {
        this.monVu = new DepositoMoneda();
        this.CocaCola = new DepositoBebida();
        this.Sprite = new DepositoBebida();
        this.Fanta = new DepositoBebida();
        this.Super8 = new DepositoDulce();
        this.Snickers = new DepositoDulce();
        this.recogida = new DepositoProductos();
        for (int i = 0; i < a; i++) {
            CocaCola.add(new CocaCola(100 + i));
            Sprite.add(new Sprite(200 + i));
            Fanta.add(new Fanta(300 + i));
            Super8.add(new Super8(400 + i));
            Snickers.add(new Snickers(500+i));
        }
    }

    /**
     *  El metodo comprarProducto recibe una moneda y una opción numerica
     *  Comprueba que haya stock, que alcance el dinero y que exista una moneda válida
     *  Luego llena el depósito de monedas con las correspondiéntes monedas de 100 (vuelto)
     * @param moneda  Corresponde a una moneda de 100, 500, o 1000
     * @param y       Corresponde a la opción de producto
     * @throws NoHayProductoException Cuando el depósito no tiene productos
     * @throws PagoIncorrectoException Cuando no se ingreso ninguna moneda
     * @throws PagoInsuficienteException Cuando el valor de moneda es menor al precio
     */

    public void comprarProducto(Moneda moneda, ProductoYPrecios y) throws Errores {
        if (moneda != null) {
            switch (y) {
                case COCACOLA: {
                    int precio = ProductoYPrecios.COCACOLA.getPrecio();
                    int b = CocaCola.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        int vuelto = moneda.getValor() - precio;
                        calcularVuelto(vuelto);
                        recogida.add(CocaCola.get());
                    } else if (moneda.getValor()<precio){
                        monVu.add(moneda);
                        monVu.get();
                        throw new PagoInsuficienteException();
                    } else {
                        monVu.add(moneda);
                        monVu.get();
                        throw new NoHayProductoException();
                    }
                }
                case SPRITE: {
                    int precio = ProductoYPrecios.SPRITE.getPrecio();
                    int b = Sprite.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        int vuelto = moneda.getValor() - precio;
                        calcularVuelto(vuelto);
                        recogida.add(Sprite.get());
                    } else if (moneda.getValor()<precio){
                        monVu.add(moneda);
                        monVu.get();
                        throw new PagoInsuficienteException();
                    } else {
                        monVu.add(moneda);
                        monVu.get();
                        throw new NoHayProductoException();
                    }
                }
                case FANTA: {
                    int precio = ProductoYPrecios.FANTA.getPrecio();
                    int b = Fanta.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        int vuelto = moneda.getValor() - precio;
                        calcularVuelto(vuelto);
                        recogida.add(Fanta.get());
                    } else if (moneda.getValor()<precio){
                        monVu.add(moneda);
                        monVu.get();
                        throw new PagoInsuficienteException();
                    } else {
                        monVu.add(moneda);
                        monVu.get();
                        throw new NoHayProductoException();
                    }
                }
                case SUPER8: {
                    int precio = ProductoYPrecios.SUPER8.getPrecio();
                    int b = Super8.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        int vuelto = moneda.getValor() - precio;
                        calcularVuelto(vuelto);
                        recogida.add(Super8.get());
                    } else if (moneda.getValor()<precio){
                        monVu.add(moneda);
                        monVu.get();
                        throw new PagoInsuficienteException();
                    } else {
                        monVu.add(moneda);
                        monVu.get();
                        throw new NoHayProductoException();
                    }
                }
                case SNICKER: {
                    int precio = ProductoYPrecios.SNICKER.getPrecio();
                    int b = Snickers.getStock();
                    if (moneda.getValor() >= precio && b != 0) {
                        int vuelto = moneda.getValor() - precio;
                        calcularVuelto(vuelto);
                        recogida.add(Snickers.get());
                    } else if (moneda.getValor()<precio){
                        monVu.add(moneda);
                        monVu.get();
                        throw new PagoInsuficienteException();
                    } else {
                        monVu.add(moneda);
                        monVu.get();
                        throw new NoHayProductoException();
                    }
                }
            }
        }
        monVu.add(moneda);
        throw new PagoIncorrectoException();
    }

    /**
     * Tomando el valor del vuelto, se agregan mágicamente las monedas necesarias para que se den como vuelto, de mayor a menor valor.
     * @param vuelto es el valor numérico que se debe dar de vuelto
     */
    private void calcularVuelto(int vuelto){
        for(int i = 0; i < vuelto/1000; i++){
            vuelto = vuelto - 1000;
            monVu.add(new Moneda1000());
        }
        for(int i = 0; i < vuelto/500; i ++){
            vuelto = vuelto - 500;
            monVu.add(new Moneda500());
        }

        for (int i = 0; i < vuelto / 100; i++) {
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

    public void agregarSaldo(Moneda moneda) {
        
    }
}
