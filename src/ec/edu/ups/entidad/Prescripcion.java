package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Prescripcion
 *
 */
@Entity

public class Prescripcion implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id 
	private int codigo;
	@OneToOne
	@JoinColumn
	private HistoriaClinica historiaClinica;
	private String observacion;
	public Prescripcion() {
		super();
	}
   
}
