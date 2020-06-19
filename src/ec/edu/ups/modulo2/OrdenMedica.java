package ec.edu.ups.modulo2;

import java.util.List;

public class OrdenMedica {

	
	private int codigo;
	private String servicio;
	private String descripcion;
	

	public OrdenMedica() {
		super();
	}

	public OrdenMedica(int codigo, String servicio, String descripcion) {
		super();
		this.codigo = codigo;
		this.servicio = servicio;
		this.descripcion = descripcion;
	}


	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getServicio() {
		return servicio;
	}



	public void setServicio(String servicio) {
		this.servicio = servicio;
	}



	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	//METODOS PARA LAS ORDENES MEDICAS

	public List<OrdenMedica> listarOrdenesMedicas() {
		List<OrdenMedica> ordenesMedicas=null;
		return ordenesMedicas;
		
	}
}
