package exercicio;

public class QuickSort {
	public static void OrdenacaoQuickSort(int iVet[], int iBaixo, int iAlto) {
		int iP, iB, iA;
		int iPivot;

		iB = iBaixo;
		iA = iAlto;
		iPivot = iVet[iBaixo];
		while (iBaixo < iAlto) {
			while ((iVet[iAlto]) >= iPivot && (iBaixo < iAlto))
				iAlto--;
			if (iBaixo != iAlto) {
				iVet[iBaixo] = iVet[iAlto];
			}
			while ((iVet[iBaixo] <= iPivot) && (iBaixo < iAlto))
				iBaixo++;
			if (iBaixo != iAlto) {
				iVet[iAlto] = iVet[iBaixo];
				iAlto--;
			}
		}
		iVet[iBaixo] = iPivot;
		iP = iBaixo;
		iBaixo = iB;
		iAlto = iA;
		if (iBaixo < iP)
			OrdenacaoQuickSort(iVet, iBaixo, iP - 1);
		if (iAlto > iP)
			OrdenacaoQuickSort(iVet, iP + 1, iAlto);

	}
}
