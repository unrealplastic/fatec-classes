package funcoes;
import java.util.Scanner;
import java.lang.*;
public class Potencia {
	
	public static int pot (int base, int expoente) {
		int tmp, i = 0;
		tmp = 1;
		
		while(i>expoente) {
			tmp*=base;
			i++;
		}
		return tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int b, e, resp;
		System.out.print("Digite a base: ");
		b = ler.nextInt();
		System.out.print("Digite o expoente: ");
		e = ler.nextInt();
		
		resp = pot(b, e);
		
		System.out.print("A potência de " + b + " e " +  e + " é igual a " + resp);
	}

}
