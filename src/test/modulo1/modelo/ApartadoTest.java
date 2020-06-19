package test.modulo1.modelo;

import ec.edu.ups.modulo1.modelo.Apartado;
import org.junit.jupiter.api.BeforeEach;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class ApartadoTest {

    private String descripcion;
    private java.util.Calendar tiempoActividad;
    private Apartado apartado;

    @BeforeEach
    void setUp() throws Exception{
        this.descripcion = "descripcion";
        this.tiempoActividad = new GregorianCalendar();
        apartado = new Apartado();
    }

    @org.junit.jupiter.api.Test
    void cerrarSesion() {
        boolean resultadoEsperado = false;
        boolean resultadoObtenido = apartado.cerrarSesion();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @org.junit.jupiter.api.Test
    void getTiempoActividad() {
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").format("22/04/1999"), apartado.getTiempoActividad());
    }

}