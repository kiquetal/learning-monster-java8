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
 * @param <T>
 */
public class FancyFormatter<T extends SimpleModel> implements TypeFormatter<T>{

    @Override
    public String accept(T something) {
       return "Something very fancy" + something.getName();
    }
    
}
