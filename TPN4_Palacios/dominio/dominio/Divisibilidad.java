package dominio;

public class Divisibilidad {

		public static int num, prod=0, suma=0;

		public static boolean esDivisiblePorDos(int i) {
			num=i%10;
			if(num%2==0)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorTres(int i) {
			if(i>10)
				while(i>10) {
					num=i%10;
					prod+=num;
					i/=10;
			}
			else
				prod=i;
			prod+=i;
			if(prod%3==0)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorCuatro(int i) {
			if(i>100)
				i=i%100;
			if(i%4==0 || i==00)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorCinco(int i) {
			if(i>10)
				num=i%10;
			if(num==0 || num==5)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorSeis(int i) {
			if((i%2==0)||(i%3==0))
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorSiete(int i) {
			if(i>10) {
				num=i%10;
				num*=2;
				i/=10;
			}
			if((num-i==0) || (num-i)%7==0)
				return true;
			else 
				return false;
		}

		public static boolean esDivisiblePorOcho(int i) {
			if(i>1000)
				i=i%1000;
			if(i%8==0 || i==000)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorNueve(int i) {
			if(i>10)
				while(i>10) {
					num=i%10;
					prod+=num;
					i/=10;
			}
			else
				prod=i;
			prod+=i;
			if(prod%9==0)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorDiez(int i) {
			if(i%10==0)
				return true;
			else
				return false;
		}

		public static boolean esDivisiblePorOnce(int i) {
			int mod=0, suma2=0, mod2=0, cond=0;
			if(i<10)
				suma=i;
			while(i>10) {
				mod=i%10;
				i/=10;
				suma+=mod;
				cond=1;
				if(i<10)
					break;
				mod2=i%10;
				i/=10;
				suma2+=mod2;
				cond=0;
			}
			if(cond==1)
				suma2+=i;
			else
				suma+=i;
			if((suma-suma2==0) || (suma-suma2)%11==0)
				return true;
			else
				return false;
		}

		
}
