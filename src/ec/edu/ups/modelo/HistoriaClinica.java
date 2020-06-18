package ec.edu.ups.modelo;

import java.sql.Timestamp;
import java.util.List;

public class HistoriaClinica {

	private int codigo;
	private Timestamp fecha_hora;
	private String observacion;
	private Prescripcion prescripcion;
	private List<OrdenMedica> ordenesMedicas;
	
	
	//METODOS PARA LA HISTORIA CLINICA
	public HistoriaClinica consultarHistoriaClinica() {
		HistoriaClinica historiaclinica= null;
		return historiaclinica;
	}
	
}
