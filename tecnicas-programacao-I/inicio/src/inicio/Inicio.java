package inicio;

public class Inicio {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		carro1.setPlaca("ABC-1234");
		carro1.setNumeroChassi(789456123);
		System.out.println(carro1.acelerar());
		System.out.println(carro1.toString());
		carro1.frear();
		
	}

}
