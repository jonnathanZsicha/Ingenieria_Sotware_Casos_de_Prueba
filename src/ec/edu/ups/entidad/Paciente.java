package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class Paciente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id 
	private int codigo;
	private String apellido;
	private String nombre;
	@OneToMany(cascade= CascadeType.ALL,mappedBy = "paciente",orphanRemoval = true)
	private List<Cita> citas;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "paciente",orphanRemoval = true)
	private HistorialClinico historial_clinico;
	
	
	public Paciente() {
		citas = new ArrayList<Cita>();
	}

	public Paciente(int codigo, String apellido, String nombre, List<Cita> citas) {
		super();
		this.codigo = codigo;
		this.apellido = apellido;
		this.nombre = nombre;
		this.citas = citas;
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
		Paciente other = (Paciente) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paciente [codigo=" + codigo + ", apellido=" + apellido + ", nombre=" + nombre + ", citas=" + citas
				+ "]";
	}
	
	
	
   
}
