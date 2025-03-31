package matriz;

public class Funcao_imprimir {
	
	public static void imprimirMatriz(int m[][]) {
		for (int i=0; i<m.length; i++) {
			//imprime uma linha inteira da matriz
			for(int j=0; j<m.length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			//proxima linha
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[][] = {{0,1,2,1},{2,4,5,2},{9,7,5,3},{1,2,3,4}};
		int B[][] = {{3,4,8,9},{8,4,7,9},{6,4,8,0},{8,4,2,1}};
		int soma[][] = new int [4][4];
		
		//matriz A
		System.out.println("Matriz A");
		for (int i=0; i<A.length; i++) {
		}
		//imprimir matriz
		imprimirMatriz(A);
		
		
		//matriz B
		System.out.println("Matriz B");
		for (int i=0; i<B.length; i++) {
		}
		//imprimir matriz
		imprimirMatriz(B);
		
		//somar as matrizes
		System.out.println("Soma");
		for(int i=0; i<soma.length; i++) {
			for(int j=0; j<soma.length; j++) {
				soma[i][j] = A[i][j] + B[i][j];
			}
		}
		//imprimir matriz
		imprimirMatriz(soma);
	}
}
