/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanchonetestrategydecorator;

/**
 *
 * @author dti
 */
public abstract class ItemDecorator implements Item{
    protected Item decoratedItem;
    
    public ItemDecorator(Item decoratedItem){
        this.decoratedItem = decoratedItem;
    }
    
    @Override
    public String getDescription() {
        return decoratedItem.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedItem.getPrice();
    }
}
