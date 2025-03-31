package matriz;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][] = {{0,1,2},{2,4,5},{9,7,5}};
		for (int i=0; i<m.length; i++) {
			//imprime uma linha inteira da matriz
			for(int j=0; j<m.length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			//proxima linha
			System.out.println("");
		}
		
	}

}
