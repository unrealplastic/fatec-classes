package loja;

public class Loja {

	public static void main(String[] args) {
		Livro livro = new Livro("O Pequeno Príncipe", 20.00f, "Antoine de Saint-Exupery");
		Cd cd = new Cd("Hypnotize", 35.00f, 10);
		Dvd dvd = new Dvd("Matrix", 50, 125);
		
		System.out.println(cd);
		System.out.println(dvd);
		System.out.println(livro);

	}

}
