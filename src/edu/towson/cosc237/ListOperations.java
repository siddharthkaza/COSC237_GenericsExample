/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

/**
 *
 * @author skaza
 */
public class ListOperations implements GenericListOperations {

    @Override
    public <T> void print(T... list) {
        for (T elem:list) 
            System.out.println(elem + " ");
        System.out.println("");
    }
    
}
