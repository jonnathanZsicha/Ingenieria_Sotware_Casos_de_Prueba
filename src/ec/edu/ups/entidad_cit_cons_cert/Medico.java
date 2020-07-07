package ec.edu.ups.entidad_cit_cons_cert;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Medico extends Persona implements Serializable {

    private String especialidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medico")
    private List<Cita> citas;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "medico")
    private List<Certificado> certificados;

    public Medico() {
    }

    public Medico(String cedula, String nombre, String apellido, String correo, String password, Rol rol, String especialidad, List<Cita> citas, List<Certificado> certificados) {
        super(cedula, nombre, apellido, correo, password, rol);
        this.especialidad = especialidad;
        this.citas = citas;
        this.certificados = certificados;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

}
