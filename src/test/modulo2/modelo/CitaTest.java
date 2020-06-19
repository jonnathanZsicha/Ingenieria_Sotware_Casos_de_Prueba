package test.modulo2.modelo;

import ec.edu.ups.modulo2.modelo.Cita;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class CitaTest {

    private Cita cita;

    @BeforeEach
    void setUp(){
        cita = new Cita();
    }

    @Test
    void crearCita() {
        Cita retorno = cita.crearCita(new GregorianCalendar().getTime(), "Disponible");
        Cita esperado = new Cita();
        assertEquals(esperado, retorno);
    }

    @Test
    void modificarCita() {
        boolean retorno = cita.modificarCita(new Cita());
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

    @Test
    void eliminarCita() {
        boolean retorno = cita.eliminarCita(new Cita());
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

    @Test
    void consultarCita() {
        Cita retorno = cita.consultarCita();
        Cita esperado = new Cita();
        assertEquals(esperado, retorno);
    }

}