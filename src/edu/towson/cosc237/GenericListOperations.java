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
public interface GenericListOperations {

    /**
     *
     * Prints any list
     * @param list
     */
    public <T> void print (T ... list);
}
