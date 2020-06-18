package ec.edu.ups.modulo3.modelo;

import java.io.Serializable;
import java.util.Date;

import ec.edu.ups.modelo.ApartadoColaborador;

public class FacturaCabecera implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private Date fecha;
	private ApartadoColaborador colaborador;
	
	public FacturaCabecera () {
		
	}
	
	public FacturaCabecera (int codigo,Date fecha,ApartadoColaborador colaborador) {
		this.codigo = codigo;
		this.fecha = fecha;
		this.colaborador = colaborador;
	}
	
	//Getters and Setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public ApartadoColaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(ApartadoColaborador colaborador) {
		this.colaborador = colaborador;
	}
	
	//Metodos de la clase
	
	public void calcularTotal() {
		
	}
	
	public void calcularSubTotak() {
		
	}
	
	
	
	
	
	

}
