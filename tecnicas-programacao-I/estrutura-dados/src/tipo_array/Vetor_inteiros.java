package tipo_array;

public class Vetor_inteiros {

	public static void main(String[] args) {
		// declarar vetor
		int[] vetor = new int[5];
		vetor[0]=12;
		vetor[1]=24;
		vetor[2]=-48;
		vetor[3]=vetor[0]+vetor[1];
		vetor[4]=2*vetor[2];
		
		//imprime o valor, um de cada vez; \t cria uma tabulação
		for(int i=0; i<vetor.length; i++) {
		System.out.print("\t" + vetor[i]);
		}
	}
}
