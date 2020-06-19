package ec.edu.ups.modelo;

public class Prescripcion {
	
	private int codigo;
	private String medicamento;
	private String observacion;
	

	public Prescripcion() {
		super();
	}

	public Prescripcion(int codigo, String medicamento, String observacion) {
		super();
		this.codigo = codigo;
		this.medicamento = medicamento;
		this.observacion = observacion;
	}
	
	
	//METODOS PARA LA CLASE PRESCRIPCION

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Prescripcion crearPrescripcion (String medicamento, String observacion) {
		Prescripcion prescripcion= null;
		return prescripcion;
	}
	
	public void enviarPrescripcion() {
		
	}
	public void generarTratamiento() {
		
	}

	@Override
	public String toString() {
		return "Prescripcion [codigo=" + codigo + ", medicamento=" + medicamento + ", observacion=" + observacion + "]";
	}
	
	

}
