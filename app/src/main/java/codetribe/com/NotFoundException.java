/*
 * NotFoundException.java
 *
 * Created on 22 April 2008, 11:41
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package codetribe.com.quizzapp;

/**
 *
 * @author S Ribeiro
 */
public class NotFoundException extends java.lang.Exception
{
    
    /**
     * Creates a new instance of <code>NotFoundException</code> without detail message.
     */
    public NotFoundException()
    {
    }
    
    
    /**
     * Constructs an instance of <code>NotFoundException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public NotFoundException(String msg)
    {
        super(msg);
    }
}
