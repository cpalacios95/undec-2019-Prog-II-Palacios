package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProducto {

	/**}
	 * Validar el constructor de producto junto con los getter de nombre y codigo.
	 * 
	 */
	@Test
	void test01() {
		//Arrange
		String expectedNombre="Harina";
		String expectedCodigo="7805";
		Fecha fechaDesde01= new Fecha(1, 10, 2019);
		Fecha fechaHasta01= new Fecha(31, 10, 2019);
		
		Fecha fechaDesde02= new Fecha(1, 11, 2019);
		Fecha fechaHasta02= new Fecha(30, 11, 2019);
		
		Fecha fechaDesde03= new Fecha(1, 12, 2019);
		Fecha fechaHasta03= new Fecha(31, 12, 2019);
		
		Producto [] listaProducto=new Producto();
		//Act
		Producto p01=new Producto(15.50, fechaDesde01, fechaHasta01);
		Producto p02=new Producto(16.20, fechaDesde02, fechaHasta02);
		Producto p03=new Producto(18.50, fechaDesde03, fechaHasta03);
		
		String actualNombre= p01.getNombre();
		String actualCodigo= p01.getCodigo();
		
		//Assert
		assertEquals(expectedNombre, actualNombre);
		assertEquals(expectedCodigo, actualCodigo);
	}
	
	/**}
	 * Validar que un producto devuelva como precio -1 cuando no tiene cargado ningun precio.
	 * 
	 */
	@Test
	void test02() {
	
	}
	
	/**}
	 * Validar que un producto cargue adecuadamente varios precio (con fechas distintas pero siemre progresivas)
	 * y en medio de cada carga que el metodo getLastPrecio funcione adecuadamente.
	 * 
	 */
	@Test
	void test03() {
		
	}
	
	/**}
	 * Validar que un producto no cargue un nuevo precio cuando la fechas se solapen 
	 * a la última.
	 * 
	 */
	@Test
	void test04() {
		
	}
	
	/**}
	 * Validar que el método removeLastPrecio elimine adecuadamente los precios.
	 * 
	 */
	@Test
	void test05() {
		
	}

}