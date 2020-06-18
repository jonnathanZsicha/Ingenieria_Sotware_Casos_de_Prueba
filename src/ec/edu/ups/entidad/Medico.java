package ec.edu.ups.entidad;

import java.io.Serializable;
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
	
	public Medico() {
		super();
	}
   
}
