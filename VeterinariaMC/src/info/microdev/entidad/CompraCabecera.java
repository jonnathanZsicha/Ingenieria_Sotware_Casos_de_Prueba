package info.microdev.entidad;

import javax.persistence.*;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;

@Entity
public class CompraCabecera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String autorizacion;

    @Temporal(TemporalType.DATE)
    private GregorianCalendar fecha;

    private String formaPago;

    @ManyToOne(cascade = CascadeType.ALL)
    private Proveedor proveedor;

    @OneToMany(mappedBy = "compraCabecera")
    private List<CompraDetalle> compraDetalleList;

    private String plazo;

    private double abono;
    private double subtotal12;
    private double subtotal0;
    private double totalIva;
    private double ice;
    private double irbp;
    private double total;
    private String anulada;

    public CompraCabecera(){}

    public CompraCabecera(String autorizacion, GregorianCalendar fecha, String formaPago, Proveedor proveedor, List<CompraDetalle> compraDetalles, String plazo, double abono, double subtotal12, double subtotal0, double totalIva, double ice, double irbp, double total, String anulada) {
        this.autorizacion = autorizacion;
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.proveedor = proveedor;
        this.compraDetalleList = compraDetalles;
        this.plazo = plazo;
        this.abono = abono;
        this.subtotal12 = subtotal12;
        this.subtotal0 = subtotal0;
        this.totalIva = totalIva;
        this.ice = ice;
        this.irbp = irbp;
        this.total = total;
        this.anulada = anulada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(String autorizacion) {
        this.autorizacion = autorizacion;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<CompraDetalle> getCompraDetalleList() {
        return compraDetalleList;
    }

    public void setCompraDetalleList(List<CompraDetalle> compraDetalleList) {
        this.compraDetalleList = compraDetalleList;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public double getSubtotal12() {
        return subtotal12;
    }

    public void setSubtotal12(double subtotal12) {
        this.subtotal12 = subtotal12;
    }

    public double getSubtotal0() {
        return subtotal0;
    }

    public void setSubtotal0(double subtotal0) {
        this.subtotal0 = subtotal0;
    }

    public double getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(double totalIva) {
        this.totalIva = totalIva;
    }

    public double getIce() {
        return ice;
    }

    public void setIce(double ice) {
        this.ice = ice;
    }

    public double getIrbp() {
        return irbp;
    }

    public void setIrbp(double irbp) {
        this.irbp = irbp;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompraCabecera)) return false;
        CompraCabecera that = (CompraCabecera) o;
        return id == that.id &&
                Objects.equals(autorizacion, that.autorizacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, autorizacion);
    }

    @Override
    public String toString() {
        return "CompraCabecera{" +
                "id=" + id +
                ", autorizacion='" + autorizacion + '\'' +
                ", fecha=" + fecha +
                ", formaPago='" + formaPago + '\'' +
                ", proveedor=" + proveedor +
                ", compraDetalleList=" + compraDetalleList +
                ", plazo='" + plazo + '\'' +
                ", abono=" + abono +
                ", subtotal12=" + subtotal12 +
                ", subtotal0=" + subtotal0 +
                ", totalIva=" + totalIva +
                ", ice=" + ice +
                ", irbp=" + irbp +
                ", total=" + total +
                ", anulada='" + anulada + '\'' +
                '}';
    }
}
