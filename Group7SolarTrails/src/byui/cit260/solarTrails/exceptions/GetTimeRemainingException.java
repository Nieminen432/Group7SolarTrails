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
public class GetTimeRemainingException extends Exception{

    public GetTimeRemainingException() {
    }

    public GetTimeRemainingException(String message) {
        super(message);
    }

    public GetTimeRemainingException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetTimeRemainingException(Throwable cause) {
        super(cause);
    }

    public GetTimeRemainingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
