package test.modulo3.modelo;

import ec.edu.ups.modulo3.modelo.FacturaEgreso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturaEgresoTest {

    @Test
    void calcularTotal() {
        FacturaEgreso facturaEgreso = new FacturaEgreso();

        double retorno = facturaEgreso.calcularTotal();
        double esperado = 1;
        assertEquals(esperado, retorno);
    }
}