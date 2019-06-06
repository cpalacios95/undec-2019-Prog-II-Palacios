package dominio;

public class Carrera {
	private String nombre;
	private String abreviatura;
	private String plan;
	private Materia listaDeMaterias []= new Materia[15];
	private int contAnio=0;
	private int indice=0; 
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
	public String getNombrePrimeraLetra() {
		String n="";
		int i;
		String [] palabras= nombre.split(" ");
		for(i=0; i< palabras.length; i++)
			if(palabras[i].length()>3)
				n+=palabras[i].substring(0, 1).toUpperCase()+"";
		return n;
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

	public String getNombre() {
		return this.nombre;
	}

	public String getAbreviatura() {
		return this.abreviatura;
	}

	public String getPlan() {
		
		return this.plan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((plan == null) ? 0 : plan.hashCode());
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
		Carrera other = (Carrera) obj;
		if (plan == null) {
			if (other.plan != null)
				return false;
		} else if (!plan.equals(other.plan))
			return false;
		return true;
	}
	public boolean addMateria(Materia m01) {
		for(int i=0; i<indice; i++) {
			if(listaDeMaterias[i].equals(m01))
				return false;
		}
		for(int i=0; i<indice; i++)
			if(listaDeMaterias[i].anioacademico==m01.anioacademico)
				contAnio++;
		if(contAnio>3)
			return false;
		listaDeMaterias[indice]=m01;
		indice++;
		return true; 
	} 
	public Materia[] getMateria(AnioAcademico anio) {
		Materia [] array= new Materia [3];
		for ( int i= 0, j=0; i < indice; i++)
			if (listaDeMaterias[i].getAnio()== anio) { 
				array[j]=listaDeMaterias[i];
				j++;
			}	
		return array;
	}
	
}