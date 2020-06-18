package ec.edu.ups.modelo;

import java.sql.Date;
import java.util.List;

import ec.edu.ups.modelo.HistoriaClinica;

public class HistorialClinico {
	
	
	private int codigo;
	private String descripcion;
	private List<HistoriaClinica> historiasclinicas;
	
	
	
	//METODOS PARA LA CLASE HISTORIAL CLINICO
	public HistorialClinico buscarHistorial() {
		HistorialClinico historialclinico= null;
		return historialclinico;
	}
	
	public Boolean crearHistorialClinico() {
		return true;
	}
	
	public void agregarHistoriaClinica(Date fecha, String observacion) {
		HistoriaClinica historiaclinica= null;
	}
	

}
