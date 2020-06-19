package ec.edu.ups.modelo;

import java.sql.Timestamp;
import java.util.List;

import ec.edu.ups.modelo.Cita;

public class Paciente {

	private int codigo;
	private String apellido;
	private String nombre;
	private List<Cita> citas;
	private HistorialClinico historialClinico;
	
	
	public Paciente() {
		super();
	}

	
	
	//METODOS PARA EL PACIENTE
	
	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public List<Cita> getCitas() {
		return citas;
	}



	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}



	public HistorialClinico getHistorialClinico() {
		return historialClinico;
	}



	public void setHistorialClinico(HistorialClinico historialClinico) {
		this.historialClinico = historialClinico;
	}



	public void visualizarInformacion() {
		
	}
	public Boolean modificarInformacion() {
		return true;
	}
	
	public Cita agendarCita(Timestamp hora_fecha,String disponibilidad) {
		Cita cita=null;
		return cita;
	}



	@Override
	public String toString() {
		return "Paciente [codigo=" + codigo + ", apellido=" + apellido + ", nombre=" + nombre + ", citas=" + citas
				+ ", historialClinico=" + historialClinico + "]";
	}
	
	
	
	
}
