/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

/**
 * Client class for ListOperations. Passes a bunch of different types of lists
 * @author skaza
 */
public class GenericsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] intList = {5,6,7,8};
        Double[] doubleList = {5.0,6.0,7.0,8.0};
        String[] stringList = {"Hello","World","!"};
        
        ListOperations lo = new ListOperations();
        
        lo.print(doubleList);
        lo.print(intList);
        lo.print(stringList);
        
        
        
    }
    
}
