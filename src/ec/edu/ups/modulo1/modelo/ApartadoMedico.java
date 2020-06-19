package ec.edu.ups.modulo1.modelo;

import java.awt.List;

public class ApartadoMedico extends Apartado {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * +visualizarCitas():return List<Citas>
	 * +visualizarReporteHistoriaClinica(cedula.String):return HistoriaClinica
	 * +generarOrdenMedica(p: Paciente,descripcion: String): return boolean
	 * +generarCertificado(p:Paciente,descripcion: String): return boolean
	 * +generarPerscripcionMedica:(p: Paciente,descripcion: String):return boolean
	 */
	
	public List visualizarCitas() {
		return null;
	}
	
	public Object visualizarReporteHistoriaClinica(String cedula) {
		return null;
	}
	


	
	public boolean generarOrdenMedica(Object paciente , String descripcion) {
		return true;
	}
	
	public boolean generarCertificado(Object paciente , String descripcion) {
		return true;
	}
	
	public boolean generarPerscripcionMedica(Object paciente , String descripcion) {
		return true;
	}
	 

}
