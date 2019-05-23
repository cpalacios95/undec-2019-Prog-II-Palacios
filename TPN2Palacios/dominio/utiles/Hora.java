package utiles;

public class Hora {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora(int hora, int minuto, int segundo) {
		if(hora>23 || hora<0)
			hora=0;
		this.hora=hora;
		if(minuto>59 || minuto<0)
			minuto=0;
		this.minuto=minuto;
		if(segundo>59 || segundo<0)
			segundo=0;
		this.segundo=segundo;
	}
	
	public int getHora() {

		return this.hora;
	}
	public int getMinuto() {
		return this.minuto;
	}
	public int getSegundo() {
		return this.segundo; 
	}
	
	public Hora() {
		super();
	}
	public String getHoraConFormato(){
		return Utiles.LPAD(this.hora, 2)+":"+Utiles.LPAD(this.minuto, 2)+":"+Utiles.LPAD(this.segundo, 2);
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public String addHora(int hora) {
		int aux=0;
		if(hora>23) {
			aux=hora/24;
			this.hora+=hora;
			this.hora= this.hora-(24*aux);
		}
		else {
			if(this.hora+=hora>24)
				this.hora-=24;
			else
				this.hora+=hora;
		}
		return getHoraConFormato();
	}

	public String addMinuto(int minuto) {
		int c=0;
		this.minuto+=minuto;
		if(this.minuto>=60) {
			c=1;
			this.minuto-=60;
		}
		if(c==1)
			this.hora+=1;
		return getHoraConFormato();
	}

	public String addSegundo(int segundo) {
		this.segundo+=segundo;
		if(this.segundo>=60)
			this.segundo-=60;
		return getHoraConFormato();
	}
	
	
}
