package test.modulo3.modelo;

import ec.edu.ups.modulo3.modelo.Medicamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicamentoTest {

    @Test
    void crearMedicamento() {
        boolean retorno = new Medicamento().crearMedicamento(new Medicamento());
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }


}