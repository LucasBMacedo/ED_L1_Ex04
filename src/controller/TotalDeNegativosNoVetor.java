package controller;

public class TotalDeNegativosNoVetor {

	public TotalDeNegativosNoVetor() {
		super ();
	}
	public int TotaldeNegativosNoVetor(int [] vetor, int i) {
		if (i == vetor.length) {
			return 0;
		}
		else if (vetor[i] < 0) {
			return 1 + TotaldeNegativosNoVetor(vetor, i + 1);
		}
			return 0 + TotaldeNegativosNoVetor(vetor, i + 1);
	}
}