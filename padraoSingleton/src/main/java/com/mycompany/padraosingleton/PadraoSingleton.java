/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.padraosingleton;

import java.io.IOException;

/**
 *
 * @author dti
 */
public class PadraoSingleton {

    public static void main(String[] args) throws IOException {
        // Obtendo a instância única do gerenciador de configurações
    ConfigManager config = ConfigManager.getInstance();

        // Mostrando configurações
        System.out.println("Nome do Aplicativo: " + config.getConfig("app.name"));
    }
   
}
