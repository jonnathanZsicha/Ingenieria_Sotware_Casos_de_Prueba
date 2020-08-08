package info.microdev.entidad;

import javax.persistence.*;
import java.util.GregorianCalendar;
import java.util.Objects;

@Entity
public class CompraDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Producto producto;

    @ManyToOne(cascade = CascadeType.ALL)
    private CompraCabecera compraCabecera;

    private int cantidad;

    private double precioUnitario;
    private double valorTotal;
    private double precioVentaUnitario;
    private double precioCaja;
    private double valorTotalCaja;
    private double precioVentaCaja;
    private String tarifa;

    @Temporal(TemporalType.DATE)
    private GregorianCalendar fechaVencimiento;
    private int dummy;

    public CompraDetalle(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public CompraCabecera getCompraCabecera() {
        return compraCabecera;
    }

    public void setCompraCabecera(CompraCabecera compraCabecera) {
        this.compraCabecera = compraCabecera;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getPrecioVentaUnitario() {
        return precioVentaUnitario;
    }

    public void setPrecioVentaUnitario(double precioVentaUnitario) {
        this.precioVentaUnitario = precioVentaUnitario;
    }

    public double getPrecioCaja() {
        return precioCaja;
    }

    public void setPrecioCaja(double precioCaja) {
        this.precioCaja = precioCaja;
    }

    public double getValorTotalCaja() {
        return valorTotalCaja;
    }

    public void setValorTotalCaja(double valorTotalCaja) {
        this.valorTotalCaja = valorTotalCaja;
    }

    public double getPrecioVentaCaja() {
        return precioVentaCaja;
    }

    public void setPrecioVentaCaja(double precioVentaCaja) {
        this.precioVentaCaja = precioVentaCaja;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public GregorianCalendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(GregorianCalendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getDummy() {
        return dummy;
    }

    public void setDummy(int dummy) {
        this.dummy = dummy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompraDetalle)) return false;
        CompraDetalle that = (CompraDetalle) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CompraDetalle{" +
                "id=" + id +
                ", producto=" + producto +
                ", compraCabecera=" + compraCabecera +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", valorTotal=" + valorTotal +
                ", precioVentaUnitario=" + precioVentaUnitario +
                ", precioCaja=" + precioCaja +
                ", valorTotalCaja=" + valorTotalCaja +
                ", precioVentaCaja=" + precioVentaCaja +
                ", tarifa='" + tarifa + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", dummy=" + dummy +
                '}';
    }
}
