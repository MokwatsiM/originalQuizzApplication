/*
 * DuplicateException.java
 *
 * Created on 22 April 2008, 11:40
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package codetribe.com.quizzapp;

/**
 *
 * @author S ribeiro
 */
public class DuplicateException extends java.lang.Exception
{
    
    /**
     * Creates a new instance of <code>DuplicateException</code> without detail message.
     */
    public DuplicateException()
    {
    }
    
    
    /**
     * Constructs an instance of <code>DuplicateException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public DuplicateException(String msg)
    {
        super(msg);
    }
}
