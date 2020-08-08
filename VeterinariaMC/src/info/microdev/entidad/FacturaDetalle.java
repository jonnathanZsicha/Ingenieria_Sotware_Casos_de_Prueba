package info.microdev.entidad;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class FacturaDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Producto producto;

    private double cantidad;

    private double total;

    public FacturaDetalle(){}

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

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FacturaDetalle)) return false;
        FacturaDetalle that = (FacturaDetalle) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" +
                "id=" + id +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                ", total=" + total +
                '}';
    }
}
