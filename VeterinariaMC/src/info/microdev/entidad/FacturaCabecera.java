package info.microdev.entidad;

import javax.persistence.*;
import java.util.GregorianCalendar;
import java.util.Objects;

@Entity
public class FacturaCabecera {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cliente cliente;

    private String tipo;

    @Temporal(TemporalType.DATE)
    private GregorianCalendar gregorianCalendar;

    private double subtotal;
    private double iva;
    private double descuento;
    private double total;

    private String anulada;

    @ManyToOne(cascade = CascadeType.ALL)
    private Empleado empleado;

    @OneToOne(mappedBy = "facturaCabecera")
    private DeudaCabecera deudaCabecera;

    public FacturaCabecera(){}

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

    public void setGregorianCalendar(GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getAnulada() {
        return anulada;
    }

    public void setAnulada(String anulada) {
        this.anulada = anulada;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "FacturaCabecera{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", tipo='" + tipo + '\'' +
                ", gregorianCalendar=" + gregorianCalendar +
                ", subtotal=" + subtotal +
                ", iva=" + iva +
                ", descuento=" + descuento +
                ", total=" + total +
                ", anulada='" + anulada + '\'' +
                ", empleado=" + empleado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FacturaCabecera)) return false;
        FacturaCabecera that = (FacturaCabecera) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
