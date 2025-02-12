package aula1;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario();
		
		f1.setNome("João");
		f1.setCargo("Repositor");
		f1.setCodigoFuncionario(1587469);
		f1.setSalarioBruto(1800.5);
		System.out.println(f1.mostrarDados());
		System.out.println(f1.calcularSalarioLiquido(200));
		
		Produto p1 = new Produto();
		
		p1.setNome("Leite");
		p1.setCodigo(2587);
		p1.setValor(5.50);
		System.out.println("\n" + p1.mostrarDados());
		System.out.printf("\n%.2f", p1.calcularTotal(10));
		
	}

}
