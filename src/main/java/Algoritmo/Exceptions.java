package Algoritmo;

class PagoIncorrectoException extends Errores{
  /**
   * Constructor llama a constructor de la superclase con el mensaje personalizado.
   */
  public PagoIncorrectoException(){
    super("Pago incorrecto: No se ingreso ningun moneda");
  }
}

class NoHayProductoException extends Errores{
  /**
   * Constructor llama a constructor de la superclase con el mensaje personalizado.
   */
  public NoHayProductoException(){
    super("No hay producto: No queda stock del producto solicitado");
  }
}

class PagoInsuficienteException extends Errores{
  /**
   * Constructor llama a constructor de la superclase con el mensaje personalizado.
   */
  public PagoInsuficienteException(){
    super("Pago insuficiente: Ingrese moneda de más valor");
  }
}