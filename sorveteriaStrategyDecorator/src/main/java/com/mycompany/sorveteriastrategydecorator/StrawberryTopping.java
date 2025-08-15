/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorveteriastrategydecorator;

/**
 *
 * @author dti
 */
public class StrawberryTopping extends ItemDecorator{
    public StrawberryTopping(Item decoratedItem) {
        super(decoratedItem);
    }
    
    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + " com cobertura de morango";
    }

    @Override
    public double getPrice() {
        return decoratedItem.getPrice() + 1.50;
    }
}
