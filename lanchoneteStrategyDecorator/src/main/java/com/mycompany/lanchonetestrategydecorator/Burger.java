/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanchonetestrategydecorator;

/**
 *
 * @author dti
 */
public class Burger implements Item{
    @Override
    public String getDescription() {
        return "Hambúrguer";
    }

    @Override
    public double getPrice() {
        return 15.00;
    }
}
