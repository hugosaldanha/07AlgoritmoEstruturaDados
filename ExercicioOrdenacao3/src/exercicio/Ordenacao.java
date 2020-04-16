package exercicio;

public class Ordenacao {

	public static void main(String[] args) {

		int[] d = GeraVetor.gerarDesordenado(10000, 10000, 10000);
		int[] o = GeraVetor.gerarOrdenado(10000, 10000, 10000);
		
		long tempoInicialInsert;
		long tempoFinalInsert;
		long[] tempoInsert = new long[5];

		long tempoInicialQuick;
		long tempoFinalQuick;
		long[] tempoQuick = new long[5];

		long tempoInicialMerge;
		long tempoFinalMerge;
		long[] tempoMerge = new long[5];

		for (int j = 0; j < 5; j++) {
			tempoInicialInsert = System.nanoTime();
			InsertSort.OrdenacaoInsert(d);
			tempoFinalInsert = System.nanoTime();
			tempoInsert[j] = tempoFinalInsert - tempoInicialInsert;

			tempoInicialQuick = System.nanoTime();
			QuickSort.OrdenacaoQuickSort(d, 0, d.length-1);
			tempoFinalQuick = System.nanoTime();
			tempoQuick[j] = tempoFinalQuick - tempoInicialQuick;

			tempoInicialMerge = System.nanoTime();
			MergeSort.mergeSort2(d, 0, d.length-1);
			tempoFinalMerge = System.nanoTime();
			tempoMerge[j] = tempoFinalMerge - tempoInicialMerge;
		}
		System.out.println("Tempos dos Vetores Desordenados");
		System.out.println();
		System.out.println("Insert Sort");
		for (int a = 0; a < 5; a++) {
			System.out.println("Rodada: " + a + " tempo: " + (tempoInsert[a]));
		}
		System.out.println();
		System.out.println("Quick Sort");
		for (int a = 0; a < 5; a++) {
			System.out.println("Rodada: " + a + " tempo: " + (tempoQuick[a]));
		}
		System.out.println();
		System.out.println("Merge Sort");
		for (int a = 0; a < 5; a++) {
			System.out.println("Rodada: " + a + " tempo: " + (tempoMerge[a]));
		}
		for (int j = 0; j < 5; j++) {
			tempoInicialInsert = System.nanoTime();
			InsertSort.OrdenacaoInsert(o);
			tempoFinalInsert = System.nanoTime();
			tempoInsert[j] = tempoFinalInsert - tempoInicialInsert;

			tempoInicialQuick = System.nanoTime();
			QuickSort.OrdenacaoQuickSort(o, 0, d.length-1);
			tempoFinalQuick = System.nanoTime();
			tempoQuick[j] = tempoFinalQuick - tempoInicialQuick;

			tempoInicialMerge = System.nanoTime();
			MergeSort.mergeSort2(o, 0, d.length-1);
			tempoFinalMerge = System.nanoTime();
			tempoMerge[j] = tempoFinalMerge - tempoInicialMerge;
		}
		System.out.println();
		System.out.println("Tempos dos Vetores Ordenados");
		System.out.println();
		System.out.println("Insert Sort");
		for (int a = 0; a < 5; a++) {
			System.out.println("Rodada: " + a + " tempo: " + (tempoInsert[a]));
		}
		System.out.println();
		System.out.println("Quick Sort");
		for (int a = 0; a < 5; a++) {
			System.out.println("Rodada: " + a + " tempo: " + (tempoQuick[a]));
		}
		System.out.println();
		System.out.println("Merge Sort");
		for (int a = 0; a < 5; a++) {
			System.out.println("Rodada: " + a + " tempo: " + (tempoMerge[a]));
		}
	}
}