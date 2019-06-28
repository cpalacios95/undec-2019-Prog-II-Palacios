package dominio;

public class Compuesto {

	private String nombreCompuesto;
	Fertilizante [] listaFertilizantes= new Fertilizante[5];
	private String unidad;
	private int indice=0;
	int [] cantidadFertilizante= new int[5];
	public Compuesto(String nombre) {
		this.nombreCompuesto= nombre;
	}

	public void addFertilizante(Fertilizante f01, int cantidad, String unidad2) {
		listaFertilizantes[indice]=f01;
		cantidadFertilizante[indice]=cantidad;
		unidad=unidad2;
		indice++;
	}

	public Boolean tienePrincipio(String string) {
		String formato="<<";
		for (int i = 0; i < this.indice; i++) {
			formato=formato+listaFertilizantes[i].listaDePrincipios[i].getCompuesto().toUpperCase()+">>";
			if(formato.equals(string))
				return true;
			formato="<<";
		}
		return false;
	}

	public Double getConcentracionPrincipio(String string) {
		double suma=0;
		String formato="<<";
		for (int i = 0; i < this.indice; i++) {
			formato=formato+listaFertilizantes[i].listaDePrincipios[i].getCompuesto().toUpperCase()+">>";
			if(formato.equals(string))
				suma+=listaFertilizantes[i].listaCompuesto[i];
			formato="<<";
		}
		return suma;
	}

	public String getCantidadReal(String string) {
		double suma=0;
		String formato="<<";
		for (int i = 0; i < this.indice; i++) {
			formato=formato+listaFertilizantes[i].listaDePrincipios[i].getCompuesto()+">>";
			if(formato.equals(string))
				suma+=listaFertilizantes[i].listaCompuesto[i];
			formato="<<";
		}
		suma= suma/10;
		return suma+" "+unidad;
	}

	
}
