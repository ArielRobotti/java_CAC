package ar.com.cac23061;

public class Persona {
	private int dni;
	private String nombre;
	private String apellido;

	public Persona(int _dni, String _nombre, String _apellido) {
		this.dni = _dni;
		this.nombre = _nombre;
		this.apellido = _apellido;
		
	}
	public int getDni() {return this.dni;}
	public String getNombre() {return this.nombre;}
	public String getApellido() {return this.apellido;}

}
