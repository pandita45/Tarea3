package Algoritmo;

import javax.swing.*;

class PagoIncorrectoException extends Errores{
  /**
   * Constructor llama a constructor de la superclase con el mensaje personalizado.
   */
  public PagoIncorrectoException(){
    super("Pago incorrecto: No se ingreso ninguna moneda");
    JOptionPane.showMessageDialog(null, "No se ingreso ninguna moneda", "PagoIncorrectoException", JOptionPane.ERROR_MESSAGE);
  }
}

class NoHayProductoException extends Errores{
  /**
   * Constructor llama a constructor de la superclase con el mensaje personalizado.
   */
  public NoHayProductoException(){
    super("No hay producto: No queda stock del producto solicitado");
    JOptionPane.showMessageDialog(null, "No queda stock del producto solicitado", "NoHayProductoException", JOptionPane.ERROR_MESSAGE);
  }
}

class PagoInsuficienteException extends Errores{
  /**
   * Constructor llama a constructor de la superclase con el mensaje personalizado.
   */
  public PagoInsuficienteException(){
    super("Pago insuficiente: Ingrese moneda de más valor");
    JOptionPane.showMessageDialog(null, "Ingrese moneda de más valor", "PagoInsuficienteException", JOptionPane.ERROR_MESSAGE);
  }
}

class DepositoRecogidaException extends Errores{
  /**
   * Constructor llama a constructor de la superclase con el mensaje personalizado.
   */
  public DepositoRecogidaException(){
    super("Deposito de recogida lleno: Porfavor recoga producto antes de comprar otro");
    JOptionPane.showMessageDialog(null, "Recoga producto antes de comprar otro", "DepositoRecogidaException", JOptionPane.ERROR_MESSAGE);
  }
}