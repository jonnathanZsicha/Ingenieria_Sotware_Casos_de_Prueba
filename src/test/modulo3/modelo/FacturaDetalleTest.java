package test.modulo3.modelo;

import ec.edu.ups.modulo3.modelo.FacturaDetalle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturaDetalleTest {

    private FacturaDetalle facturaDetalle;

    @BeforeEach
    void setUp(){
        facturaDetalle = new FacturaDetalle();
    }

    @Test
    void calcularTotalDetalle() {
        int cantidad = 1;
        double precio = 123.20;
        double retorno = facturaDetalle.calcularTotalDetalle(cantidad, precio);
        double esperado = 123.20;
        assertEquals(esperado, retorno);
    }
}