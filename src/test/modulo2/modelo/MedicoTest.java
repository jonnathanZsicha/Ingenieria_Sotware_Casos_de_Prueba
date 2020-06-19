package test.modulo2.modelo;

import ec.edu.ups.modulo2.modelo.Cita;
import ec.edu.ups.modulo2.modelo.Medico;
import ec.edu.ups.modulo2.modelo.Prescripcion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    private Medico medico;

    @BeforeEach
    void setUp(){
        medico = new Medico();
    }

    @Test
    void actualizarDatos() {
        boolean retorno = medico.actualizarDatos();
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

    @Test
    void visualizarDatos() {
        Medico retorno = medico.visualizarDatos();
        Medico esperado = new Medico();
        assertEquals(esperado, retorno);
    }

    @Test
    void consultarDisponibilidad() {
        boolean retorno = medico.consultarDisponibilidad();
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

    @Test
    void agregarOrdenMedica() {
        String servicio = "Servicio";
        String descripcion = "Descripcion";
        boolean retorno = medico.agregarOrdenMedica(servicio, descripcion);
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

    @Test
    void agregarPrescripcion() {
        boolean retorno = medico.agregarPrescripcion(new Prescripcion());
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

    @Test
    void agregarCitaMedica() {
        boolean retorno = medico.agregarCitaMedica(new Cita());
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

}