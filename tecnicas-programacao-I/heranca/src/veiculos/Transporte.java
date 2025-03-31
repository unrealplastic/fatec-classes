package veiculos;

public class Transporte {

	public static void main(String[] args) {
		Veiculos v = new Veiculos("Volkwagen", "Gol");
		Carro c = new Carro("Celta", "Chevrolet", 4);
		
		System.out.println(c);
		
		c.tipoVeiculo();
		v.tipoVeiculo();
	}

}
