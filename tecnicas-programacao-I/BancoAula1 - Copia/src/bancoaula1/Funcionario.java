package bancoaula1;

public class Funcionario {
	
	public String nome;
	public String departamento;
	public double salario;
	public String dataEntrada;
	public String rg;
	public boolean trabalhando;
	
	public Funcionario(boolean trabalhando) {
		trabalhando = true;
	}
	
	public double bonifica(double aumento) {
		this.salario += aumento;
		return aumento;
	}
	
	public void demite() {
		this.trabalhando = false;
	}
	
	public void ganhoAnual(double salario) {
		this.salario *= 12;
		
	}

	public String consultar() {
		return "Nome = " + nome + " \nDepartamento = " + departamento + " \nSalario = " + salario
				+ " \nData de entrada = " + dataEntrada + " \nRG = " + rg + " \n Trabalhando = " + trabalhando;
	}
	
	

}
