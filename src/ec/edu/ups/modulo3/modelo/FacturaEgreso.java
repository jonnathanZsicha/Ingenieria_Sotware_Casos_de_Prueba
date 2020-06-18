package ec.edu.ups.modulo3.modelo;
import java.util.List;

public class FacturaEgreso extends FacturaCabecera{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<FacturaDetalle> detalles;
	
	public List<FacturaDetalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<FacturaDetalle> detalles) {
		this.detalles = detalles;
	}

	public void calcularTotal() {
		
	}

}
