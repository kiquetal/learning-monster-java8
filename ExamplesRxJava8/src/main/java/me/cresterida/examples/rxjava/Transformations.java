/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.cresterida.examples.rxjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import rx.Observable;


/**
 *
 * @author kiquetal
 */
public class Transformations {
    public static void main(String argsp[])
    {
     
     final List<Integer> oddList=new ArrayList<>();
     final List<Integer> evenList=new ArrayList<>();
     List<Integer> listNumber= IntStream.range(1, 120).boxed().collect(Collectors.toList());
     Observable.from(listNumber)
             .groupBy((i)->{
               return 0== (i%2)? "EVEN":"ODD";  
             })
             .subscribe((group)->{
                
                 group.subscribe((x)->
                 {
                     if (group.getKey().equals("EVEN"))
                         evenList.add(x);
                     else
                         oddList.add(x);
                 });
                 
             });
        
     oddList.forEach((x)->System.out.print(x));
     
     System.out.println("\n-------------------------");
     evenList.forEach((x)->System.out.print(x));
    }
}
