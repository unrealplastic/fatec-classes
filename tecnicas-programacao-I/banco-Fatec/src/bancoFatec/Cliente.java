package bancoFatec;

public class Cliente {
	private String nome;
	private String email;
	private int celular;
	
	public Cliente(String nome, String email, int celular) {
		this.nome = nome;
		this.email = email;
		this.celular = celular;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getCelular() {
		return celular;
	}
	
	public void setCelular(int celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return nome + "\nEmail = " + email + "\nCelular = " + celular;
	}
	
	
}
