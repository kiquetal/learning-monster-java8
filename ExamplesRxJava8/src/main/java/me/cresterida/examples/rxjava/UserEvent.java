/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.cresterida.examples.rxjava;

import java.util.Date;

/**
 *
 * @author kiquetal
 */
public class UserEvent {

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Date getEvent() {
        return event;
    }
 
    private final String username;
    private final String email;
    private final Date event;
    
    public UserEvent(String username,String email)
    {
        this.username=username;
        this.email=email;
        this.event=new Date();
    }
    
    
}
