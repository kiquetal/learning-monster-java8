/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.cresterida.examples.rxjava;

import rx.Observer;
import rx.functions.Action1;
import rx.subjects.PublishSubject;

/**
 *
 * @author kiquetal
 */
public class UserServiceImpl implements UserService{

    private final PublishSubject<UserEvent> userEventSubject;
    
    public UserServiceImpl()
    {
        this.userEventSubject=PublishSubject.create();
    }
    @Override
    public void addUser(String name, String emailAdress) {
        
        
        
        UserEvent ue=new UserEvent(name, name);
        userEventSubject.onNext(ue);
        
    }

    @Override
    public void subscribeToUserEvents(Observer<UserEvent> e) {

        userEventSubject.subscribe(e);
        
        
    }

    @Override
    public void subscribeToUserEvents(Action1<UserEvent> e) {
        userEventSubject.subscribe(e);
        
    }
    
}
