package com.juliancalidadsw.proyectocomunidad;



public class empresaMantenimiento {

	private String nombre;
	private String direccion;
	private double costeAscensor;

	public empresaMantenimiento(String nombre, String direccion, double costeAscensor) {

		this.nombre = nombre;
		this.direccion = direccion;
		this.costeAscensor = costeAscensor;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getCosteAscensor() {
		return costeAscensor;
	}

	public void setCosteAscensor(double costeAscensor) {
		this.costeAscensor = costeAscensor;
	}

}
