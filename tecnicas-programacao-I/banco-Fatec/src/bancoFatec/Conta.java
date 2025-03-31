package bancoFatec;

public class Conta {
	
	private int numero;
	private Cliente titular;
	private double saldo;
	
	public Conta(int numero, Cliente titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	} 
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Número = " + numero + "\nTitular = " + titular + "\nSaldo = " + saldo;
	}
	
	
	
	

}
