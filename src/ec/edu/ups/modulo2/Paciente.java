package ec.edu.ups.modulo2;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.modulo2.Cita;

public class Paciente {

	private int codigo;
	private String apellido;
	private String nombre;
	private List<Cita> citas;
	private HistorialClinico historialClinico;
	private List<Certificado> certificados;
	
	
	public Paciente() {
		citas= new ArrayList<Cita>();
		certificados= new ArrayList<Certificado>();
	}


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



	public List<Certificado> getCertificados() {
		return certificados;
	}



	public void setCertificados(List<Certificado> certificados) {
		this.certificados = certificados;
	}
	
	
	
	//METODOS PARA EL PACIENTE

	public void visualizarInformacion() {
		
	}

	public Boolean modificarInformacion() {
		return true;
	}
	
	public Cita agendarCita(Timestamp hora_fecha,String disponibilidad) {
		Cita cita=null;
		return cita;
	}
	
	public Boolean agregarCertificado(Certificado certificado) {
		return true;
		
	}

	@Override
	public String toString() {
		return "Paciente [codigo=" + codigo + ", apellido=" + apellido + ", nombre=" + nombre + ", citas=" + citas
				+ ", historialClinico=" + historialClinico + "]";
	}
	
	
	
	
}
