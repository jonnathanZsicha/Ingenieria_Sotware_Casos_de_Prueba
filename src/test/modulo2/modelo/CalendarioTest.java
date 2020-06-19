package test.modulo2.modelo;

import ec.edu.ups.modulo2.modelo.Calendario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarioTest {

    private Calendario calendario;

    @BeforeEach
    void setUp(){
        calendario = new Calendario();
    }

    @Test
    void consultarDisponibilidad() {
        boolean retorno = calendario.consultarDisponibilidad();
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }
}