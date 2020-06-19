package test.modulo1.modelo;

import ec.edu.ups.modulo1.modelo.ApartadoMedico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApartadoMedicoTest {

    private ApartadoMedico apartadoMedico;

    @BeforeEach
    void setUp(){
        apartadoMedico = new ApartadoMedico();
    }

    @Test
    void visualizarCitas() {
        List<Object> lista = new ArrayList<>();
        assertEquals(lista, apartadoMedico.visualizarCitas());
    }

    @Test
    void visualizarReporteHistoriaClinica() {
        String cedula = "0000000000";
        Object retorno = apartadoMedico.visualizarReporteHistoriaClinica(cedula);
        assertEquals(new Object(), retorno);
    }

    @Test
    void generarOrdenMedica() {
        Object paciente = new Object();
        String descripcion = "Descripcion";
        boolean retorno = apartadoMedico.generarOrdenMedica(paciente, descripcion);
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

    @Test
    void generarCertificado() {
        Object paciente = new Object();
        String descripcion = "Descripcion";
        boolean retorno = apartadoMedico.generarCertificado(paciente, descripcion);
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

    @Test
    void generarPerscripcionMedica() {
        Object paciente = new Object();
        String descripcion = "Descripcion";
        boolean retorno = apartadoMedico.generarPerscripcionMedica(paciente, descripcion);
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }
}