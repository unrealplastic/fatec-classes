package bancoaula1;

import javax.swing.JOptionPane;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f = new Funcionario(true);
		int opcao;
		String menu = "-------------------------------------- \nSelecione a ação que deseja executar "
				+ "\n1. Cadastrar funcionário"
				+ "\n2. Consultar dados cadastrados"
				+ "\n3. Bonificar funcionário"
				+ "\n4. Calcular ganho anual"
				+ "\n5. Demitir funcionário"
				+ "\n6. Sair";
			
		

		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (opcao){
			case 1:
				f.nome = JOptionPane.showInputDialog("Digite seu nome");
				f.departamento = JOptionPane.showInputDialog("Digite seu departamento");
				f.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário"));
				f.dataEntrada = JOptionPane.showInputDialog("Digite sua data de entrada");
				f.rg = JOptionPane.showInputDialog("Digite seu RG");
				f.trabalhando = true;
				JOptionPane.showMessageDialog(null, f.consultar());

				
				break;
			
			case 2:
				f.consultar();
				break;
			
			case 3:
				f.bonifica(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do aumento")));
				JOptionPane.showMessageDialog(null, f.consultar());
				break;
			
			case 4:
				f.ganhoAnual(f.salario);
				JOptionPane.showMessageDialog(null, f.consultar());
				break;
				
			case 5:
				f.demite();
				if(f.trabalhando=true) {
					JOptionPane.showMessageDialog(null, "funcionário está trabalhando na empresa");
				} else {
					JOptionPane.showMessageDialog(null, "funcionário não está trabalhando na empresa");
				}
				JOptionPane.showMessageDialog(null, f.consultar());
				break;
				
			case 6:
				break;
				
			default:
				break;
			}
			
		} while (opcao!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
