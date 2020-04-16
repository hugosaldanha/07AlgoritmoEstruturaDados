package exercicio;

import java.util.Random;

public class GeraVetor {

	// metodo que gera o vetor desordenado
	static int[] gerarDesordenado(int minimo, int tamanho, int valorMaximo) {
		Random random = new Random();
		int[] vet = new int[tamanho];
		for (int i = minimo; i < tamanho; i++) {
			vet[i] = random.nextInt(valorMaximo);
		}
		return vet;
	}

	// metodo que gera o vetor ordenado
	static int[] gerarOrdenado(int minimo, int tamanho, int incremento) {

		int[] vet = new int[tamanho];
		int valor = minimo;
		for (int i = minimo; i < tamanho; i++) {
			vet[i] = valor;
			valor += incremento;
		}
		return vet;
	}
}
