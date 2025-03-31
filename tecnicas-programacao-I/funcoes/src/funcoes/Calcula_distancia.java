package funcoes;
import java.util.Scanner;
import java.lang.*;

public class Calcula_distancia {
	public static float dist (float px1, float px2, float py1, float py2) {
		float a, b, c, d;
		a = px1-px2; // Encontra a distancia entre os pontos x1 e x2
		b = py1-py2; // Encontra a distancia entre os pontos y1 e y2
		c= (a*a)+(b*b); // faz a conta = aˆ2 + bˆ2
		d = c*c;// Acha a raiz da equação.
		return d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		float x1, x2, y1, y2, resp;
		
		System.out.println("Digite a cordanada X do primiro ponto");
		x1 =ler.nextFloat();
		System.out.println("Digite a cordanada Y do primiro ponto");
		y1 =ler.nextFloat();
		System.out.println("Digite a cordanada X do segundo ponto");
		x2 =ler.nextFloat();
		System.out.println("Digite a cordanada Y do segundo ponto");
		y2 =ler.nextFloat();
		
		resp = dist(x1, x2, y1, y2);
		System.out.printf("\nA distância entre os pontos é de %.2f", resp);
		
	}

}
