import javax.swing.JOptionPane;
	
public class ProgramaDesconto {
	public static void main(String[] args) {
		String valorDaCompraStr = JOptionPane.showInputDialog("Qual o valor da compra?");
		double valorDaCompra = Double.parseDouble(valorDaCompraStr);
		String descontoStr = JOptionPane.showInputDialog("Valor percentual do desconto");
		double desconto = Double.parseDouble(descontoStr);
		double valorComDesconto = valorDaCompra - (valorDaCompra*desconto/100);
		JOptionPane.showMessageDialog(null,"Voc� pagar� "+ valorComDesconto);
		
		
	}

}
