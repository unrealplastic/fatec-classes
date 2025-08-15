/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanchonetestrategydecorator;

/**
 *
 * @author dti
 */
public class Juice implements Item{
    @Override
    public String getDescription() {
        return "Suco";
    }

    @Override
    public double getPrice() {
        return 7.00;
    }
}
