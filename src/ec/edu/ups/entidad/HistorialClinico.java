package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: HistorialClinico
 *
 */
@Entity

public class HistorialClinico implements Serializable {
	//HISTORIAL CLINICO DEL PACIENTE
	
	private static final long serialVersionUID = 1L;
	@Id
	private int codigo;
	@OneToOne
	@JoinColumn
	private Paciente paciente;
	@OneToMany(cascade= CascadeType.ALL,mappedBy = "historialClinico",orphanRemoval = true)
	private List<HistoriaClinica> historiasclinicas;
	
	public HistorialClinico() {
		historiasclinicas= new ArrayList<HistoriaClinica>();
		
	}
   
}
