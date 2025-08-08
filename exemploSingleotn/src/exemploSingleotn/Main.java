package exemploSingleotn;

public class Main {

	public static void main(String[] args) {
		ConfigManager config = ConfigManager.getInstance();
		ConfigManager config2 = ConfigManager.getInstance();
		
		System.out.println(config.getPropriedades());
		System.out.println(config2.getPropriedades());
		System.out.println(config==config2);

	}

}
