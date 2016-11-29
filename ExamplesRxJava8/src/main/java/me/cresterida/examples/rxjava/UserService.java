/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.cresterida.examples.rxjava;

import rx.Observer;
import rx.functions.Action1;

/**
 *
 * @author kiquetal
 */
public interface UserService {
    
    void addUser(String name,String emailAdress);
    void subscribeToUserEvents(Observer<UserEvent>e);
    void subscribeToUserEvents(Action1<UserEvent>e);
}
