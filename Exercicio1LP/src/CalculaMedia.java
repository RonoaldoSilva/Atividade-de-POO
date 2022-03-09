import javax.swing.JOptionPane;

public class CalculaMedia {
	public static void main(String[] args) {
		String nota1Str = JOptionPane.showInputDialog("Digite a nota ");
		String nota2Str = JOptionPane.showInputDialog("Digite a nota 2");
		double nota1 = Double.parseDouble(nota1Str);
		double nota2 = Double.parseDouble(nota2Str);
		double media = (nota1+nota2)/2;
		System.out.println("A média é "+media);
	}

}
