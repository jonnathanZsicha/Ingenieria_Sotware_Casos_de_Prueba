package ec.edu.ups.modulo3.modelo;

public class AsientoContable {
	private String descripcion;
	private String cuenta;
	private Double valor;
	private Caja caja;

	public AsientoContable() {
		
	}
	
	public AsientoContable(String descripcion,String cuenta,Double valor,Caja caja) {
		this.descripcion=descripcion;
		this.cuenta=cuenta;
		this.valor=valor;
		this.caja=caja;
	}
	
	//Setters and Getters

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}
	
//Metodos Clase
	public void registrarOperacion() {
		
	}
	
	
}
