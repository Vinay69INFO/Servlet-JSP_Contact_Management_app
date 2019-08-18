/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author vinay
 */
public class InvalidPasswordException extends  RuntimeException{
    public InvalidPasswordException(){}
    
    public InvalidPasswordException(String str){
        super(str);
    }
}
