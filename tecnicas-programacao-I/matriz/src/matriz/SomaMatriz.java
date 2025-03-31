package matriz;

public class SomaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[][] = {{0,1,2,1},{2,4,5,2},{9,7,5,3},{1,2,3,4}};
		int B[][] = {{3,4,8,9},{8,4,7,9},{6,4,8,0},{8,4,2,1}};
		int soma[][] = new int [4][4];
		
		//matriz A
		System.out.println("Matriz A");
		for (int i=0; i<A.length; i++) {
			//imprime uma linha inteira da matriz
			for(int j=0; j<A.length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			//proxima linha
			System.out.println("");
		}
		
		
		//matriz B
		System.out.println("Matriz B");
		for (int i=0; i<B.length; i++) {
			//imprime uma linha inteira da matriz
			for(int j=0; j<B.length; j++) {
				System.out.print(B[i][j] + "\t");
			}
			//proxima linha
			System.out.println("");
		
		}
		
		//somar as matrizes
		System.out.println("Soma");
		for(int i=0; i<soma.length; i++) {
			for(int j=0; j<soma.length; j++) {
				soma[i][j] = A[i][j] + B[i][j];
				System.out.print(soma[i][j] + "\t");
			}
			System.out.println("");
		}
		
	}
}
