package byui.cit260.solarTrails.exceptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joseph
 */
public class SceneException extends Exception {

    public SceneException() {
    }

    public SceneException(String message) {
        super(message);
    }

    public SceneException(String message, Throwable cause) {
        super(message, cause);
    }

    public SceneException(Throwable cause) {
        super(cause);
    }

    public SceneException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
