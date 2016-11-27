/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.cresterida.examples.rxjava;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import rx.Subscriber;
import java.util.function.BiFunction;
import rx.Observable;

/**
 *
 * @author kiquetal
 */
public class Testing {
    CompletableFuture d;
    
    String kiquetal="hola";
    Stream rx=Stream.of(kiquetal);
    
    
    BiFunction<String,String,String> bt=(s,t)->
    {
        return s+t;
    };
    public static void main(String args[])
    {
        List<Integer>listaInt=new ArrayList<>();
        listaInt.add(3);
        listaInt.add(123);
        Observable.from(listaInt)
                .subscribe((num) ->
                {
                    System.out.println("Num :"+num+Thread.currentThread().getName());
                });

    }
}
