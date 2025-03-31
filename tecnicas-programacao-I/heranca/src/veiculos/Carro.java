package veiculos;

public class Carro extends Veiculos{
	
	private int portas;
	
	public Carro(String modelo, String marca, int portas) {
		super(modelo, marca);
		this.portas = portas;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	@Override
	public String toString() {
		return super.toString() + "\nportas = " + portas;
	}
	
	@Override
	public void tipoVeiculo() {
		System.out.println("O veículo é um carro");
	}
	
	

}
