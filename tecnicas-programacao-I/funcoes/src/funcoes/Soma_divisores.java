package funcoes;
import java.util.Scanner;
public class Soma_divisores {
	public static int somdiv(int n) {
		int i = 1, soma = 0;
		System.out.println("divisores de " + n);
		
		while(i<n) {
			if(n% i == 0) {
				soma+=i;
				System.out.println(i);
			}
			i++;
		}
		return soma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int num, i;
		
		for(i=0; i<5; i++) {
			System.out.println(i+1);
			num = ler.nextInt();
			System.out.println(somdiv(num));
		}
	}

}
