package aula1;

public class Funcionario {
	public int codigoFuncionario;
	public String nome;
	public String cargo;
	public double salarioBruto;
	public double percentualDescontos;
	
	
	
	
	
	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}
	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double getPercentualDescontos() {
		return percentualDescontos;
	}
	/*public void setPercentualDescontos(double percentualDescontos) {
		this.percentualDescontos = percentualDescontos;
		if(this.salarioBruto<=1518) {
			this.percentualDescontos = 0.075;
		} else if (this.salarioBruto>1518.01 && this.salarioBruto<2793.88) {
			this.percentualDescontos = 0.09;
		} else if (this.salarioBruto>2793.89 && this.salarioBruto<=4190.83) {
			this.percentualDescontos = 0.12;
		} else {
			this.percentualDescontos = 0.14;
		}
	}*/
	public double calcularSalarioLiquido(double percentualDescontoINSS) {
		//return (this.salarioBruto - (this.salarioBruto*this.percentualDescontos));
		return this.salarioBruto - percentualDescontoINSS;
	}
	
	public String mostrarDados() {
		return ("Código de Funcionário = " + this.codigoFuncionario + ", nome = " + this.nome + ", cargo = " + this.cargo + "salário bruto = " + this.salarioBruto);
	}
	
	
}
