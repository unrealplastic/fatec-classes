package bancoFatec;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class testeArrayList {

	public static void main(String[] args) {
		ArrayList<String> bandas = new ArrayList();
		bandas.add("Legião Urbana");
		bandas.add("Titãs");
		bandas.add("Mutantes");
		bandas.add("Dejavu");
		JOptionPane.showMessageDialog(null, bandas);

	}

}
