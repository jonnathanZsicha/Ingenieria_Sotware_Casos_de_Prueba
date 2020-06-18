package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.modelo.OrdenMedica;
import ec.edu.ups.modelo.Cita;

public class Medico {
	
	private int codigo;
	private String nombre;
	private String apellido;
	private String especialidad;
	private List<Cita> citas;
	private List<OrdenMedica> ordenesMedicas;
	
	public Medico() {
		citas = new ArrayList<Cita>();
		ordenesMedicas= new ArrayList<OrdenMedica>();
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
	
}
