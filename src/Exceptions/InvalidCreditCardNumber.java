package Exceptions;

/**
 * Created by Tincho on 02-Nov-16.
 */
public class InvalidCreditCardNumber extends Exception {
    public InvalidCreditCardNumber() {
        super("Numero de tarjeta invalido, debe tener 16 digitos");
    }
}
