/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorveteriastrategydecorator;

/**
 *
 * @author dti
 */
public class VanillaIceCream implements Item{
    @Override
    public String getDescription() {
        return "Sorvete de baunilha";
    }

    @Override
    public double getPrice() {
        return 7.00;
    } 
}
