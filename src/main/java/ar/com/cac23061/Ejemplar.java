package ar.com.cac23061;
import java.util.ArrayList;

public class Ejemplar {
	//cada vez que se instancie un ejemplar, se le asigna un id que tendrá el valor
	//del counterId y se incrementa el counterId para que el siguiente ejemplar
	//instanciado tenga otro id diferente.
	
	//atributo de clase
	private static int generateId = 0;
	
	//atributos de instancia
	private int id;
	private String nombre;
	private int disponibles;
	private ArrayList<Cliente> prestados;
	
	//Constructor
	public Ejemplar(String _nombre, int _cantidad) {
		this.nombre = _nombre;
		this.id = Ejemplar.generateId;
		this.disponibles = _cantidad;
		this.prestados = new ArrayList<>();
		Ejemplar.generateId += 1;
	}
	//getters
	public String getNombre() {return this.nombre;}
	public int getId() {return this.id;}
	public boolean getDisponibilidad() {return disponibles > 0;}
	
	//metodos
	public void prestar(Cliente _a) {
		if (getDisponibilidad()){
			this.disponibles -= 1;
			this.prestados.add(_a);
		}		
	}
	public void recuperar(Cliente _de) {
		this.disponibles += 1;
		this.prestados.remove(_de);
	}
	public void add(int n) {
		this.disponibles += n;
	}
	public void baja(int n) {
		this.disponibles -= n;
	}
	public String toString() {
		return "ID: " +this.id + "\tNombre: " + this.nombre + "\tDisponibles: " + this.disponibles;
	}
}
