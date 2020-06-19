package test.modulo2.modelo;

import ec.edu.ups.modulo2.modelo.HistoriaClinica;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HistoriaClinicaTest {

    @Test
    void consultarHistoriaClinica() {
        HistoriaClinica retorno = new HistoriaClinica().consultarHistoriaClinica();
        HistoriaClinica espearado = new HistoriaClinica();
        assertEquals(espearado, retorno);
    }

}