package info.microdev.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
public class Cliente {

    @Id
    private String cedula;

    private String nombre;
    private String telefono;
    private String direccion;

    @OneToMany(mappedBy = "cliente")
    private List<DeudaCabecera> deudaCabeceraList;

    @OneToMany(mappedBy = "cliente")
    private List<FacturaCabecera> facturaCabeceraList;

    @OneToMany(mappedBy = "cliente")
    private List<Paciente> pacienteList;

    public Cliente(){}

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<DeudaCabecera> getDeudaCabeceraList() {
        return deudaCabeceraList;
    }

    public void setDeudaCabeceraList(List<DeudaCabecera> deudaCabeceraList) {
        this.deudaCabeceraList = deudaCabeceraList;
    }

    public List<FacturaCabecera> getFacturaCabeceraList() {
        return facturaCabeceraList;
    }

    public void setFacturaCabeceraList(List<FacturaCabecera> facturaCabeceraList) {
        this.facturaCabeceraList = facturaCabeceraList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cedula, cliente.cedula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", deudaCabeceraList=" + deudaCabeceraList +
                '}';
    }
}
