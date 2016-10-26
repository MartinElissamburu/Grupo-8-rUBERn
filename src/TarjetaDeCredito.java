/**
 * Created by Tincho on 12-Oct-16.
 */
public class TarjetaDeCredito {
    private long creditNumber;
    private double saldo;

    public TarjetaDeCredito(long creditNumber) throws Exception {
        String creditNumber1 = String.valueOf(creditNumber);
        boolean tarjeta16 = true;
        while(tarjeta16){
            if (creditNumber1.length() != 16){
                throw new RuntimeException("Numero de Tarjeta invalido, debe tener 16 digitos");
            }else{
                this.creditNumber = creditNumber;
                tarjeta16 = false;
            }
        }//hay que hacer que el codigo siga
    }

    public long getCreditNumber(){
        return creditNumber;
    }

    public double getSaldo(){
        return saldo;
    }
}
