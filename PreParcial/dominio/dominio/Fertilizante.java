package dominio;

public class Fertilizante {

	private String nombreFertilizante;
	Principio [] listaDePrincipios= new Principio[5];
	private int indice=0;
	int [] listaCompuesto= new int[5];
	public Fertilizante(String string) {
		this.nombreFertilizante= string;
	}
	public void addPrincipio(Principio principio, int compuesto) {
		listaDePrincipios[indice]=principio;
		listaCompuesto[indice]=compuesto;
		indice++;
	}
	@Override
	public String toString() {
		return nombreFertilizante.substring(0).toUpperCase();
	}
	public Integer cantPrincipios() {
		return indice;
	}
	public String principios() {
		String formato="<<";
		for (int i = 0; i < indice; i++) {
			formato= formato+listaDePrincipios[i].getCompuesto().toUpperCase();
			if(i==(indice-1))
				break;
			else
					formato+=",";
		}
		return formato+">>";
	}
	public Double getPorcentajeActivo() {
		double suma=0;
		for (int i = 0; i < indice; i++) {
			suma+=listaCompuesto[i];
		}
		return suma;
	}
	
	public Double getPrincio2(String prin) {
		double suma=0;
		for (int i = 0; i < this.indice; i++) {
			if(listaDePrincipios[i].getCompuesto().equals(prin))
				suma+=listaCompuesto[i];
		}		
		return suma;
	}
	
}
