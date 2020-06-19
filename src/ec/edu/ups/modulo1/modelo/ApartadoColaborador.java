package ec.edu.ups.modulo1.modelo;

public class ApartadoColaborador extends Apartado {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * +generarFacturaIngreso(c:Colaborador,p:Paciente):return boolean
	 * +generarFacturaEngreso(c:Colaborador):return boolean
	 * +verReporteLibroDiario(): return LibroDiario
	 
	*/
	
	public boolean generarFacturaIngreso(Object colaborador,Object paciente ) {
		return true;
	}
	
	public boolean generarFacturaEngreso(Object colaborador) {
		return true; 
	}
	
}
