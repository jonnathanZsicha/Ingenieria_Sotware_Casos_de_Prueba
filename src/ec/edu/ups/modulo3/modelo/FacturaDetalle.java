package ec.edu.ups.modulo3.modelo;
import java.util.List;

public class FacturaDetalle {
	private int id ;
	private List<Medicamento> medicamentos;
	
	public FacturaDetalle() {
		
	}
	public FacturaDetalle(int id ,List<Medicamento> medicamentos) {
		this.id=id;
		this.medicamentos = medicamentos;
	}
	
	//Setters and Getters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	public double calcularTotalDetalle(int cantidad , double precio) {
		return 0.0;
	}

}
