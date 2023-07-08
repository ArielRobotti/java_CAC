package ar.com.cac23061;

public class Cliente extends Persona{
	private static int generateId = 0;
	private int id;
	
	public Cliente(int _dni, String _nombre, String _apellido) {
		super(_dni, _nombre, _apellido);
		this.id = generateId;
		Cliente.generateId += 1;
	}
	public Cliente(Persona _p) {
		super(_p.getDni(), _p.getNombre(), _p.getApellido());
		this.id = generateId;
		Cliente.generateId += 1;
	}
	public int getId(){return this.id;}
	
}
