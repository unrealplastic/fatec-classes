/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lanchonetestrategydecorator;

/**
 *
 * @author dti
 */
public class LanchoneteStrategyDecorator {
     public static void main(String[] args) { 
        Item burger = new Burger(); 
        burger = new ExtraCheese(burger); 
        burger = new Bacon(burger); 

        Order order = new Order(burger); 
        order.setPaymentStrategy(new PixPayment());  
        order.processOrder(); 
    } 
} 

