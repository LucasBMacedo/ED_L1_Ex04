package view;

import javax.swing.JOptionPane;

import controller.TotalDeNegativosNoVetor;

public class Principal {

	public static void main(String[] args) {
		TotalDeNegativosNoVetor tnv = new TotalDeNegativosNoVetor();
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do vetor."));
		int [] vetor = new int [tamanho];
		for (int i = 0; i < tamanho; i++)  {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da posição " + i + " do vetor."));
		}
		int i = 0;
		JOptionPane.showMessageDialog(null, "A quantidade de números negativos no vetor é: " + tnv.TotaldeNegativosNoVetor(vetor, i));
	}
}