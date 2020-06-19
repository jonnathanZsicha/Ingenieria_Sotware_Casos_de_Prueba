package test.modulo3.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ec.edu.ups.modulo3.modelo.FacturaCabecera;

class FacturaCabeceraTest {
	private FacturaCabecera f=null;
	public FacturaCabeceraTest() {
		// TODO Auto-generated constructor stub
		f=new FacturaCabecera();
	}

	@Test
	void testCalcularTotal() {
		double c=f.calcularTotal();
		assertEquals(c, 2.3);
	}

	@Test
	void testCalcularSubTotak() {
		double c=f.calcularSubTotal();
		assertEquals(c, 3.2);
	}

}
