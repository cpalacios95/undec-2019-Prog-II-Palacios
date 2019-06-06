package dominio;

public class Implementacion {
	
	private Materia nombreMateria;
	private String anioCalendario;
	private String fechaInicio;
	private String fechaFin;
	private Alumno listadoAlumnos []= new Alumno[30];
	private int indice=0;

	public Implementacion(Materia m01, String anioCalendario2, String fechaInicio2, String fechaFin2,
			Alumno[] listadoAlumnos2) {
		this.nombreMateria=m01;
		this.anioCalendario=anioCalendario2;
		this.fechaInicio=fechaInicio2;
		this.fechaFin=fechaFin2;
		this.listadoAlumnos=listadoAlumnos2;
	}

	public Materia getMateria() {
		
		return this.nombreMateria;
	}

	public String getAnioCalendario() {
		return this.anioCalendario;
	}

	public String getFechaInicio() {
		return this.fechaInicio;
	}

	public String getFechaFin() {
		return this.fechaFin;
	}

	public Alumno[] getListadoAlumnos() {
		return this.listadoAlumnos;
	}

	public boolean addAlumno(Alumno a01) {
		for (int i = 0; i < indice; i++) {
			if((listadoAlumnos[i].getNombre()==a01.getNombre() )|| (listadoAlumnos[i].getCarrera()!=a01.getCarrera()))
				return false;
		}
		listadoAlumnos[indice]=a01;
		indice++;
		return true;
	}
	
	

}
