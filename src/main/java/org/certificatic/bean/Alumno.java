package org.certificatic.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alumno {
	
	private String nombre;
	private String apellido;
	
	@Autowired
	private Direccion direccion;

	public String getNombre() {
		return nombre;
	}

	@Autowired
	public void setNombre(@Value("Bobbb" )String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	@Autowired
	public void setApellido(@Value("Dylan")String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}
	
	
	

}
