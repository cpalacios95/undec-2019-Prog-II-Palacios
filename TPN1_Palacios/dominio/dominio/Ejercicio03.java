package dominio;

public class Ejercicio03 {
	
	public static boolean numeroPerfecto(int num) {
		int suma=0;
		for (int i = 1; i < num; i++) {
			if(num%i==0)
				suma+=i;
		}
		if(suma==num)
			return true;
		else
			return false;
	}
}