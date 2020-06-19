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
	
	public void calcularIngresos() {
		
	}
	public void calcularEgresos() {
		
	}
	public void calcularSaldoDisponible() {
		
	}
	public void visualizarAsientosContables() {
		
	}
	public void generarReportes() {
		
	}

	
	
	

}
