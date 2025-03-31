package encapsulamento;

public class Produto {
	private String nomeProduto;
	private int quantidade;
	private double valorUnitario;
	
	
	
	//Constructor
	public Produto(String nomeProduto, int quantidade, double valorUnitario) {
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	
	public Produto() { //sobrecarga
		
	}
	
	public Produto(String nomeProduto) { //sobrecarga
		this.nomeProduto = nomeProduto;
	}
	
	
	///Getters e Setters
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	@Override
	public String toString() {
		return "\nNome = " + this.nomeProduto + "\nQuantidade = "+ this.quantidade + "\nValor unitário = " + this.valorUnitario;
	}
	
	
	
}
