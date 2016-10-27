import java.util.ArrayList;

/**
 * Created by Tincho on 26-Oct-16.
 */
public class CrearChoferes {
    ArrayList<Chofer> choferes = new ArrayList<>();

    public CrearChoferes() throws Exception {
        int cantidadChoferes = Scanner.getInt("Cuantos Choferes desea: ");
        for (int i = 0; i<cantidadChoferes; i++){
            Chofer chofer = new Chofer();
            choferes.add(i, chofer);
        }
    }

    public ArrayList<Chofer> getChoferes() {
        return choferes;
    }
}
