package ar.com.cac23061;

public class Cliente extends Persona{
	private static int generateId = 0;
	private int id;
	
	public Cliente(int _dni, String _nombre, String _apellido) {
		super(_dni, _nombre, _apellido);
		this.id = generateId;
		Cliente.generateId += 1;
	}
	public Cliente(int _dni, String _primerNombre, String _segundoNombre, String _apellido) {
		super(_dni, _primerNombre,_segundoNombre, _apellido);
		this.id = generateId;
		Cliente.generateId += 1;
	}
	
	public Cliente(Persona _p) {
		super(_p.getDni(), _p.getNombre(),_p.getSegundoNombre(), _p.getApellido());
		this.id = generateId;
		Cliente.generateId += 1;
	}
	public int getId(){return this.id;}
	
	@Override
	public String toString() {
		return "ID: " +this.id + "\t"+super.toString();
	}
	
}
