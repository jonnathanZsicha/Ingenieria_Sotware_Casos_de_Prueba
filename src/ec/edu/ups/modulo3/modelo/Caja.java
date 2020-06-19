package ec.edu.ups.modulo3.modelo;

import java.io.Serializable;
import java.util.List;

public class Caja implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigo ;
	private List<FacturaCabecera>facturas;
	
	public Caja() {
		
	}
	
	public Caja(int codigo , List<FacturaCabecera>facturas) {
		this.codigo = codigo;
		this.facturas = facturas;
		
	}
	
	//Getters and Setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public List<FacturaCabecera> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<FacturaCabecera> facturas) {
		this.facturas = facturas;
	}
	
	//Metodos de la clase
	
	public void verificarSaldo() {
		
	}
	public void emviarTransaccion() {
		
	}


}
