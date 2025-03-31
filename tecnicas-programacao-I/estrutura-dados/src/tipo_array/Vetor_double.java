package tipo_array;
import java.util.Scanner;
public class Vetor_double {

	public static void main(String[] args) {
		// declarar vetor
		Scanner ler = new Scanner(System.in);
		double[] vetor = new double[5];
		vetor[0]=1.2;
		vetor[1]=24.5;
		vetor[2]=-48;
		vetor[3]=vetor[0]+vetor[1];
		vetor[4]=2*vetor[2];
		
		//imprime o valor, um de cada vez; \t cria uma tabulação
		for(int i=0; i<vetor.length; i++) {
		System.out.print("\t"  + vetor[i]);
		}
		
		//pedir para usuario digitar valor e armazenar em 0
		System.out.print("\nDigite um número: ");
		vetor[0]= ler.nextDouble();	
		for(int i=0; i<vetor.length; i++) {
			System.out.print("\t" + vetor[i]);
		}
	}
}
