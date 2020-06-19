package test.modulo2.modelo;

import ec.edu.ups.modulo2.modelo.Prescripcion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrescripcionTest {

    private Prescripcion prescripcion;

    @BeforeEach
    void setUp(){
        prescripcion = new Prescripcion();
    }

    @Test
    void crearPrescripcion() {
        String medicamento = "Benzonsato de potasio";
        String observacion = "NA";
        Prescripcion retorno = prescripcion.crearPrescripcion(medicamento, observacion);
        Prescripcion esperado = new Prescripcion();
        assertEquals(esperado, retorno);
    }

}