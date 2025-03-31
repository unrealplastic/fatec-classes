package veiculos;

public class Barco extends Veiculos{

	public Barco(String modelo, String marca) {
		super(modelo, marca);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	public void tipoVeiculo() {
		System.out.println("O veículo é um barco");
	}

}
