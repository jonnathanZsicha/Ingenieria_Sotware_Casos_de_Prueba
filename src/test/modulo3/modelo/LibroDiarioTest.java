package test.modulo3.modelo;

import ec.edu.ups.modulo3.modelo.AsientoContable;
import ec.edu.ups.modulo3.modelo.LibroDiario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibroDiarioTest {

    private LibroDiario libroDiario;

    @BeforeEach
    void setUp(){
        libroDiario = new LibroDiario();
    }

    @Test
    void calcularIngresos() {
        double retorno = libroDiario.calcularIngresos();
        double esperado = 1;
        assertEquals(esperado, retorno);
    }

    @Test
    void calcularEgresos() {
        double retorno = libroDiario.calcularEgresos();
        double esperado = 23;
        assertEquals(esperado, retorno);
    }

    @Test
    void calcularSaldoDisponible() {
        double retorno = libroDiario.calcularSaldoDisponible();
        double esperado = 100;
        assertEquals(esperado, retorno);
    }

    @Test
    void visualizarAsientosContables() {
        List<AsientoContable> retorno = libroDiario.visualizarAsientosContables();
        List<AsientoContable> esperado = new ArrayList<>();
        assertEquals(esperado, retorno);
    }

    @Test
    void generarReportes() {
        boolean retorno = libroDiario.generarReportes();
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }
}