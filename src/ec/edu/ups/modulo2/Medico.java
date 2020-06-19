package ec.edu.ups.modulo2;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.modulo2.Cita;
import ec.edu.ups.modulo2.OrdenMedica;

public class Medico {
	
	private int codigo;
	private String nombre;
	private String apellido;
	private String especialidad;
	private List<Cita> citas;
	private List<OrdenMedica> ordenesMedicas;
	private List<Certificado> certificados;
	
	public Medico() {
		citas = new ArrayList<Cita>();
		ordenesMedicas= new ArrayList<OrdenMedica>();
		certificados= new ArrayList<Certificado>();
	}


	
	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}



	public List<Cita> getCitas() {
		return citas;
	}



	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}



	public List<OrdenMedica> getOrdenesMedicas() {
		return ordenesMedicas;
	}



	public void setOrdenesMedicas(List<OrdenMedica> ordenesMedicas) {
		this.ordenesMedicas = ordenesMedicas;
	}



	public List<Certificado> getCertificados() {
		return certificados;
	}



	public void setCertificados(List<Certificado> certificados) {
		this.certificados = certificados;
	}

	
	
	//METODOS DE LA CLASE MEDICO

	public Boolean actualizarDatos() {
		return true;
	}
	
	public Medico visualizarDatos() {
		
		return null;
	}
	
	public Boolean consultarDisponibilidad() {
		
		return true;
	}
	
	public Boolean agregarOrdenMedica(String servicio, String descripcion) {
		
		return true;
	}
	
	public Boolean agregarPrescripcion(Prescripcion prescripcion) {
		return true;
	}
	
	public Boolean agregarCitaMedica(Cita cita) {

		return true;
	}



	@Override
	public String toString() {
		return "Medico [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", especialidad="
				+ especialidad + ", citas=" + citas + ", ordenesMedicas=" + ordenesMedicas + ", certificados="
				+ certificados + "]";
	}
	
	
	
	
	
}
