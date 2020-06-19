package test.modulo2.modelo;

import ec.edu.ups.modulo2.modelo.Certificado;
import ec.edu.ups.modulo2.modelo.Cita;
import ec.edu.ups.modulo2.modelo.Paciente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    private Paciente paciente;

    @BeforeEach
    void setUp(){
        paciente = new Paciente();
    }

    @Test
    void modificarInformacion() {
        boolean retorno = paciente.modificarInformacion();
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

    @Test
    void agendarCita() {
        Timestamp timestamp = new Timestamp(1L);
        String disponibilidad = "No disponible";
        Cita retorno = paciente.agendarCita(new Timestamp(1L), disponibilidad);
        Cita esperado = new Cita();
        assertEquals(esperado, retorno);
    }

    @Test
    void agregarCertificado() {
        boolean retorno = paciente.agregarCertificado(new Certificado());
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

}