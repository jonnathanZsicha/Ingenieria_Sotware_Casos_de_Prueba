package test.modulo2.modelo;

import ec.edu.ups.modulo2.modelo.HistorialClinico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class HistorialClinicoTest {

    private HistorialClinico historialClinico;

    @BeforeEach
    void setUp(){
        historialClinico = new HistorialClinico();
    }

    @Test
    void buscarHistorial() {
        HistorialClinico retorno = historialClinico.buscarHistorial();
        HistorialClinico esperado = new HistorialClinico();
        assertEquals(esperado, retorno);
    }

    @Test
    void crearHistorialClinico() {
        boolean retorno = historialClinico.crearHistorialClinico();
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

    @Test
    void agregarHistoriaClinica() {
        Date fecha = new GregorianCalendar().getTime();
        String observaciones = "Observaciones";
        boolean retorno = historialClinico.agregarHistoriaClinica(fecha, observaciones);
        boolean esperado = true;
        assertEquals(esperado, retorno);
    }
}