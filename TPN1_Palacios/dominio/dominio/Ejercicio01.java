package dominio;

public class Ejercicio01 {
	
	public static int mcd(int a, int b) {
		int aux,  r;
		if(a<b) {
			aux=b;
			b=a;
			a=aux;
		}
		while(b>0) {
			r=a%b;
			a=b;
			b=r;
		}
		return (a);
	}
	
	public static int mcm(int a, int b) {
		int x,y,aux, r;
		if(a<b) {
			aux=b;
			b=a;
			a=aux;
		}
		x=a;
		y=b;
		while(b>0) {
			r=a%b;
			a=b;
			b=r;
		}
		return (x/a)*y;
	}
	
	
}
