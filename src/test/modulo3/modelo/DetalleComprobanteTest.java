package test.modulo3.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ec.edu.ups.modulo3.modelo.DetalleComprobante;

class DetalleComprobanteTest {
	private DetalleComprobante dc=null;
	
	public DetalleComprobanteTest() {
		// TODO Auto-generated constructor stub
		dc=new DetalleComprobante();
	}

	@Test
	void testGetMedicamentos() {
		List medicamentos=(List) dc.getMedicamentos();
		assertEquals(medicamentos, new ArrayList());
	}

}
