package classroom;

public class Persona {

    /*final long cedula;*/
	long cedula; 
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        /*cedula = 3;*/
    }
    Persona() {
    	cedula=0;
    	nombre="";
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = "1";
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String toString() {
    	return nombre;
    }
}