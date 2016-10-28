import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Tincho on 27-Oct-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        CrearChoferes choferes = new CrearChoferes();
        CrearUsuarios usuarios = new CrearUsuarios();

        ArrayList<Chofer> arregloChoferes = choferes.getChoferes();
        ArrayList<Cliente> arregloClientes = usuarios.getClientes();
        ArrayList<Factura> arregloFacturas = new ArrayList<Factura>();

        new MenuPrincipal(arregloChoferes,arregloClientes,arregloFacturas).displayTitle();
        new MenuPrincipal(arregloChoferes,arregloClientes,arregloFacturas).displayContent();
    }
}
