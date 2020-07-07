package ec.edu.ups.entidad_cit_cons_cert;

import ec.edu.ups.entidad_ingre_egre_rep.FacturaCabecera;
import ec.edu.ups.entidad_ingre_egre_rep.FacturaIngreso;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Paciente extends Persona implements Serializable {

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "paciente")
    private List<Certificado> certificados;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "paciente")
    private HistorialClinico historialClinico;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "paciente")
    private List<Cita> citas;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "paciente")
    private List<FacturaIngreso> facturas;

    public Paciente(List<Certificado> certificados, HistorialClinico historialClinico, List<Cita> citas) {
        this.certificados = certificados;
        this.historialClinico = historialClinico;
        this.citas = citas;
    }

    public Paciente(String cedula, String nombre, String apellido, String correo, String password, Rol rol, List<Certificado> certificados, HistorialClinico historialClinico, List<Cita> citas) {
        super(cedula, nombre, apellido, correo, password, rol);
        this.certificados = certificados;
        this.historialClinico = historialClinico;
        this.citas = citas;
    }

    public List<Certificado> getCertificados() {
        return certificados;
    }

    public void setCertificados(List<Certificado> certificados) {
        this.certificados = certificados;
    }

    public HistorialClinico getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(HistorialClinico historialClinico) {
        this.historialClinico = historialClinico;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "certificados=" + certificados +
                ", historialClinico=" + historialClinico +
                ", citas=" + citas +
                '}';
    }
}
