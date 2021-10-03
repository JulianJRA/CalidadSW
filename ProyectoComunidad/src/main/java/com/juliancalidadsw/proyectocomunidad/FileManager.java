package com.juliancalidadsw.proyectocomunidad;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {

	public static void leerVecinos(String cadena, Comunidad comunidad) {
		File f = new File(cadena);
		Scanner nombre_f;
		Vecino h;
		try {
			nombre_f = new Scanner(f);
			while (nombre_f.hasNext()) {

				char opcion = nombre_f.next().charAt(0);
				String nombre = nombre_f.next();
				String nif = nombre_f.next();
				String piso = nombre_f.next();
				if (opcion == 'p') {
					int anyo = nombre_f.nextInt();
					h = new Propietario(nombre, nif, piso, anyo);

				} else {

					double alquiler = Double.parseDouble(nombre_f.next());
					h = new Inquilino(nombre, nif, piso, alquiler);

				}

				comunidad.addVecino(h);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}