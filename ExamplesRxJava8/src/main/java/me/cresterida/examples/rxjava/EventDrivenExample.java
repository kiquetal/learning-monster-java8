/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.cresterida.examples.rxjava;

/**
 *
 * @author kiquetal
 */
public class EventDrivenExample {
 
    
    
    public static void main(String args[])
    {
        
        EmailService es=new EmailServiceImpl();
        UserService ue=new UserServiceImpl();
        
        new EmailMonitor(ue, es);
        ue.addUser("kiquetal", "kiquetal@gmail.com");
        
    }
}
