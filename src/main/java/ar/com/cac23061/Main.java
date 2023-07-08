package ar.com.cac23061;
import java.util.ArrayList;

public class Main {
	public static void main(String [] argumentos) {
		Persona director = new Persona( 14992762,  "Juan Carlos", "Gomez");
		Biblioteca nro1 = new Biblioteca("Almafuerte",  "Primero de Mayo 4312", director);
		
		ArrayList<Ejemplar> data = new ArrayList<Ejemplar>();
		
		data.add(new Ejemplar("-----Don Quijote------", 21));
		data.add(new Ejemplar("Los hermanos Karamasov", 12));
		data.add(new Ejemplar("-----El principito----", 7));
		data.add(new Ejemplar("-Odisea en le espacio-", 9));
		data.add(new Ejemplar("-Programacion en Java-", 14));
		data.add(new Ejemplar("---Python para todos--", 11));
		
		//probando setCatalogo
		nro1.setCatalogo(data);
		
		for(Ejemplar e: nro1.getCatalogo()) {
			System.out.println(e);
		}
		System.out.println("------------Agregando dos mas ----");
		nro1.agregarEjemplar("Crimen y castigo", 22);
		nro1.agregarEjemplar("-----Don Quijote------", 9);
		
		for(Ejemplar e: nro1.getCatalogo()) {
			System.out.println(e);
		}
		
		//Probando generador de personas
		//GetSome.people retorna un arreglo de 23 personas sobre el que se itera para de esta
		//forma agregar cada una de esas personas en la lista de clientes mediante el metodo add
		
		for(Persona p: GetSome.people(23)) { nro1.altaCliente(p); }
		for(Persona p: GetSome.people(177)) { nro1.altaCliente(p); }
		//Consultar si es de mal gusto hacer los for en una sola linea
		for(Cliente c : nro1.getClientes()) { System.out.println(c); }
			
	}

}
