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
public class HarvestResourceException extends Exception{

    public HarvestResourceException() {
    }

    public HarvestResourceException(String message) {
        super(message);
    }

    public HarvestResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public HarvestResourceException(Throwable cause) {
        super(cause);
    }

    public HarvestResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
        
}
