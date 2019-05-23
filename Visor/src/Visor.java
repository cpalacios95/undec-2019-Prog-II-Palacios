public class Visor {
	private String nombre;
	private String apellido;
	private byte hora;
	private byte minuto;
	private byte segundo;
	private static String inicioSaludo="Hola, ";
	public Visor(String nombre, String apellido, byte hora, byte minuto, byte segundo) {
		this.nombre=nombre;
		this.nombre=apellido;
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public byte getHora() {
		return hora;
	}
	public void setHora(byte hora) {
		this.hora = hora;
	}
	public byte getMinuto() {
		return minuto;
	}
	public void setMinuto(byte minuto) {
		this.minuto = minuto;
	}
	public byte getSegundo() {
		return segundo;
	}
	public void setSegundo(byte segundo) {
		this.segundo = segundo;
	}
	private String Validar() {
		byte hora;
		String array;
		hora=this.hora%12;
		array= array + hora;
		array= array+":"+this.minuto;
		array= array+":"+this.segundo;
		array=array+" "+(this.hora<12?"AM": "PM");
		return array;
	}
	private String Mensaje() {
		String array;
		if((this.hora>=0)&&(this.hora<6))
			return ("Buenas Noches");
		else {
			if((this.hora>5)&&(this.hora<14))
				return ("Buenos Dias");
			else {
				if((this.hora>14)&&(this.hora<21))
					return ("Buenas Tardes");
				else
					return ("Buenas Noches");
			}
		}
				
	}
	public String saludoCompleto() {
		return this.inicioSaludo+this.nombre+" "+this.apellido+" "+ this.Validar+" "+ this.Mensaje();  
	}
}
