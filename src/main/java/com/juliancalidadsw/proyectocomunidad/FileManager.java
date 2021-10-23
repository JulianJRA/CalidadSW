package com.juliancalidadsw.proyectocomunidad;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {
	
	  private FileManager() {
		    throw new IllegalStateException("Utility class");
	  }

	public static void leerVecinos(String cadena, Comunidad comunidad) {
		File f = new File(cadena);
		Scanner nombref;
		Vecino h;
		try {
			nombref = new Scanner(f);
			while (nombref.hasNext()) {

				char opcion = nombref.next().charAt(0);
				String nombre = nombref.next();
				String nif = nombref.next();
				String piso = nombref.next();
				if (opcion == 'p') {
					int anyo = nombref.nextInt();
					h = new Propietario(nombre, nif, piso, anyo);

				} else {

					double alquiler = Double.parseDouble(nombref.next());
					h = new Inquilino(nombre, nif, piso, alquiler);

				}

				comunidad.addVecino(h);

			}
			nombref.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}