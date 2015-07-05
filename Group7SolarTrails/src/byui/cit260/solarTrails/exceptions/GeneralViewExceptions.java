/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.exceptions;

/**
 *
 * @author Hiatt-Adam
 */
public class GeneralViewExceptions extends Exception{

    public GeneralViewExceptions() {
    }

    public GeneralViewExceptions(String message) {
        super(message);
    }

    public GeneralViewExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public GeneralViewExceptions(Throwable cause) {
        super(cause);
    }

    public GeneralViewExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
