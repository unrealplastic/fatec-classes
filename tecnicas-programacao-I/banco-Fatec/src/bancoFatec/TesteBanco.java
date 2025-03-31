package bancoFatec;

import javax.swing.JOptionPane;

public class TesteBanco {

	public static void main(String[] args) {
		
		//criar ArrayList com 3 contas;
		
		Conta c1 = new Conta(123, new Cliente("Nicole", "nic@gmail.com", 1234567897), 1000); //criamos o cliente dentro do constructor de conta para evitar que dois ponteiros apontem para o mesmo lugar
		JOptionPane.showMessageDialog(null, c1);
	}

}
