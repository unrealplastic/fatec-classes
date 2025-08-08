package exemploSingleotn;

public class ConfigManager {
    private static ConfigManager instance;
    private String properties = "\n app.name=Sistema Empresarial \n app.version=1.0 \n app.language=pt-BR \n currency=BRL \n timeout=300 segundos";
    
    private ConfigManager(){
        
    }
    
    public static ConfigManager getInstance(){
        if(instance == null){
            instance = new ConfigManager();
        }
        return instance;
    }
    
    public String getPropriedades() {
    	return properties;
    }
}