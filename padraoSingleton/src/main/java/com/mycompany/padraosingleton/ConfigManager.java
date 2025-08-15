/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraosingleton;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author dti
 */
public class ConfigManager {
    // Instância única do Singleton
    private static ConfigManager instance;
    
    // Atributo da classe Properties
    private Properties properties;
    
    //Construtor privado
    private ConfigManager(){
        //Instancia o atributo
        properties = new Properties();
        //Busca as configurações no arquivo
        try(InputStream file = this.getClass().getClassLoader().getResourceAsStream( "config.properties")){
            properties.load(file);
            System.out.println("Configurações carregadas com sucesso.");
        }catch(Exception e){
            System.out.println("Arquivo de configuração não encontrado!");
        }
    }
   
    // Método público para obter a instância única
    public static ConfigManager getInstance() throws IOException{
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }
    
    // Método para obter um valor da configuração
    public String getConfig(String key) {
        return properties.getProperty(key);
        }
    }