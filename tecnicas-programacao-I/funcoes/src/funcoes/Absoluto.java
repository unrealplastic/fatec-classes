package funcoes;
import java.util.Scanner;
public class Absoluto {
	
	public static int absoluto(int n) {
		if(n<0) {
			return n*-1;
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner(System.in);
		
		int num, i;
		
		for(i=0; i<5; i++) {
			System.out.println("Qual é o número?");
			num = ler.nextInt();
			System.out.println("O absoluto do número é: " + absoluto(num));
		}
		
		
	}

}
