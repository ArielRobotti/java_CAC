package ar.com.cac23061;

public class Persona {
	private int dni;
	private String nombre;
	private String segundoNombre = "";
	private String apellido;

	public Persona(int _dni, String _nombre, String _apellido) {
		this.dni = _dni;
		this.nombre = _nombre;
		this.apellido = _apellido;	
	}
	public Persona(int _dni, String _primerNombre, String _segundoNombre, String _apellido) {
		this.dni = _dni;
		this.nombre = _primerNombre;
		this.segundoNombre = _segundoNombre;
		this.apellido = _apellido;
	}
	public int getDni() {return this.dni;}
	public String getNombre() {return this.nombre;}
	public String getSegundoNombre() {return this.segundoNombre;}
	public String getApellido() {return this.apellido;}
	
	@Override
	public String toString() {
		if(this.segundoNombre == "") {
			return "DNI: "+this.dni+ "\t" + this.nombre + " " + this.apellido;
		}
		else {
			return "DNI: "+this.dni+ "\t" +this.nombre + " " + this.segundoNombre + " " + this.apellido;
		}
	}

}
