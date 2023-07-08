package ar.com.cac23061;

public class Empleado extends Persona{
	
	private String departamento;

	public Empleado(int _dni, String _nombre, String _apellido, String departamento) {
		super(_dni, _nombre, _apellido);
		this.departamento = departamento;
	}
	public Empleado(Persona _p, String departamento) {
		super(_p.getDni(), _p.getNombre(), _p.getApellido());
		
	}
	public String getDepartamento() {return this.departamento;}

}
