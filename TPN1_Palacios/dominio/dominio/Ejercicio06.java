package dominio;

import org.junit.jupiter.api.Test;

public class Ejercicio06 {
	
	public static String imprimirRectagulo(int base, int altura, char caracter) {
		String a="";
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				a=a+caracter;
			}
			if(i==altura-1)
				break;
			a=a+"\n";
		}
		return a;
	}
	
	public static String imprimirMatriz(int filas, int columnas, int base) {
		String a="";
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				a=a+base;
				base++;
				if(j==columnas-1)
					break;
				a=a+"\t";
			}
			if(i==filas-1)
				break;
			a=a+"\n";
		}
		return a;
	}
	
	
}


