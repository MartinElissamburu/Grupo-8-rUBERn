/**
 * Created by Tincho on 12-Oct-16.
 */
public class TarjetaDeCredito {
    private long creditNumber;
    private long saldo;


    public TarjetaDeCredito(long creditNumber) throws Exception {
        String creditNumber1 = String.valueOf(creditNumber);
        if (creditNumber1.length() != 16){
            throw new RuntimeException("Numero de Tarjeta invalido, debe tener 16 digitos");
        }else{
            this.creditNumber = creditNumber;
        }//hay que hacer que el codigo siga
    }
}