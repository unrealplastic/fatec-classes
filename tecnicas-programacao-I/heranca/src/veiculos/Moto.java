package veiculos;

public class Moto extends Veiculos{

	public Moto(String modelo, String marca) {
		super(modelo, marca);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void tipoVeiculo() {
		System.out.println("O veículo é uma moto");
	}
}
