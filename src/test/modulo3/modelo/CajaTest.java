package test.modulo3.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ec.edu.ups.modulo3.modelo.Caja;

class CajaTest {
	private Caja c=null;
	public CajaTest() {
		// TODO Auto-generated constructor stub
		c=new Caja();
	}

	@Test
	void testVerificarSaldo() {
		boolean cc=c.verificarSaldo();
		assertEquals(cc, false);
	}

	@Test
	void testEmviarTransaccion() {
		boolean cc1=c.emviarTransaccion();
		assertEquals(cc1, false);
	}

}
