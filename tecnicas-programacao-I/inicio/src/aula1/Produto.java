package aula1;

public class Produto {
	
	public int codigo;
	public String nome;
	public double valor;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double calcularTotal(int quantidade) {
		return (quantidade * this.valor);
	}
	
	 public String mostrarDados() {
		return ("Produto codigo = " + this.codigo + ", nome = " + this.nome + ", valor = " + this.valor);
	}


}
