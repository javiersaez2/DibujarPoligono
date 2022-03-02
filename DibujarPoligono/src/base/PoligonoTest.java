package base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PoligonoTest {

	@Test
	void testPoligono() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularPerimetro() {
		Poligono operaciones = new Poligono(null);
		testGetLados();
		int longitud = 10;
		int lados=6;
		int resultado =longitud*lados ;
		assertEquals(resultado,60);
	}

	@Test
	void testGetLados() {
		fail("Not yet implemented");
	}

	@Test
	void testSetLados() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLongitudLado() {
		fail("Not yet implemented");
	}

	@Test
	void testSetLongitudLado() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDibujo() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDibujo() {
		fail("Not yet implemented");
	}

}
