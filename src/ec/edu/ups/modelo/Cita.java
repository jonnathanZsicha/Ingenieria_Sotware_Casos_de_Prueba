package ec.edu.ups.modelo;

import java.sql.Timestamp;

import ec.edu.ups.modelo.Medico;

public class Cita {

	private int codigo;
	private Timestamp fecha_hora;
	private String disponibilidad;
	
	public Cita() {
		
	}

	public Cita(int codigo, Timestamp fecha_hora, String disponibilidad) {
		super();
		this.codigo = codigo;
		this.fecha_hora = fecha_hora;
		this.disponibilidad = disponibilidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Timestamp getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(Timestamp fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	
	//METODOS PARA LA CLASE CITA
	
	public Cita crearCita(Timestamp fecha_hora, String disponibilidad) {
		Cita cita = null;
		return cita;
	}
	
	public Boolean modificarCita(Cita cita) {
		return true;
	}
	public Boolean eliminarCita(Cita cita) {
		return true;
	}
	
	public Cita consultarCita() {
		Cita cita = null;
		return cita;
	}

	@Override
	public String toString() {
		return "Cita [codigo=" + codigo + ", fecha_hora=" + fecha_hora + ", disponibilidad=" + disponibilidad + "]";
	}
	
	
	
}
