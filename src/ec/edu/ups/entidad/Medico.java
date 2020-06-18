package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medico
 *
 */
@Entity

public class Medico implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int codigo;
	private String nombre;
	private String apellido;
	private String especialidad;
	@OneToMany(cascade= CascadeType.ALL,mappedBy = "medico",orphanRemoval=true)
	private List<Cita> citas;
	@OneToMany(cascade= CascadeType.ALL,mappedBy = "medico",orphanRemoval=true)
	private List<OrdenMedica> ordenesMedicas;
	public Medico() {
		citas= new ArrayList<Cita>();
	}
	
	
	
   
}
