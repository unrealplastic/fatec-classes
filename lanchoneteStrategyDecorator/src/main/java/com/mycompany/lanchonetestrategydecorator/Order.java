/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanchonetestrategydecorator;

/**
 *
 * @author dti
 */
public class Order {
    private Item item;
    private PaymentStrategy paymentStrategy;
    public Order(Item item){
        this.item = item;
    }
    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    
    public void processOrder(){
        System.out.println("Pedido: " + item.getDescription());
        System.out.println("Total: R$" + item.getPrice());
        paymentStrategy.pay(item.getPrice());
        
    }
}
