import javax.swing.JOptionPane;

public class ProgramaCompras {
	public static void main(String [] args) {
		int quantMacas = Integer.parseInt(JOptionPane.showInputDialog("Quantas Ma��s?"));
		int quantMamoes = Integer.parseInt(JOptionPane.showInputDialog("Quantos Mam�es?"));
		double valorAPagar = quantMacas * 1 + quantMamoes * 3.50;
		JOptionPane.showMessageDialog(null,"Voc� pagar�" + valorAPagar);
	}

}
