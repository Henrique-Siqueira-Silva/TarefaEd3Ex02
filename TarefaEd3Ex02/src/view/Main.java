package view;
import javax.swing.JOptionPane;
import controller.TarefaEd3EX02;

public class Main {
		public static void main(String[] args) {
		TarefaEd3EX02 m = new TarefaEd3EX02();
		int num = 0;
		int procurado;
		int resp = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
		procurado = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero procurado"));
		resp = m.Ex02(num, 0, procurado);
		System.out.println(resp);
	}
}
