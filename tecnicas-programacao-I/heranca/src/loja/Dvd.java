package loja;

public class Dvd extends Produtos{
	
	private float duracao;
	
	public Dvd(String nome, float preco, float duracao) {
		super(nome, preco);
		this.duracao = duracao;
		
	}
	

	public float getDuracao() {
		this.duracao/=60;
		return duracao;
	}
	
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return "DVD: " + super.toString() + ", duração = " + this.duracao;
	}

}
