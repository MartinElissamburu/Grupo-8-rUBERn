import Exceptions.InvalidCreditCardNumber;

/**
 * Created by Tincho on 12-Oct-16.
 */
public class TarjetaDeCredito {
    private long creditNumber;
    private double saldo;

    public TarjetaDeCredito() throws Exception {
        boolean numeroIn = false;
        do{
            try{
                long creditNumber = Scanner.getLong("Ingrese numero de tarjeta (requerido 16 digitos): ");
                String creditNumber1 = String.valueOf(creditNumber);
                numeroIn = true;
                if (creditNumber1.length() != 16){

                    throw new InvalidCreditCardNumber();
                }else{
                    this.creditNumber = creditNumber;
                    numeroIn = false;
                }
            }catch(InvalidCreditCardNumber e){
                System.out.println("Numero de tarjeta invalido, debe tener 16 digitos");

            }
        }while(numeroIn);
    }

    public long getCreditNumber(){
        return creditNumber;
    }

    public double getSaldo(){
        return saldo;
    }
}
