/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sorveteriastrategydecorator;

/**
 *
 * @author dti
 */
public class SorveteriaStrategyDecorator {

    public static void main(String[] args) {
        Item chocolate = new ChocolateIceCream();
        chocolate = new ChocolateTopping(chocolate);
        chocolate = new Sprinkles(chocolate);
        
        Order order = new Order(chocolate);
        
        order.setPaymentStrategy(new BoletoPayment());
        
        order.processOrder();
    }
}
