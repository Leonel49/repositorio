package sistema;

public class Persona {
	private String DNI;
	private String nombre;
public Persona() {}
	
	public String getNombre() {//genera nobre
		return nombre;
	}

	public void setNombre(String nombre) {//retorna nombre
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + "]";
	}
	

}
