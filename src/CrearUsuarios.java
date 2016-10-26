import java.util.ArrayList;

/**
 * Created by Tincho on 26-Oct-16.
 */
public class CrearUsuarios {
    ArrayList<Cliente> clientes = new ArrayList<>();

    public CrearUsuarios() throws Exception {
        int cantidadUsuarios = Scanner.getInt("Cuantos usuarios desea: ");
        for (int i = 0; i < cantidadUsuarios; i++) {
            Cliente cliente = new Cliente();
            clientes.add(i, cliente);
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
