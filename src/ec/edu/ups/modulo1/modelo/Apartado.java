package ec.edu.ups.modulo1.modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Apartado implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String descripcion;
	private java.util.Calendar tiempoActividad;
	
	public Apartado() {
		tiempoActividad = new GregorianCalendar();
	}			
	

	public boolean cerrarSesion() {
		return true;
	}
	
	public String getTiempoActividad() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy");
		return formato.format(tiempoActividad.getTime());
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public void setTiempoActividad(java.util.Calendar tiempoActividad) {
		this.tiempoActividad = tiempoActividad;
	}
	
	
}
