package exercicio;

public class InsertSort {
	public static void OrdenacaoInsert(int iVet[]) {
		int iA, iB;
		int iT;

		for (iA = 1; iA < iVet.length; iA++) {
			iT = iVet[iA];
			iB = iA - 1;
			while (iB >= 0 && iT < iVet[iB]) {
				iVet[iB + 1] = iVet[iB];
				iB--;
			}
			iVet[iB + 1] = iT;
		}
	}
}
