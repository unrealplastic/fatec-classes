package bancoaula1;

import javax.swing.JOptionPane;

public class PrincipalExcutavel {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		Conta b = new Conta(); 
		
		String mensagemOk, mensagemErro, menu;
		double valorSaque, valorDeposito, valorTranferencia;
		int opcao;
		
		mensagemOk = "Operação realizada com sucesso!";
		mensagemErro = "Operação falhou.";
		menu = "1. Atualizar titular \n2. Depositar \n3. Sacar \n4. Consultar \n5. Transferir \n0. Sair \nDigite o número da operação que deseja realizar";
		
		
		
		do {
		
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu))  ;
		
		
		
		switch (opcao) {
		case 1: //atualizar titular
			c.titular.nome = JOptionPane.showInputDialog("Digite seu nome");
			c.titular.cpf =JOptionPane.showInputDialog("Digite o CPF");
			c.numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o CPF"));
			c.titular.celular = JOptionPane.showInputDialog("Digite seu número de telefone");
			c.titular.email = JOptionPane.showInputDialog("Digite seu e-mail");
			
			JOptionPane.showMessageDialog(null, c.consultar());
			break;
			
		case 2: //depositar
			c.depositar(valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito")));
			
			JOptionPane.showMessageDialog(null, c.consultar());
			break;
			
		case 3: //sacar
			c.sacar(valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque")))  ;
			
			if(c.sacar(valorSaque)) {
				JOptionPane.showMessageDialog(null, mensagemOk);
			} else {
				JOptionPane.showMessageDialog(null, mensagemErro);
			}
			
			JOptionPane.showMessageDialog(null, c.consultar());
			
			break;
			
		case 4: //consultar
			JOptionPane.showMessageDialog(null, c.consultar());
			break;
			
		case 5:
			valorTranferencia = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da tranferencia"));
			c.transferir(valorTranferencia,b);
			
			if(c.transferir(valorTranferencia, b)) {
				JOptionPane.showMessageDialog(null, mensagemOk);
			} else {
				JOptionPane.showMessageDialog(null, mensagemErro);
			}
			
			JOptionPane.showMessageDialog(null, c.consultar());
			JOptionPane.showMessageDialog(null, b.consultar());
			
			break;
			
		case 0: //sair
			JOptionPane.showMessageDialog(null, "Até logo!");
			break;
			
		default:
			break;
		}
		
		} while (opcao!=0);

	}

}
