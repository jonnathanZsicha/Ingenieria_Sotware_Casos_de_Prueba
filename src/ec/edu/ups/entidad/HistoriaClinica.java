package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: HistoriaClinica
 *
 */
@Entity

public class HistoriaClinica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int codigo;
	@ManyToOne
	@JoinColumn
	private HistorialClinico historialClinico;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "historiaClinica",orphanRemoval = true)
	private Prescripcion prescripcion;
	public HistoriaClinica() {
		super();
	}
   
}
