package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Fecha;

class TestFecha {
	/**
	 * Validar que al construir una fecha con datos valido los metodos getDia(), getMes() y getAnio() devuelvan los valores adecuados.
	 * constructor met get
	 */
	@Test
	void test01() {
		//Arrange 
		Fecha f01= new Fecha(15, 06, 2019);
		int expectedDia=15;
		int expectedMes=06;
		int expectedAnio=2019;
		//Act
		int actual01=f01.getDia();
		int actual02=f01.getMes();
		int actual03=f01.getAnio();
		//Assert
		assertEquals(expectedDia, actual01);
		assertEquals(expectedMes, actual02);
		assertEquals(expectedAnio, actual03);
	}

	/**
	 * Validar que al construir una fecha con datos valido el metodo getFechaCorta devuelva con el formato adecuado.
	 * Hacer pruebas con dias de uno y dos digitos, con meses de uno y dos digitos.
	 * 
	 */
	@Test
	void test02() {
		//Arrange
		Fecha f01= new Fecha(30, 6, 2019);
		String expected01="30/6/19";
		Fecha f02= new Fecha(29, 1, 2019);
		String expected02="29/1/19";
		Fecha f03= new Fecha(1, 12, 2019);
		String expected03="01/12/19";
		Fecha f04= new Fecha(02, 12, 2019);
		String expected04="02/12/19";
		Fecha f05= new Fecha(11, 12, 2019);
		String expected05="11/12/19";
		//Act
		String actual01= f01.getFechaCorta();
		String actual02= f02.getFechaCorta();
		String actual03= f03.getFechaCorta();
		String actual04= f04.getFechaCorta();
		String actual05= f05.getFechaCorta();
		//Assert
		assertEquals(expected01, actual01);
		assertEquals(expected02, actual02);
		assertEquals(expected03, actual03);
		assertEquals(expected04, actual04);
		assertEquals(expected05, actual05);
	}
	/**
	 * Validar que al construir una fecha con valores de dias no valido la fecha construida sea 01/01/1900.
	 * Tomar en cuenta valores mayores y menores a los validos para cada mes.
	 */
	@Test
	void test03() {
		//Arrange
		
		Fecha f01= new Fecha(-1, 1, 2019);
		String expected01="01/01/1900";
		Fecha f02= new Fecha(32, 1, 2019);
		String expected02="01/01/1900";
		Fecha f03= new Fecha(-1, 2, 2019);
		String expected03="01/01/1900";
		Fecha f04= new Fecha(29, 2, 2019);
		String expected04="01/01/1900";
		Fecha f05= new Fecha(-1, 3, 2019);
		String expected05="01/01/1900";
		Fecha f06= new Fecha(32, 3, 2019);
		String expected06="01/01/1900";
		Fecha f07= new Fecha(-1, 4, 2019);
		String expected07="01/01/1900";
		Fecha f08= new Fecha(31, 4, 2019);
		String expected08="01/01/1900";
		Fecha f09= new Fecha(-1, 5, 2019);
		String expected09="01/01/1900";
		Fecha f10= new Fecha(32, 5, 2019);
		String expected10="01/01/1900";
		Fecha f11= new Fecha(-1, 6, 2019);
		String expected11="01/01/1900";
		Fecha f12= new Fecha(31, 6, 2019);
		String expected12="01/01/1900";
		Fecha f13= new Fecha(-1, 7, 2019);
		String expected13="01/01/1900";
		Fecha f14= new Fecha(32, 7, 2019);
		String expected14="01/01/1900";
		Fecha f15= new Fecha(-1, 8, 2019);
		String expected15="01/01/1900";
		Fecha f16= new Fecha(32, 8, 2019);
		String expected16="01/01/1900";
		Fecha f17= new Fecha(-1, 9, 2019);
		String expected17="01/01/1900";
		Fecha f18= new Fecha(31, 9, 2019);
		String expected18="01/01/1900";
		Fecha f19= new Fecha(-1, 10, 2019);
		String expected19="01/01/1900";
		Fecha f20= new Fecha(32, 10, 2019);
		String expected20="01/01/1900";
		Fecha f21= new Fecha(-1, 11, 2019);
		String expected21="01/01/1900";
		Fecha f22= new Fecha(31, 11, 2019);
		String expected22="01/01/1900";
		Fecha f23= new Fecha(-1, 12, 2019);
		String expected23="01/01/1900";
		Fecha f24= new Fecha(32, 12, 2019);
		String expected24="01/01/1900";


		//Act
		String actual01= f01.getFechaCorta();
		String actual02= f02.getFechaCorta();
		String actual03= f03.getFechaCorta();
		String actual04= f04.getFechaCorta();
		String actual05= f05.getFechaCorta();
		String actual06= f06.getFechaCorta();
		String actual07= f07.getFechaCorta();
		String actual08= f08.getFechaCorta();
		String actual09= f09.getFechaCorta();
		String actual10= f10.getFechaCorta();
		String actual11= f11.getFechaCorta();
		String actual12= f12.getFechaCorta();
		String actual13= f13.getFechaCorta();
		String actual14= f14.getFechaCorta();
		String actual15= f15.getFechaCorta();
		String actual16= f16.getFechaCorta();
		String actual17= f17.getFechaCorta();
		String actual18= f18.getFechaCorta();
		String actual19= f19.getFechaCorta();
		String actual20= f20.getFechaCorta();
		String actual21= f21.getFechaCorta();
		String actual22= f22.getFechaCorta();
		String actual23= f23.getFechaCorta();
		String actual24= f24.getFechaCorta();

		//Assert
		assertEquals(expected01, actual01);
		assertEquals(expected02, actual02);
		assertEquals(expected03, actual03);
		assertEquals(expected04, actual04);
		assertEquals(expected05, actual05);
		assertEquals(expected06, actual06);
		assertEquals(expected07, actual07);
		assertEquals(expected08, actual08);
		assertEquals(expected09, actual09);
		assertEquals(expected10, actual10);
		assertEquals(expected11, actual11);
		assertEquals(expected12, actual12);
		assertEquals(expected13, actual13);
		assertEquals(expected14, actual14);
		assertEquals(expected15, actual15);
		assertEquals(expected16, actual16);
		assertEquals(expected17, actual17);
		assertEquals(expected18, actual18);
		assertEquals(expected19, actual19);
		assertEquals(expected20, actual20);
		assertEquals(expected21, actual21);
		assertEquals(expected22, actual22);
		assertEquals(expected23, actual23);
		assertEquals(expected24, actual24);

	}
	
