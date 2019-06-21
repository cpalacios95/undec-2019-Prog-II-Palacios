package dominio;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	private int [] limite= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public Fecha(int dia, int mes, int anio) {
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	public String getFechaCorta() {
		String dia=""+this.dia;
		String mes=""+this.mes;
		String anio = ""+this.anio;
		String formato="";
		if(this.mes>31 || this.mes<0)
			return formato=formato+"01/01/1900";
		if((this.dia<0) || (this.dia>limite[this.mes-1]))
			return formato=formato+"01/01/1900";
		else {
			if(dia.length()==2)
				formato=formato+dia+"/";
			else
				formato=formato+"0"+dia+"/";
		return formato+mes+"/"+anio.substring(2);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dia;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (dia != other.dia)
			return false;
		return true;
	}

	public boolean esMayorQue(Fecha fecha) {
		if(fecha.dia>this.dia || fecha.dia<this.dia)
			
		return false;
	}

}
