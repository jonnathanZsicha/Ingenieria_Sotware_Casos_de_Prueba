package info.microdev.entidad;

import javax.persistence.*;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;

@Entity
public class Producto {

    @Id
    private String codigo;

    private String codigoPrincipal;
    private String nombre;
    private String nombrePrincipal;
    @Temporal(TemporalType.DATE)
    private GregorianCalendar fecha;

    @ManyToOne(cascade = CascadeType.ALL)
    private Proveedor proveedor;

    @OneToMany(mappedBy = "producto")
    private List<CompraDetalle> compraDetalleList;

    @OneToMany(mappedBy = "producto")
    private List<FacturaDetalle> facturaDetalleList;

    private String categoria;
    private String representacion;
    private int cantidadInterna;
    private double stock;
    private double precioCaja;
    private double precioUnitario;
    private String impuesto;
    private double precioCaja12;
    private double precioUnitario12;
    private double precioVentaCaja;
    private double precioVentaUnidad;

    public Producto(){}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoPrincipal() {
        return codigoPrincipal;
    }

    public void setCodigoPrincipal(String codigoPrincipal) {
        this.codigoPrincipal = codigoPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrePrincipal() {
        return nombrePrincipal;
    }

    public void setNombrePrincipal(String nombrePrincipal) {
        this.nombrePrincipal = nombrePrincipal;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getRepresentacion() {
        return representacion;
    }

    public void setRepresentacion(String representacion) {
        this.representacion = representacion;
    }

    public int getCantidadInterna() {
        return cantidadInterna;
    }

    public void setCantidadInterna(int cantidadInterna) {
        this.cantidadInterna = cantidadInterna;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getPrecioCaja() {
        return precioCaja;
    }

    public void setPrecioCaja(double precioCaja) {
        this.precioCaja = precioCaja;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    public double getPrecioCaja12() {
        return precioCaja12;
    }

    public void setPrecioCaja12(double precioCaja12) {
        this.precioCaja12 = precioCaja12;
    }

    public double getPrecioUnitario12() {
        return precioUnitario12;
    }

    public void setPrecioUnitario12(double precioUnitario12) {
        this.precioUnitario12 = precioUnitario12;
    }

    public double getPrecioVentaCaja() {
        return precioVentaCaja;
    }

    public void setPrecioVentaCaja(double precioVentaCaja) {
        this.precioVentaCaja = precioVentaCaja;
    }

    public double getPrecioVentaUnidad() {
        return precioVentaUnidad;
    }

    public void setPrecioVentaUnidad(double precioVentaUnidad) {
        this.precioVentaUnidad = precioVentaUnidad;
    }

    public List<CompraDetalle> getCompraDetalleList() {
        return compraDetalleList;
    }

    public void setCompraDetalleList(List<CompraDetalle> compraDetalleList) {
        this.compraDetalleList = compraDetalleList;
    }

    public List<FacturaDetalle> getFacturaDetalleList() {
        return facturaDetalleList;
    }

    public void setFacturaDetalleList(List<FacturaDetalle> facturaDetalleList) {
        this.facturaDetalleList = facturaDetalleList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", codigoPrincipal='" + codigoPrincipal + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nombrePrincipal='" + nombrePrincipal + '\'' +
                ", fecha=" + fecha +
                ", proveedor=" + proveedor +
                ", compraDetalleList=" + compraDetalleList +
                ", facturaDetalleList=" + facturaDetalleList +
                ", categoria='" + categoria + '\'' +
                ", representacion='" + representacion + '\'' +
                ", cantidadInterna=" + cantidadInterna +
                ", stock=" + stock +
                ", precioCaja=" + precioCaja +
                ", precioUnitario=" + precioUnitario +
                ", impuesto='" + impuesto + '\'' +
                ", precioCaja12=" + precioCaja12 +
                ", precioUnitario12=" + precioUnitario12 +
                ", precioVentaCaja=" + precioVentaCaja +
                ", precioVentaUnidad=" + precioVentaUnidad +
                '}';
    }
}
