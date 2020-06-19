package ec.edu.ups.modulo2.modelo;

public class Calendario {

	private int codigo;
	private String dia;
	private String mes;
	private String anio;
	
	
	public Calendario() {
	
	}

	public Calendario(int codigo, String dia, String mes, String anio) {
		super();
		this.codigo = codigo;
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	//METODOS PARA LA CLASE CALENDARIO

	public Boolean consultarDisponibilidad() {
		return true;	
	}
}
