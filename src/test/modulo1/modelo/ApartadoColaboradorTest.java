package test.modulo1.modelo;

import ec.edu.ups.modulo1.modelo.ApartadoColaborador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApartadoColaboradorTest {

    private ApartadoColaborador apartadoColaborador;

    @BeforeEach
    void setUp(){
        apartadoColaborador = new ApartadoColaborador();
    }

    @Test
    void generarFacturaIngreso() {
        boolean retorno = apartadoColaborador.generarFacturaIngreso(new Object(), new Object());
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

    @Test
    void generarFacturaEngreso() {
        boolean retorno = apartadoColaborador.generarFacturaEngreso(new Object());
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }
}