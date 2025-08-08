/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraosingleton;

/**
 *
 * @author dti
 */
public class Singleton {
    private static Singleton instance;
    
    private Singleton(){    
    }
    
    public static synchronized Singleton getInstance(){ //synchronized garante que apenas uma instância seja criada
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
