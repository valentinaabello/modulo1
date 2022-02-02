package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void testNombreCliente() {
		assertEquals("Valentina", new fuente.Cliente(12, "Valentina", "Calle 45", 4545).getNombre());
	}
	
	@Test
	void testRutCliente() {
		assertEquals(12, new fuente.Cliente(12, "Valentina", "Calle 45", 4545).getRut());
	}

}
