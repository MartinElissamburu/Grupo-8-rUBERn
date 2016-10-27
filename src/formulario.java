/**
 * Created by Tincho on 21-Oct-16.
 */
public abstract class formulario {

    public void show() throws Exception {
        clearScreen();
        displayTitle();
        System.out.println("\n");
        displayContent();
    }


    protected abstract void displayContent() throws Exception;

    protected abstract void displayTitle();

    public static void clearScreen() {
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        for( int i = 0; i < 25; i++ ) {
            System.out.println("");
        }
    }
}
