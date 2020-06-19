package test.modulo1.modelo;

import ec.edu.ups.modulo1.modelo.ApartadoAdministrador;
import ec.edu.ups.modulo1.modelo.Usuario;

import static org.junit.jupiter.api.Assertions.*;

class ApartadoAdministradorTest {

    @org.junit.jupiter.api.Test
    void registrarUsuario() {
        Usuario usuario = new Usuario();
        boolean retorno = new ApartadoAdministrador().registrarUsuario(usuario);
        assertEquals(false, retorno);
    }
}