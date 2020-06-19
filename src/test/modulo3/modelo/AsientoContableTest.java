package test.modulo3.modelo;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import ec.edu.ups.modulo3.modelo.AsientoContable;

class AsientoContableTest {
	private AsientoContable a =null; 
	public AsientoContableTest() {
		// TODO Auto-generated constructor stub
		a=new AsientoContable();
	}

	
	@Test
	void testRegistrarOperacion() {
		boolean aa=a.registrarOperacion();
		assertEquals(aa, true);
	}

}
