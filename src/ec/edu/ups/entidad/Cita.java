package ec.edu.ups.entidad;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Cita
 *
 */
@Entity

public class Cita implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int codigo;
	private Timestamp fecha_hora;
	private String disponibilidad;
	@ManyToOne
	@JoinColumn
	private Medico medico;
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	public Cita() {
		super();
	}
	public Cita(int codigo, Timestamp fecha_hora, String disponibilidad, Medico medico, Paciente paciente) {
		super();
		this.codigo = codigo;
		this.fecha_hora = fecha_hora;
		this.disponibilidad = disponibilidad;
		this.medico = medico;
		this.paciente = paciente;
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
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cita other = (Cita) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cita [codigo=" + codigo + ", fecha_hora=" + fecha_hora + ", disponibilidad=" + disponibilidad
				+ ", medico=" + medico + ", paciente=" + paciente + "]";
	}
	
	
   
}
