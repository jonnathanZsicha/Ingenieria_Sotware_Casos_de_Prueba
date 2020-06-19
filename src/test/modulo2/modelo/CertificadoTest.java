package test.modulo2.modelo;

import ec.edu.ups.modulo2.modelo.Certificado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class CertificadoTest {

    private Certificado certificado;

    @BeforeEach
    void setUp(){
        certificado = new Certificado();
    }

    @Test
    void crearCertificado() {
        Certificado retorno = certificado.crearCertificado("", new GregorianCalendar().getTime());
        Certificado esperado = new Certificado();
        assertEquals(esperado, retorno);
    }

}