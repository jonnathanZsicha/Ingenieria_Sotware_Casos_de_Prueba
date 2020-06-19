package ec.edu.ups.modulo2;

import java.sql.Date;

public class Certificado {

	private int codigo;
	private String observacion;
	private Date fecha;
	
	public Certificado() {
		super();
	}

	
	
	public Certificado(int codigo, String observacion, Date fecha) {
		super();
		this.codigo = codigo;
		this.observacion = observacion;
		this.fecha = fecha;
	}


	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getObservacion() {
		return observacion;
	}



	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
	//METODO PARA CREAR CERTIFICADO

	public Certificado crearCertificado(String observacion,Date fecha) {
		Certificado certificado= null;
		return certificado;
	}



	@Override
	public String toString() {
		return "Certificado [codigo=" + codigo + ", observacion=" + observacion + ", fecha=" + fecha + "]";
	}
	
}
