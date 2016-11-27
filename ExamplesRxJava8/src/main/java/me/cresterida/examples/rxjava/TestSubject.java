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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import rx.Observable;
import rx.subjects.BehaviorSubject;
public class TestSubject {


    public static void main(String args [])
    {
        
        
        List<String> listaParaConsumir=new ArrayList<>();
        listaParaConsumir.add("param1");
        listaParaConsumir.add("param2");
        int d=0;
        Observable.from(listaParaConsumir)
                .scan(new HashMap<String, String>(),(acumm,something)->{
                       
                    acumm.put("algo1"+something, something);
                    return acumm;
                })
                .subscribe( (onNext)->{
                   
                      System.out.println("lol es esto"+onNext);
                });
        
    }
    
  
    
    
    
}
