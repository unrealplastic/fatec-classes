package inicio;

public class Carro {

	public String placa;
	public int numeroChassi;
	
	public String getPlaca(){
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getNumeroChassi() {
		return numeroChassi;
	}
	
	public void setNumeroChassi(int numeroChassi) {
		this.numeroChassi = numeroChassi;
	}
	
	public String acelerar() {
		return "Acelerar";
	}
	
	public boolean frear() {
		return true;
	}

	@Override
	public String toString() {
		return "Carro: placa = " + placa + ", numeroChassi = " + numeroChassi + ", Freando? " + this.frear();
	}
	
	

}
