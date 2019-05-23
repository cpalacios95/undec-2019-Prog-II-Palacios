package dominio;

public class Ejercicio05 {

	public static int sumaIndicesIgualesAValorDado(int [][] A, int valorDado) {
		int suma=0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				if(A[i][j]==valorDado) {
					suma+=i;
					suma+=j;
				}
			}
		}
		return suma;
	}
}
