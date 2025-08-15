/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorveteriastrategydecorator;

/**
 *
 * @author dti
 */
public class BoletoPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado em boleto");
    }
}
