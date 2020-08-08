package info.microdev.entidad;

import javax.persistence.*;
import java.util.GregorianCalendar;
import java.util.Objects;

@Entity
public class DeudaCabecera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cliente cliente;

    @OneToOne
    private FacturaCabecera facturaCabecera;

    @Temporal(TemporalType.DATE)
    private GregorianCalendar fechaInicial;

    private double montoOriginal;
    private double montoCancelado;

    private String estado;

    public DeudaCabecera(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FacturaCabecera getFacturaCabecera() {
        return facturaCabecera;
    }

    public void setFacturaCabecera(FacturaCabecera facturaCabecera) {
        this.facturaCabecera = facturaCabecera;
    }

    public GregorianCalendar getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(GregorianCalendar fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public double getMontoOriginal() {
        return montoOriginal;
    }

    public void setMontoOriginal(double montoOriginal) {
        this.montoOriginal = montoOriginal;
    }

    public double getMontoCancelado() {
        return montoCancelado;
    }

    public void setMontoCancelado(double montoCancelado) {
        this.montoCancelado = montoCancelado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeudaCabecera)) return false;
        DeudaCabecera that = (DeudaCabecera) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "DeudaCabecera{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", facturaCabecera=" + facturaCabecera +
                ", fechaInicial=" + fechaInicial +
                ", montoOriginal=" + montoOriginal +
                ", montoCancelado=" + montoCancelado +
                ", estado='" + estado + '\'' +
                '}';
    }
}
