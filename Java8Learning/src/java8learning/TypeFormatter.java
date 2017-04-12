/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8learning;

/**
 *
 * @author kiquetal
 */
public interface TypeFormatter<T> {

    String accept(T something);
}
