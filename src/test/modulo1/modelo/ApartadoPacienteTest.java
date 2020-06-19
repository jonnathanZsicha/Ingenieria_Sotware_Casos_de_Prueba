package test.modulo1.modelo;

import ec.edu.ups.modulo1.modelo.ApartadoPaciente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApartadoPacienteTest {

    private ApartadoPaciente apartadoPaciente;

    @BeforeEach
    void setUp(){
        apartadoPaciente = new ApartadoPaciente();
    }

    @Test
    void setFecha() {
        Object retorno = apartadoPaciente.setFecha(new GregorianCalendar());
        Object esperado = new Object();
        assertEquals(esperado, retorno);
    }

    @Test
    void verPrescriciones() {
        List retorno = (List) apartadoPaciente.verPrescriciones();
        List esperado = new ArrayList();
        assertEquals(esperado, retorno);
    }

    @Test
    void verComprobantesVentas() {
        List retorno = (List) apartadoPaciente.verComprobantesVentas();
        List esperado = new ArrayList();
        assertEquals(esperado, retorno);
    }

    @Test
    void verCertificados() {
        List retorno = (List) apartadoPaciente.verCertificados();
        List esperado = new ArrayList();
        assertEquals(esperado, retorno);
    }
}