package loja;

public class Cd extends Produtos{

	private int numeroFaixas;
	
	public Cd(String nome, float preco, int numeroFaixas) {
		super(nome, preco);
		this.numeroFaixas = numeroFaixas;
		
	}
	public int getNumeroFaixas() {
		return numeroFaixas;
	}
	public void setNumeroFaixas(int numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}
	
	@Override
	public String toString() {
		return "CD: " +  super.toString() + ", número de faixas = " + this.numeroFaixas;
	}
	
}
