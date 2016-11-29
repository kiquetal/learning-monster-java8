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
public interface EmailService {
    
    void sendEmail(List<String> recipientList,String fromEamail,String subject, String body);
}
