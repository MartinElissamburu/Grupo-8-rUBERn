package Exceptions;

/**
 * Created by Florencia on 11/1/16.
 */
public class AlreadyOfflineException extends RuntimeException {
    public AlreadyOfflineException(){
        super("Este chofer ya esta offline");
    }

    /**
     * Created by Florencia on 11/1/16.
     */
    public static class AlreadyOnlineException extends RuntimeException {
        public AlreadyOnlineException(){
            super("Este chofer ya esta online");
        }
    }
}
