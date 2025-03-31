package funcoes;
import java.util.Scanner;
public class Calcula_menor {

	public static int calcula (int a, int b) {
		if (a>=b) return b;
		else return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int a, b, resp;
		
		System.out.print("Digite um número: ");
		a = ler.nextInt();
		System.out.print("Digite um número: ");
		b = ler.nextInt();
		
		resp = Math.min(a, b); //calcula(a, b);
		
		System.out.print("Menor: " + resp);
		
	}

}
