package test.modulo1.modelo;

import ec.edu.ups.modulo1.modelo.IniciarSesion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IniciarSesionTest {

    private IniciarSesion iniciarSesion;

    @BeforeEach
    void setUp(){
        iniciarSesion = new IniciarSesion();
    }

    @Test
    void verificarCredenciales() {
        boolean retorno = iniciarSesion.verificarCredenciales();
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

    @Test
    void asignarRol() {
        boolean retorno = iniciarSesion.asignarRol();
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }

    @Test
    void crearSesion() {
        boolean retorno = iniciarSesion.crearSesion();
        boolean esperado = false;
        assertEquals(esperado, retorno);
    }
}