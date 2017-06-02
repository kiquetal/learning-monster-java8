/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8learning;

import java8learning.dummyModels.SimpleModel;

/**
 *
 * @author kiquetal
 */
public class Java8Learning {

    public static void main(String[] args) {
        
       
        SimpleModel s=new SimpleModel("esto es mi model inside de parametric functions.");
        
        TypeFormatter<SimpleModel> n1=new FancyFormatter<>();
        System.out.println(n1.accept(s));
        
    }
    
}
