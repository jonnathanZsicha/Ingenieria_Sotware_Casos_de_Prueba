package ec.edu.ups.modulo3.modelo;

import java.util.Date;
import java.util.List;

public class LibroDiario {
	private int codigo;
	private Date fecha;
	private List<AsientoContable> asientoscontables;
	
	//Setters and Getters
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
	public List<AsientoContable> getAsientoscontables() {
		return asientoscontables;
	}
	public void setAsientoscontables(List<AsientoContable> asientoscontables) {
		this.asientoscontables = asientoscontables;
	}
	// Metodos de la clase
	
	public double calcularIngresos() {
		return 0;
	}
	public double calcularEgresos() {
		return 0;
	}
	public double calcularSaldoDisponible() {
		return 0;
	}
	public List<AsientoContable> visualizarAsientosContables() {
		return null;
	}

	public boolean generarReportes() {
		return true;
	}

	
	
	

}
