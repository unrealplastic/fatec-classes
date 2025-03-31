package tipo_array;
import java.util.Scanner;
public class Vetor_ler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		//declaro o tamnho do vetor, e variaveis para conta
		double [] vetor = new double [5];
		double media, soma=0;
		
		
		//peço os números para o usuario
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = ler.nextDouble();
		} 
		
		//faço a soma dos números digitados
		for(int i=0; i<vetor.length; i++) {
			soma= soma + vetor[i];
		} 
		//realizo a conta da media
		media = soma/vetor.length;
		
		
		//imprimo o vetor que foi digitado
		for(int i=0; i<vetor.length; i++) {
			System.out.print("\t" + vetor[i]);
		}
		//escrevo a media
		System.out.printf("\t%.2f", media );
	}

}
