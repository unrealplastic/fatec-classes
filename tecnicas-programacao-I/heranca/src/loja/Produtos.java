package loja;

public class Produtos {
	
	protected String nome;
	protected float preco;
	
	public Produtos(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return nome + ", preço = " + preco;
	}

}
