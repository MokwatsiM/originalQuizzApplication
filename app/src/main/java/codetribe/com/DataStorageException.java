/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codetribe.com.quizzapp;

/**
 * Used when the data access initialise or terminate statements could not
 * be executed
 * @author S ribeiro
 */
public class DataStorageException extends Exception {

    /**
     * Creates a new instance of <code>DataUsageException</code> without detail message.
     */
    public DataStorageException() {
    }


    /**
     * Constructs an instance of <code>DataUsageException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public DataStorageException(String msg) {
        super(msg);
    }
}
