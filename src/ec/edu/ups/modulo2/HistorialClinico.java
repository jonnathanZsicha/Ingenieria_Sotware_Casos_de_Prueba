package ec.edu.ups.modulo2;

import java.sql.Date;
import java.util.List;

import ec.edu.ups.modulo2.HistoriaClinica;

public class HistorialClinico {
	
	
	private int codigo;
	private String descripcion;
	private List<HistoriaClinica> historiasclinicas;
	
	
	
	public HistorialClinico() {
		
	}

	public HistorialClinico(int codigo, String descripcion, List<HistoriaClinica> historiasclinicas) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.historiasclinicas = historiasclinicas;
	}

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<HistoriaClinica> getHistoriasclinicas() {
		return historiasclinicas;
	}

	public void setHistoriasclinicas(List<HistoriaClinica> historiasclinicas) {
		this.historiasclinicas = historiasclinicas;
	}

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
