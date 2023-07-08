package ar.com.cac23061;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Biblioteca {

	private String direccion;
	private String nombre;
	private String password;
	private Empleado director;
	private ArrayList<Ejemplar> catalogo; 
	private ArrayList<Empleado> personal;
	private ArrayList<Cliente> clientes;
	
	//----------- colocar generatePassword en un modulo separado --------
	private String generatePassword() {
		String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@-_.+/";
		Random random = new Random();
		String result = "";
		int seguridad = 16;
		for(int i=0; i<seguridad; i++) {
			result += caracteres.charAt(random.nextInt(caracteres.length()));
		}
		return result;
	}
	//------------------------------------------------------------------
	//Constructor
	public Biblioteca(String _nombre, String _direccion, Persona _director) {
		this.clientes = new ArrayList<Cliente>();
		this.direccion = _direccion;
		this.director = new Empleado(_director,"Direccion general");
		this.password = generatePassword();
		System.out.println("Guarde esta clave de seguridad en un lugar seguro\n"+this.password);
		this.nombre = _nombre;		
	}
	//Getters
	public String getDireccion() {return this.direccion;}
	public String getNombre() {return this.nombre;}
	public Empleado getDirector() {return this.director;}
	public ArrayList<Ejemplar> getCatalogo(){return this.catalogo;}
	public ArrayList<Cliente> getClientes(){return this.clientes;}
	public ArrayList<Empleado> getEmpleados(){return this.personal;}
	
	//setters
	public void setCatalogo(ArrayList<Ejemplar> _data) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Está a punto de sobreescribir todo el catálogo");
		System.out.println("Ingrese la clave de seguridad");
		String entrada = scanner.nextLine();
		if(this.password.equals(entrada)){
			this.catalogo = _data;
			System.out.println("El catalogo fué actualizado con éxito");
		}
		else {
			System.out.println("Acceso denegado");
		}
		scanner.close();
	}
	
	//metodos
	public void aceptarRenuncia(int _dni) {
		for(Empleado e : personal) {
			if(e.getDni() == _dni) {
				personal.remove(e);
				return;
			}
		}
	}
	public void contratar(Persona _p, String _departamento) {
		personal.add(new Empleado(_p, _departamento));
	}
	
	public void altaCliente(Persona _p) {
		this.clientes.add(new Cliente(_p));
	}
	public void bajaCliente(int _id) {
		for(Cliente c : this.clientes) {
			if(c.getId()==_id) {
				this.clientes.remove(c);
				return;
			}
		}
	}
	public void agregarEjemplar(String _nombre, int _cantidad) {
		for(Ejemplar e : this.catalogo) {		//Se recorre el catalogo para ver si los ejemplares
			if(e.getNombre().equals(_nombre)) { //a ingresar ya estan catalogados
				e.add(_cantidad);				//y en caso de estarlo, se le suma a los existentes
				return;							//la cantidad ingresada
			}
		}
		Ejemplar nuevo = new Ejemplar(_nombre, _cantidad); 	//En caso contrario se crea una instancia de Ejemplar
		this.catalogo.add(nuevo);							//con los valores ingresados y se la agrega al catalogo
	}
}


