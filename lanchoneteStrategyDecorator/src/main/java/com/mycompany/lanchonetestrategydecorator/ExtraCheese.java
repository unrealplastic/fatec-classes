/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanchonetestrategydecorator;

/**
 *
 * @author dti
 */
public class ExtraCheese extends ItemDecorator{
    public ExtraCheese(Item decoratedItem) {
        super(decoratedItem);
    }
    
    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + " com queijo extra";
    }

    @Override
    public double getPrice() {
        return decoratedItem.getPrice() + 2.00;
    }
    
}
