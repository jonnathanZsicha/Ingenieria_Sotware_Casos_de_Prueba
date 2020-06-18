package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrdenMedica
 *
 */
@Entity

public class OrdenMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int codigo;
	private String servicio;
	private String descripcion;
	@ManyToOne
	@JoinColumn
	private Medico medico;
	public OrdenMedica() {
		super();
	}
   
}
