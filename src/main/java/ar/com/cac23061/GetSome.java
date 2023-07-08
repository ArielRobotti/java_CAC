package ar.com.cac23061;

import java.util.Random;

public class GetSome {
	private static String[] nombres = {"Juan", "Ana", "Pedro", "María", "Luis", "Sofía", "Carlos", "Laura", "Andrés", "Valeria",
		    "Diego", "Camila", "Javier", "Isabella", "Daniel", "Mariana", "Miguel", "Lucía", "Alejandro", "Julia",
		    "José", "Paula", "Fernando", "Emma", "Roberto", "Martina", "Ricardo", "Catalina", "Gabriel", "Renata",
		    "Andrea", "Manuel", "Mónica", "Sebastián", "Valentina", "Ignacio", "Carolina", "Hugo", "Natalia", "Emilio",
		    "Abril", "Francisco", "Clara", "Óscar", "Elena", "Raúl", "Florencia", "Hector", "Adriana", "Felipe",
		    "Marina", "Raquel", "Diana", "Tomás", "Gabriela", "Gonzalo", "Isabel", "Cristian", "Patricia", "Eduardo",
		    "Sol", "Pablo", "Luna", "Lorenzo", "Juana", "Alonso", "Victoria", "René", "Olivia", "Jorge",
		    "Antonella", "Rafael", "Belén", "Mauricio", "Carmen", "Francisco", "Estefanía", "Santiago", "Marcela", "Matías",
		    "Isidora", "Vicente", "Romina", "Maximiliano", "Gabriela", "Iván", "Luciana", "Benjamín", "Agustina",
		    "Jaime", "Roque", "Alma", "Jeison", "Elberg", "Gregorio", "Ariel", "Jesica", "Yolanda", "Anastasia",
		    "Valerio", "Pamela", "Marta", "Rosa"};

	private static String[] apellidos = { "Gómez", "López", "Rodríguez", "Fernández", "González", "Martínez",
			"Hernández", "Pérez", "García", "Sánchez", "Romero", "Torres", "Flores", "Rivera", "Gutiérrez", "Vargas",
			"Jiménez", "Ruiz", "Silva", "Rojas", "Reyes", "Morales", "Ortiz", "Ramírez", "Núñez", "Mendoza", "Castro",
			"Alvarez", "Herrera", "Vega", "Ramos", "Cortés", "Guerrero", "Carrasco", "Espinoza", "Acosta", "Zúñiga",
			"Moya", "Avila", "Campos", "Contreras", "Cabrera", "Valenzuela", "Orellana", "Peña", "Fuentes", "Ovalle",
			"Méndez", "Vera", "Araya", "Sepúlveda", "Tapia", "Moreno", "Cruz", "Vargas", "Aguirre", "Salazar", "Soto",
			"Miranda", "Santos", "Bravo", "Pizarro", "Muñoz", "Lara", "Ulloa", "Parra", "Valdés", "Salinas", "Ríos",
			"Paredes", "Arancibia", "Figueroa", "Gallegos", "Carvajal", "Poblete", "Cisternas", "Cáceres", "Contreras",
			"Valencia", "Villanueva", "Yáñez", "Mardones", "Molina", "Barraza", "Villagra", "Palma", "Fierro",
			"Poblete", "Olivares", "Cuevas" };

	public static Persona[] people(int _cantidad) {
		Persona[] result = new Persona[_cantidad];
		Random random = new Random();
		
		for (int i = 0; i < _cantidad; i++) {
			int dni = random.nextInt(32000000) + 9000000; // el dni estara entre 9 y 41 millones
			String apellido = apellidos[random.nextInt(apellidos.length)];
			String primerNombre = nombres[random.nextInt(nombres.length)];
			boolean SinSegundoNombre = random.nextBoolean();
			if(SinSegundoNombre) {	
				result[i] = new Persona(dni, primerNombre, apellido);
			}
			else {
				String segundoNombre = nombres[random.nextInt(nombres.length)];
				result[i] = new Persona(dni, primerNombre, segundoNombre, apellido);
			}	
		}
		return result;
	}
	
	public static String password() {
		String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@*+-()/&%$#!";
		Random random = new Random();
		String result = "";
		int seguridad = 16;
		for(int i=0; i<seguridad; i++) {
			result += caracteres.charAt(random.nextInt(caracteres.length()));
		}
		return result;
	}
}


