package test.modulo3.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ec.edu.ups.modulo1.modelo.Usuario;
import ec.edu.ups.modulo3.modelo.Comprobante;

class ComprobanteTest {
	private Comprobante c=null;
	public ComprobanteTest() {
		// TODO Auto-generated constructor stub
		c=new Comprobante();
	}

	@Test
	void testFacturarOtraPersona() {
		Usuario u=new Usuario();
		boolean cc1=c.facturarOtraPersona(u);
		assertEquals(cc1, false);
	}

}