	/**
	 * Validar que al construir una fecha con valores de meses no valido la fecha construida sea 01/01/1900.
	 * Tomar en cuenta valores mayores y menores.
	 * 
	 */
	@Test
	void test04() {
		//Arrange
		Fecha f01= new Fecha(5, -1, 2019);
		String expected01="01/01/1900";
		Fecha f02= new Fecha(15, 55, 2019);
		String expected02="01/01/1900";
		//Act
		String actual01= f01.getFechaCorta();
		String actual02= f02.getFechaCorta();
		//Assert
		assertEquals(expected01, actual01);
		assertEquals(expected02, actual02);
	}
		
	/**
	 * Validar equals de fecha.
	 * Tanto el true como el false.
	 */
	@Test
	void test05() {
		//Arrange
		Fecha f01= new Fecha(5, 12, 2019);
		Fecha f02= new Fecha(5, 12, 2019);
		Fecha f03= new Fecha(13, 11, 2019);
		//Act
		boolean actual01= f01.equals(f02);
		boolean actual02= f01.equals(f03);
		//Assert
		assertEquals(true, actual01);
		assertEquals(false, actual02);
	}
	
	/**
	 * Validar el metodo esMayorQue(Fecha).
	 * Hacer pruebas con fechas mayores, menores e iguales.
	 * En los primeros dos casos hacer pruebas que difieran solo en el dia, luego solo en el mes, luego solo en el anio.
	 * Luego en el dia y anio y finalmente los tres valores.
	 * 
	 */
	@Test
	void test06() {
		//Arrange 
		Fecha f01= new Fecha(5, 10, 2019);
		Fecha f02= new Fecha(12, 10, 2019);
		Fecha f03= new Fecha(3, 10, 2019);
		Fecha f04= new Fecha(5, 10, 2019);
		Fecha f05= new Fecha(5, 11, 2019);
		Fecha f06= new Fecha(5, 9, 2019);
		Fecha f07= new Fecha(5, 10, 2019);
		Fecha f08= new Fecha(5, 12, 2020);
		Fecha f09= new Fecha(6, 12, 2018);
		Fecha f10= new Fecha(5, 10, 2019);
		//Act
		boolean actual01=f01.esMayorQue(f02);
		boolean actual02=f01.esMayorQue(f03);
		boolean actual03=f01.esMayorQue(f04);
		boolean actual04=f01.esMayorQue(f05);
		boolean actual05=f01.esMayorQue(f06);
		boolean actual06=f01.esMayorQue(f07);
		boolean actual07=f01.esMayorQue(f08);
		boolean actual08=f01.esMayorQue(f09);
		boolean actual09=f01.esMayorQue(f10);
		//Assert
		assertEquals(true, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(true, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(true, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
	}
	
	
}