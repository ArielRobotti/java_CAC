package ar.com.cac23061;
//import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String [] argumentos) {
		Persona director = new Persona( 14992762,  "Juan Carlos", "Gomez");
		Biblioteca Nro1 = new Biblioteca("Almafuerte",  "Primero de Mayo 4312", director);
		
		ArrayList<Ejemplar> data = new ArrayList<Ejemplar>();
		
		data.add(new Ejemplar("-----Don Quijote------", 21));
		data.add(new Ejemplar("Los hermanos Karamasov", 12));
		data.add(new Ejemplar("-----El principito----", 7));
		data.add(new Ejemplar("-Odisea en le espacio-", 9));
		data.add(new Ejemplar("-Programacion en Java-", 14));
		data.add(new Ejemplar("---Python para todos--", 11));
		
		//probando setCatalogo
		Nro1.setCatalogo(data);
		
		for(Ejemplar e: Nro1.getCatalogo()) {
			System.out.println(e);
		}
		System.out.println("------------Agregando dos mas ----");
		Nro1.agregarEjemplar("Crimen y castigo", 22);
		Nro1.agregarEjemplar("-----Don Quijote------", 9);
		
		for(Ejemplar e: Nro1.getCatalogo()) {
			System.out.println(e);
		}
			
	}

}
