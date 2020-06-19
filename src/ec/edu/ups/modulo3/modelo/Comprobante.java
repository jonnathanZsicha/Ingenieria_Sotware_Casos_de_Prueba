package ec.edu.ups.modulo3.modelo;

import java.util.List;

import ec.edu.ups.modulo1.modelo.ApartadoPaciente;
import ec.edu.ups.modulo1.modelo.Usuario;

public class Comprobante extends FacturaCabecera{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ApartadoPaciente paciente;
	private List<DetalleComprobante> detalles;
	

	//Setters and Getters

	public ApartadoPaciente getPaciente() {
		return paciente;
	}


	public void setPaciente(ApartadoPaciente paciente) {
		this.paciente = paciente;
	}


	public List<DetalleComprobante> getDetalles() {
		return detalles;
	}


	public void setDetalles(List<DetalleComprobante> detalles) {
		this.detalles = detalles;
	}
	

	//metodos de la clase
	
	public void facturarOtraPersona(Usuario usuario) {
		
	}
	
	

}
