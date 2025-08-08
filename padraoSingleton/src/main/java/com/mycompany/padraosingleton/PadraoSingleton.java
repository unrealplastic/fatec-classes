/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.padraosingleton;

/**
 *
 * @author dti
 */
public class PadraoSingleton {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        
        Teste t1 = new Teste();
        Teste t2 = new Teste();
        
        System.out.println(t1==t2);
        System.out.print(s==s1);
        
    }
}
