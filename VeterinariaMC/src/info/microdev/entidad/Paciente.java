package info.microdev.entidad;

import javax.persistence.*;
import java.util.GregorianCalendar;
import java.util.List;

@Entity
public class Paciente {

    @Id
    private int id;

    private String nombre;
    private String clase;
    private String genero;
    private String direccion;

    @Temporal(TemporalType.DATE)
    private GregorianCalendar fechaNacimiento;

    private String raza;
    private String pelaje;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cliente cliente;

    private String ciudad;

    private String edad;

    @OneToMany(mappedBy = "paciente")
    private List<RegistroMedico> registroMedico;

    public Paciente(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public List<RegistroMedico> getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(List<RegistroMedico> registroMedico) {
        this.registroMedico = registroMedico;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", clase='" + clase + '\'' +
                ", genero='" + genero + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", raza='" + raza + '\'' +
                ", pelaje='" + pelaje + '\'' +
                ", cliente=" + cliente +
                ", ciudad='" + ciudad + '\'' +
                ", edad='" + edad + '\'' +
                ", registroMedico=" + registroMedico +
                '}';
    }
}
