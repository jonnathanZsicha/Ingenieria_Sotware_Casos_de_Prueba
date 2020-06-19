package test.modulo2.modelo;

import ec.edu.ups.modulo2.modelo.OrdenMedica;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrdenMedicaTest {

    @Test
    void listarOrdenesMedicas() {
        OrdenMedica ordenMedica = new OrdenMedica();
        List<OrdenMedica> retorno = ordenMedica.listarOrdenesMedicas();
        List<OrdenMedica> esperado = new ArrayList<>();
        assertEquals(esperado, retorno);
    }
}