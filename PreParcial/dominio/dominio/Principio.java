package dominio;

public class Principio {
	private String nombre;
	private String compuesto;
	
	public Principio(String nombre, String compuesto) {
		this.nombre = nombre;
		this.compuesto = compuesto;
	}

	@Override
	public String toString() {
		return nombre.substring(0, 1).toUpperCase()+nombre.substring(1);
	}

	public String formatoFormula() {
		String formato="<<";
		if(compuesto.length()==1)
			return formato+ compuesto.substring(0).toUpperCase()+">>";
		else
			return formato+compuesto.substring(0, 1).toUpperCase()+compuesto.substring(1).toLowerCase()+">>";
		
	}

	public String getCompuesto() {
		return compuesto;
	}

	




}
