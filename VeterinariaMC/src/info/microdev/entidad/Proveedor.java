package info.microdev.entidad;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Proveedor {

    @Id
    private String ruc;

    private String nombre;

    private String direccion;

    private String telefono;

    private String email;

    private String observaciones;

    @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL)
    private List<CompraCabecera> compraCabeceraList;

    @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL)
    private List<Producto> productoList;

    public Proveedor(){}

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<CompraCabecera> getCompraCabeceraList() {
        return compraCabeceraList;
    }

    public void setCompraCabeceraList(List<CompraCabecera> compraCabecera) {
        this.compraCabeceraList = compraCabecera;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proveedor)) return false;
        Proveedor proveedor = (Proveedor) o;
        return Objects.equals(ruc, proveedor.ruc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruc);
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "ruc='" + ruc + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", compraCabeceraList=" + compraCabeceraList +
                ", productoList=" + productoList +
                '}';
    }
}
