package ec.edu.ups.modulo2.modelo;

import java.sql.Timestamp;
import java.util.List;

public class HistoriaClinica {

	private int codigo;
	private Timestamp fecha_hora;
	private String observacion;
	private Prescripcion prescripcion;
	private List<OrdenMedica> ordenesMedicas;
	
	
	
	public HistoriaClinica() {
		super();
	}


	public HistoriaClinica(int codigo, Timestamp fecha_hora, String observacion, Prescripcion prescripcion,
			List<OrdenMedica> ordenesMedicas) {
		super();
		this.codigo = codigo;
		this.fecha_hora = fecha_hora;
		this.observacion = observacion;
		this.prescripcion = prescripcion;
		this.ordenesMedicas = ordenesMedicas;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Timestamp getFecha_hora() {
		return fecha_hora;
	}


	public void setFecha_hora(Timestamp fecha_hora) {
		this.fecha_hora = fecha_hora;
	}


	public String getObservacion() {
		return observacion;
	}


	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	public Prescripcion getPrescripcion() {
		return prescripcion;
	}


	public void setPrescripcion(Prescripcion prescripcion) {
		this.prescripcion = prescripcion;
	}


	public List<OrdenMedica> getOrdenesMedicas() {
		return ordenesMedicas;
	}


	public void setOrdenesMedicas(List<OrdenMedica> ordenesMedicas) {
		this.ordenesMedicas = ordenesMedicas;
	}


	//METODOS PARA LA HISTORIA CLINICA
	public HistoriaClinica consultarHistoriaClinica() {
		HistoriaClinica historiaclinica= null;
		return historiaclinica;
	}


	@Override
	public String toString() {
		return "HistoriaClinica [codigo=" + codigo + ", fecha_hora=" + fecha_hora + ", observacion=" + observacion
				+ ", prescripcion=" + prescripcion + ", ordenesMedicas=" + ordenesMedicas + "]";
	}
	
	
	
}
