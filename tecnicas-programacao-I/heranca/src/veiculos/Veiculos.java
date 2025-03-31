package veiculos;

public class Veiculos {
	private String marca;
	 private String modelo;
	 
	 public Veiculos() {
		 
	 } 
	 
	 public Veiculos(String modelo, String marca) {
	 this.modelo = modelo;
	 this.marca = marca;
	 }
	 
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "marca = " + marca + "\nmodelo = " + modelo;
	}

	public void tipoVeiculo()
	 {
	 System.out.println("O veículo é um carro, barco ou moto");
	 }

}
