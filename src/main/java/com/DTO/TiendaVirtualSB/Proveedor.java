package com.DTO.TiendaVirtualSB;

public class Proveedor {
	
	private String NIT;
	private String nombre;
	private String direccion;
	private String telefono;
	private String email;
	private String sitioweb;
	
	public Proveedor(String nIT, String nombre, String direccion, String telefono, String email, String sitioweb) {
		NIT = nIT;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.sitioweb = sitioweb;
	}

	public String getNIT() {
		return NIT;
	}

	public void setNIT(String nIT) {
		NIT = nIT;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSitioweb() {
		return sitioweb;
	}

	public void setSitioweb(String sitioweb) {
		this.sitioweb = sitioweb;
	}	
}
