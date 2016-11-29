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
import java.util.List;
import java.util.ArrayList;
public class EmailMonitor {
    
    
    private EmailService em;
    public EmailMonitor(UserService us,EmailService em)
    {
        this.em=em;
        us.subscribeToUserEvents(this::callBackUserEvent);
    }
    private void callBackUserEvent(UserEvent ue)
    {
        System.out.println("-------------------Recibiendo callback---------------------");
        List<String>lis=new ArrayList<>();
        lis.add("email1");
        lis.add("email2");
        
        this.em.sendEmail(lis, ue.getEmail(), "email1Subject", "Este es un lindo email");
        
        
    }
}
