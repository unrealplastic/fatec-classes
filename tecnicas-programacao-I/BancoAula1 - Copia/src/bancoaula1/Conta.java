package bancoaula1;

public class Conta {
	
	public double saldo;
	public Cliente titular = new Cliente();
	public int numero;
	
	
	public void depositar(double valorDeposito) {
		this.saldo = this.saldo+valorDeposito;
	}
	
	public boolean sacar(double valorSaque) {
		if(valorSaque<=this.saldo) {
			this.saldo = this.saldo-valorSaque;
			return true;
		} else {
			return false;
		}	
	}
	
	public String consultar() {
		return "Conta \nSaldo = " + this.saldo + " \nTitular = " + this.titular.nome + " \nNumero  = " + this.numero + " \nCPF = " + this.titular.cpf;
	}
	public boolean transferir(double valorTranferencia, Conta outra) {
		if(this.sacar(valorTranferencia)) {
			outra.depositar(valorTranferencia);
		return true;
		}
		else {
			return false;
		}
	}

}
