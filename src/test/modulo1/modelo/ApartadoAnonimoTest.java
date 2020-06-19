package test.modulo1.modelo;

import ec.edu.ups.modulo1.modelo.ApartadoAnonimo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApartadoAnonimoTest {
    private ApartadoAnonimo apartadoAnonimo;

    @BeforeEach
    void setUp(){
        apartadoAnonimo = new ApartadoAnonimo();
    }

    @Test
    void visualizarInformacionIntitucion() {
        assertEquals(false, apartadoAnonimo.visualizarInformacionIntitucion());
    }

    @Test
    void iniciarSesion() {
        String correo = "";
        String contrasena = "";
        boolean retorno = apartadoAnonimo.iniciarSesion(correo, contrasena);
        assertEquals(false, retorno);
    }
}