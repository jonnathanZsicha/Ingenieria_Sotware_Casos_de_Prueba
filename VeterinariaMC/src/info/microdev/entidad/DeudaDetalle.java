package info.microdev.entidad;

import javax.persistence.*;
import java.util.GregorianCalendar;
import java.util.Objects;

@Entity
public class DeudaDetalle {

    @Id
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private DeudaCabecera deudaCabecera;

    private double montoCancelado;

    @Temporal(TemporalType.DATE)
    private GregorianCalendar fecha;

    public DeudaDetalle(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeudaCabecera getDeudaCabecera() {
        return deudaCabecera;
    }

    public void setDeudaCabecera(DeudaCabecera deudaCabecera) {
        this.deudaCabecera = deudaCabecera;
    }

    public double getMontoCancelado() {
        return montoCancelado;
    }

    public void setMontoCancelado(double montoCancelado) {
        this.montoCancelado = montoCancelado;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeudaDetalle)) return false;
        DeudaDetalle that = (DeudaDetalle) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "DeudaDetalle{" +
                "id=" + id +
                ", deudaCabecera=" + deudaCabecera +
                ", montoCancelado=" + montoCancelado +
                ", fecha=" + fecha +
                '}';
    }
}
