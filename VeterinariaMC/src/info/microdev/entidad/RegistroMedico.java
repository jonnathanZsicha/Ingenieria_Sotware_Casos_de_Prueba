package info.microdev.entidad;

import javax.persistence.*;
import java.util.GregorianCalendar;
import java.util.Objects;

@Entity
public class RegistroMedico {

    @Id
    private int id;

    @Temporal(TemporalType.DATE)
    private GregorianCalendar fecha;

    private String hora;

    @Temporal(TemporalType.DATE)
    private GregorianCalendar siguienteFecha;

    private String tipo;

    private String descripcion;

    @ManyToOne(cascade = CascadeType.ALL)
    private Paciente paciente;

    public RegistroMedico(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public GregorianCalendar getSiguienteFecha() {
        return siguienteFecha;
    }

    public void setSiguienteFecha(GregorianCalendar siguienteFecha) {
        this.siguienteFecha = siguienteFecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistroMedico)) return false;
        RegistroMedico that = (RegistroMedico) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "RegistroMedico{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", siguienteFecha=" + siguienteFecha +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", paciente=" + paciente +
                '}';
    }
}
