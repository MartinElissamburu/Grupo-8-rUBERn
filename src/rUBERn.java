

import java.util.ArrayList;

/**
 * Created by Tincho on 12-Oct-16.
 */
public class rUBERn {

    public static void main(String[] args) throws Exception {
        ArrayList<Chofer> choferes = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();

        int cantidadChoferes = Scanner.getInt("Cuantos choferes desea: ");
        for (int i = 0; i < cantidadChoferes; i++) {
            Chofer chofer = new Chofer();
            choferes.add(i, chofer);
        }
        int cantidadUsuarios = Scanner.getInt("Cuantos usuarios desea: ");
        for (int i = 0; i < cantidadUsuarios; i++) {
            Cliente cliente = new Cliente();
            clientes.add(i, cliente);
        }


    }
}



