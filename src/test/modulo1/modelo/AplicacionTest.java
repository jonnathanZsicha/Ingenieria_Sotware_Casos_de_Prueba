package test.modulo1.modelo;

import ec.edu.ups.modulo1.modelo.Aplicacion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AplicacionTest {

    private Aplicacion aplicacion;

    @BeforeEach
    void setUp(){
        aplicacion = new Aplicacion();
    }

    @Test
    void getDescripcion() {
        String retorno = aplicacion.getDescripcion();
        String valorEsperado = "Descripcion";
        assertEquals(valorEsperado, retorno);
    }

    @Test
    void verificarRol() {
        String retorno = aplicacion.verificarRol();
        String esperado = "Admin";
        assertEquals(esperado, retorno);
    }

    @Test
    void verificarSesion() {
        boolean retorno = aplicacion.verificarSesion();
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }
}