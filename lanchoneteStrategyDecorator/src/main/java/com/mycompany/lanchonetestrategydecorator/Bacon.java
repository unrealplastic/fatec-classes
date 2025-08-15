/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanchonetestrategydecorator;

/**
 *
 * @author dti
 */
public class Bacon extends ItemDecorator{
    public Bacon(Item decoratedItem) {
        super(decoratedItem);
    }
    
    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + " com bacon";
    }

    @Override
    public double getPrice() {
        return decoratedItem.getPrice() + 3.00;
    }
}
