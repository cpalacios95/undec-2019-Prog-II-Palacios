package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Ejercicio10;

class Ejercicio10Test {

	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado01() {
	    int [] A={18,81,96,90,11,44,89,9,74,87,56,97,43,11,13,91,81,51,45,43,65,86,60,23,1,51,80};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado02() {
	    int [] A={82,79,43,84,50};
		assertEquals(2,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado03() {
	    int [] A={80,37,55,74,27,26,93,25,60,80,89,31,94,75,73,34,93,23,98,94,23,58,95,68,49,14,41,2,27,48,81,10,59,24,18,12,86,56,87,4,65,93,48,78,56,93,27,9,43,19,72,38,70,99,58,48,31,57};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado04() {
	    int [] A={6,45,10,12,22,83,64,59,79,53,90,90,42,29,91,38,97,40,82,40,7,26,92,78,19,90,26,96,25,15,37,66,2,66,62,50,54,37,28,84,94,78,16,69,9,48,47,54,89,59,29,93,76,58,2,81,90,58,86,80,2,79,45,87,85,64,54,72,77,47};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado05() {
	    int [] A={15,36,30,26,94,20,61,45,37,27,65,40,32,29,59,51,8,27,7,25,31,57,12,63,38,68,91,72,17,35,13,17,85,31,81,54,40,44,96,95,82,1,38,35,70,8,97,57,51,32,26,33,29,62,66,89,82,33,82,47,6,21,63,1,56,60,15,42,3,47,22,75,57,80,0,62};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado06() {
	    int [] A={86,56,49,5,51,77,23,52,43,28,95,83,12,82,84,79,92,34,20,66,98};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado07() {
	    int [] A={22,55,55,45,94,61,12,56,47,42,84,26,90,18,27,46,27,33,48,23,2,65,94,97,19,63,96,76,45,96,73,54,35,12,42,13,84,94,33,59,60,28,17,26,25,77,71,11,25,45,56,34,82,5,50,76,4,67,31,85,88,66};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado08() {
	    int [] A={14,62,34,48,57,17,60,13,1,7,5,66,43,53,18,62,40,95,14,2,53,90,42,93,7,7,91,32,58,80,58,59,61,94,45,14,50,44,94,27,24,52,61,70,1,19,50,67,10,84,53,24,56,16};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado09() {
	    int [] A={53,47,47,76,75,71,90,52,96,43,12,86,46,95,61,10,40,66,61,2};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado10() {
	    int [] A={57,44,20,97,56,12,21,46,2,61,41,88,78,53,64,11,88,51,5,18,97,5,81,10,38,2,81,30,21,67,32,48,15,66,93,74,38,96,9,74,58,43,72,5,80,38,93,23,90,25};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado11() {
	    int [] A={15,35,6,41,38,2,50,36,27,28,68,51,12,71,15,54,29,45,0,51,30,45,23,40,24,33,13,11,11,30,82,66,19,46,54,83,73,53,82,88,82};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado12() {
	    int [] A={43,92,72,81,7,48,30,5,10,58,94,17,59,79,51,49,13,22,98,15,16,26,46,40,80,77,31,83,34,85,59,22,99,68,75,54,69,33,31,42,33,82,89,57,87,94,87,21,56,46,64,10,75,62,52,95,25,24,92,21,90,83,52,88,35,57,24,70,86,61,39,40,25,93,79,3,18,46,54,1,24,15,3,71,21,16,23,50,72,47,9,75,98,52};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado13() {
	    int [] A={22,42,0,50,22,69,88,18,43,37,0,95,97,73,68,54,2,68,91,6,98,17,40,81,9,12,19,54};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado14() {
	    int [] A={13,98,90,27,16,36,8,86,58,5,12,75,97,77,89,58,32,0,46,28,42,1,72,15,32,52,28,77,29,8,79,34,60,12,79,20,5,51,96,15,38,94,91,84,0,27,8,82,14,57,50,21,56,11,35,79,80,95,99,16,14,50,2,13,26,54,81,91,79,61,0,51,90,12,29,17,42,71,99,68,78,14,81,46,61,11,27,8,77,40,52};
		assertEquals(6,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado15() {
	    int [] A={5,49,29,7,77,44,75,1,19,11,68,77,61,97,96,15,66,50,32,66,53,22,99,87,51,36,58,38,26,1,79};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado16() {
	    int [] A={44,95,84,28,95,95,98,91,42,11,0,76,62,0,89,32,37,67,55,51,94,42,91,77,98,7,26,3,27,81,40,93,70,19,80,13,47,60,39,25,40,83,74,32,91,42,73,84,45,45,67,21,54,13,76,52,9,94,48,37,10,40,28,66,28,57,5,30,76,10,53,53,51,45,87,43,76};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado17() {
	    int [] A={62,18,26,12,23,25,92,39,35,24,2,12,19,12,96,94,50,5,8,56,39,20,13,35,10,2,53,12,28,65,51,3,12,11,15,12,61,11,98,1,63,88,18,35,96,88,82,29,41,57,9,90,87,53,23,67,53,91,81,27,72,81,52,81,46,87,19,38,48,95,52,97,54,48,50,37,3,94,46,49,0,37,24,13,50,23,66,34,0,71,76,13,1,95,37,9,5,67,22};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado18() {
	    int [] A={64,71,93,3,0,67,98,61,66,36,90,45,52,89,53,29,12,50,89,35,52,88,44,54,49,48,37,93,16,40,1,90,0,25,30,65,25,49,54,9,71,27,89,91,30,68,43,90,52,23,46,41,43,78,62,99,74,60,21,76,97,55,86,24,84,90,69,10,38,38,4,56,45,38,85,61,90,51,48,19,85,64,30,18,4,75,86,88,52,3,3,73,77,48,29,50,35,18};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado19() {
	    int [] A={84,14,44,64,97,66,87,90,74,45,68,19,58,27,6,48,84,52,56,2,10,96,89,54,28,45,84,5,21,36,81,89,17,96,2,33,9,97,37,24,65,29,61,12,40,81,15,6,79,14,5,93,79,4,90,56,91,22,29,38,74,40,94};
		assertEquals(5,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado20() {
	    int [] A={11,27,42,73,45,38,29,72,81,77,71,31,88,55,18,25,68,66,0,30,39,29,82,70,32,64,48,53,48,94,66,48,52,6,97,21,49,17,41,70,96,44,41,89,37,99,72,86,68,98,34,96,95,73,13,34,69,80,25,46,12,92};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado21() {
	    int [] A={30,50,65,26,14,97,92,63,15,60,33,56,93,81,70,45,89,99,10,48,23,63,9,92,87,24,85,7,89,29,51,50,77,1,76,69,51,66,86,5,98,67,62,97,59,49,18,33,51,55,27,1,70,51,25,14,12,11,72,80,53,39,11,36,54,77,78,27,70,24,45};
		assertEquals(5,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado22() {
	    int [] A={65,48,47,27,51,96,7,92,15,13,43,57,7,66,94,96,13,36,8,62,58,72,64,1,46,38,36,56,57,45,20};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado23() {
	    int [] A={99,93,16,97,39,35};
		assertEquals(2,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado24() {
	    int [] A={4,96,53,87,1,42,38,73,52,6,34,62,22,48,83,7,32,12,70,15,6,74,54,76,85,32,97,39,85,92,75,62,60,44,8,14,81,58,76,19,80,47,24,50,33,92,8,15};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado25() {
	    int [] A={65,52,92,63,20,91,24,17,79,25,98,48,85,4,79,76,35,46,28,69,89,48,37,83,75,92,12,36,9,55};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado26() {
	    int [] A={30,75,39,80,31,9,2,81,71,96,9,63,12,42,75,40,24,88,65,15,53,7,84,49,12,85,98,6,41,17,9,56,61,94,79,85,38,79,58,49,97,67,69,12};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado27() {
	    int [] A={94,42,44,2,4,22,20,52,45,5,91,34,25,7,36,45,9,73,78,10,12,49,84,55,19,93,27,1,9,57,62,46,71,94,10,12,31,82,32,57,40,77,32,24,18,49,96,81,52,22,69,23,36,23,34,55,30,76,41,56,13,24,29,99,11,40,64,78,59,96,5,93,2,91,20,84};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado28() {
	    int [] A={96,48,88,16,94,27,35,91,54,97,90};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado29() {
	    int [] A={95,3,30,98,17};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
}
