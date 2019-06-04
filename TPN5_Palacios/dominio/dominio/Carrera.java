package dominio;

public class Carrera {
	private String nombre;
	private String abreviatura;
	private String plan;

	
	

	public Carrera(String nombre, String abreviatura, String plan) {
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.plan = plan;
	}
	
	public String getNombreEnMayuscula() {
		return nombre.toUpperCase();
	}

	public String getNombreOracion() {
		return nombre.substring(0, 1).toUpperCase()+ nombre.substring(1).toLowerCase();
	}

	public String getNombreAbrev() {
		int i;
		String n="";
		String [] array = nombre.split(" ");
		nombre="";
		for(i=0; i< array.length; i++) {
			if(array[i].length()>3) {
				n = array[i].substring(0,(array[i].length()<5)?array[i].length():5)+".";
				if(i+1==array.length)
					nombre+=n;
				else
					nombre+=n+" ";
			}
		}
		
		return nombre;
	}
	
	
}

