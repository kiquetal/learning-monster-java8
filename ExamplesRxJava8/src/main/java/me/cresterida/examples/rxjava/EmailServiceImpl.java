/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.cresterida.examples.rxjava;

import java.util.List;

/**
 *
 * @author kiquetal
 */
public class EmailServiceImpl implements EmailService{

    @Override
    public void sendEmail(List<String> recipientList, String fromEamail, String subject, String body) {
        
        System.out.println("-------------------------------------------------------");
        System.out.print("From:"+ fromEamail+"\n|");
        System.out.print("///"+subject+"|");
        System.out.println("-----------------------------------");
        System.out.print(body);
    }
    
}
