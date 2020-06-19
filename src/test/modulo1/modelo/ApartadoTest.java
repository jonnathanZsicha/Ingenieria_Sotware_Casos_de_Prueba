package test.modulo1.modelo;

import ec.edu.ups.modulo1.modelo.Apartado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
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

    @Test
    void cerrarSesion() {
        boolean resultadoEsperado = false;
        boolean resultadoObtenido = apartado.cerrarSesion();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    void getTiempoActividad() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm/DD/yyyy");
        String date = simpleDateFormat.format(new GregorianCalendar().getTime());
        assertEquals(date, apartado.getTiempoActividad());
    }

}