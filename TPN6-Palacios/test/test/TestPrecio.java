package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPrecio {

	/**
	 * Validar que el constructor y los getter funcionan corractamentes
	 * 
	 */
	@Test
	void test01() {
		Precio p01=new Precio(15.20);
		double expectedPrecio(15.20);
	}

	/**
	 * Validar dos precios son iguales solamente si se solapan sus intervalos desde hasta 
	 * 
	 *private precio[] mis precios (producto) 
	*/
	@Test
	void test02() {
		
	}
}