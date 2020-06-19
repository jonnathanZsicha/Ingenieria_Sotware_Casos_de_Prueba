package ec.edu.ups.modulo3.modelo;

import java.util.Date;

public class Medicamento {
	private String nombre;
	private Date fechaCaducidad;
	private double precio;
	private int registroSanitario;

	public Medicamento() {
		
	}
	
	public Medicamento(String nombre,Date fechaCaducidad,double precio,int registroSanitario) {
		this.nombre = nombre;
		this.fechaCaducidad = fechaCaducidad;
		this.precio = precio;
		this.registroSanitario = registroSanitario;
	}

	//Setters and Getters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getRegistroSanitario() {
		return registroSanitario;
	}

	public void setRegistroSanitario(int registroSanitario) {
		this.registroSanitario = registroSanitario;
	}
	
	//Metodos de la clase
	
	
	
	
}
