package dominio;

public class Empleado {

    private  String nombre;
    private  Double sueldo;

    public Empleado (String nombre, Double sueldo){
        this.nombre= nombre;
        this.sueldo= sueldo;
    }

    public String getNombre() {
        return nombre;
    }

}
