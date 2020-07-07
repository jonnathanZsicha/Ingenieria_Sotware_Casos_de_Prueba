package ec.edu.ups.entidad_ingre_egre_rep;

import javax.persistence.*;
import java.util.GregorianCalendar;

@Entity
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nombre;
    @Temporal(TemporalType.DATE)
    private GregorianCalendar fecha_caducidad;
    private double precio;
    private int registro_sanitario;
    @OneToOne
    private FacturaDetalle facturadetalle;

}
