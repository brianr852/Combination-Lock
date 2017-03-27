/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinationlockclient;

/**
 *
 * @author brian
 */
@SuppressWarnings("serial")
public class CombinationLockInitializationException extends RuntimeException
{
    public CombinationLockInitializationException(String errorMessage)
    {
        super(errorMessage);
    }
}