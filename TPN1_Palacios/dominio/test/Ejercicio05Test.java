package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Ejercicio05;

class Ejercicio05Test {
	@Test
	void sumaIndicesIgualesAValorDado00() {
	    int [][] A={{12,44,89,12,42,33,15,81,96,42,75,0,56,29,91,72,67,17,29,60,61,97,4,67},{42,92,40,31,10,31,99,56,17,63,64,10,43,53,36,24,32,10,14,84,47,10,76,67},{69,92,50,12,4,21,48,84,87,31,71,55,78,2,42,57,7,15,21,92,23,15,24,69},{86,82,69,94,2,6,63,49,49,58,21,29,68,21,39,27,73,67,80,26,35,38,47,36},{22,31,53,30,40,33,30,5,6,32,72,2,84,73,4,24,90,2,94,73,91,12,54,78},{88,60,74,37,28,25,15,73,9,23,36,53,74,9,74,14,46,43,95,85,40,28,47,92},{31,61,89,96,60,2,26,5,84,80,32,93,20,44,88,18,32,81,5,69,89,2,23,20},{86,57,25,96,70,74,25,55,94,30,78,68,88,76,34,28,4,59,3,95,73,7,42,3},{10,83,52,99,21,28,97,54,76,47,77,64,25,51,63,39,38,84,7,31,14,6,19,94},{43,81,25,54,58,23,12,86,81,42,57,51,98,70,97,57,99,10,23,17,27,10,19,46},{25,35,25,82,36,76,29,87,26,91,68,27,85,85,40,10,85,65,32,9,74,28,56,93},{71,94,50,30,17,11,36,34,25,12,55,71,59,43,81,63,11,27,8,77,68,80,47,96}};
	    int valorBuscado=79;
		assertEquals(0,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado01() {
	    int [][] A={{51,98,85,23,97,53,43,42,99,25},{52,35,15,42,58,77,39,75,15,54},{7,24,79,14,59,2,29,29,55,72},{95,14,92,4,2,64,48,98,68,89},{42,66,19,22,85,55,66,45,67,61},{60,9,15,12,80,77,31,76,48,83},{29,86,48,37,50,25,39,92,62,17},{45,15,16,60,56,21,72,2,23,22}};
	    int valorBuscado=59;
		assertEquals(6,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado02() {
	    int [][] A={{25,1,23,5,47,90,5,37,55,52,46},{61,39,41,29,92,20,12,73,37,39,74}};
	    int valorBuscado=82;
		assertEquals(0,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado03() {
	    int [][] A={{14,73,0,46,44,93,55,68,34,14,15,5,34,90,93,7,44,89,91,53,90,92,70,41},{74,99,41,56,31,30,58,49,64,36,42,19,9,10,42,84,91,80,12,60,49,99,45,23},{19,2,11,76,83,82,84,32,98,40,59,41,68,20,48,98,11,87,9,17,51,21,70,13},{43,10,22,67,15,80,18,24,30,84,51,0,24,75,66,81,4,24,96,88,52,13,84,44},{35,24,18,31,58,57,70,32,62,66,10,69,48,90,24,22,30,32,63,57,36,97,17,45},{98,50,82,60,86,54,21,20,85,47,29,31,14,77,1,20,54,90,8,70,57,57,67,89},{62,53,15,99,71,85,68,26,25,11,19,76,84,48,51,12,77,79,46,51,27,46,20,52},{17,37,79,31,34,62,89,56,72,1,2,97,59,82,83,75,32,35,51,15,66,56,52,76},{23,20,43,6,88,38,98,15,23,26,0,83,60,49,25,35,51,40,92,70,70,47,71,22},{69,53,65,51,85,12,66,69,81,19,21,29,46,59,45,44,27,22,71,80,45,56,98,68},{95,27,87,29,8,0,33,29,5,92,8,6,71,74,97,10,35,72,81,33,15,6,69,99}};
	    int valorBuscado=1;
		assertEquals(35,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado04() {
	    int [][] A={{61,86,79,24,99,99,30,16,62,30,82,29,71,76,95,38,38,12,94,37,67},{92,49,34,2,5,38,59,46,88,93,11,51,57,48,56,73,67,59,51,28,85},{47,76,38,56,59,95,41,44,13,13,66,14,43,23,1,72,83,85,81,90,7},{34,75,16,45,43,54,52,29,48,84,86,80,60,65,49,9,96,86,82,81,67},{26,63,40,82,20,5,66,37,66,71,45,7,9,44,28,19,81,24,52,9,39},{97,30,85,86,15,89,60,67,63,8,55,19,85,25,7,29,24,55,78,0,93},{89,63,43,4,98,15,33,53,41,78,27,52,81,43,12,8,78,52,95,22,29}};
	    int valorBuscado=67;
		assertEquals(72,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado05() {
	    int [][] A={{2,67,76,16,45,23,8,75,77,43,79,27},{77,97,31,27,51,53,9,1,41,2,34,54},{35,57,96,90,6,85,3,62,45,27,92,83},{60,50,58,71,57,77,51,26,19,28,59,92},{44,31,98,72,55,30,59,41,68,78,46,19},{46,51,98,47,69,2,35,27,77,27,3,83},{68,93,70,28,44,57,13,14,66,66,10,67},{44,36,53,41,23,53,32,29,44,72,34,95},{35,37,49,53,78,72,47,91,46,54,90,39}};
	    int valorBuscado=96;
		assertEquals(4,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado06() {
	    int [][] A={{67,71,68,43,76,74,40,28,57,9,7,26,80,64,42,30,77,70,10,58,0,34,31,36},{12,54,15,8,24,27,24,0,50,48,15,72,22,43,69,46,92,33,24,2,74,25,94,45},{30,18,57,73,91,0,88,76,84,38,11,78,27,6,23,62,27,88,92,80,29,96,70,41},{43,74,40,59,78,27,75,16,7,13,30,35,21,47,94,73,70,9,60,61,99,51,89,77},{86,69,60,7,10,67,59,82,24,74,68,83,68,96,46,12,57,81,73,76,54,11,21,99}};
	    int valorBuscado=96;
		assertEquals(40,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado07() {
	    int [][] A={{89,63,89,84,88,33,70,45,25,89},{42,90,45,12,55,44,31,9,58,4},{26,22,61,22,9,57,75,51,87,5},{20,73,67,98,41,7,64,5,4,55},{40,40,48,45,22,12,65,99,31,50},{30,37,79,66,56,40,40,55,66,73},{45,41,72,48,84,53,28,52,15,9}};
	    int valorBuscado=82;
		assertEquals(0,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado08() {
	    int [][] A={{57,71,56,46,59,43,58,21},{46,46,96,62,29,8,66,8},{7,87,21,94,58,68,96,64}};
	    int valorBuscado=79;
		assertEquals(0,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado09() {
	    int [][] A={{49,83,0},{52,35,43}};
	    int valorBuscado=93;
		assertEquals(0,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado10() {
	    int [][] A={{35,14,57,4,11,99,97,90,0,96,90,45,15,68,27,43,53,18,89,34,95,28},{37,37,92,53,50,54,31,61,3,31,15,5,95,29,89,18,44,91,18,61,66,69},{54,41,5,73,21,4,70,18,68,19,73,16,35,65,3,25,22,70,68,84,36,92},{5,99,51,57,80,14,4,54,29,94,20,48,55,55,42,35,34,55,29,93,24,7},{90,59,33,12,58,87,56,1,97,62,48,3,21,22,64,68,8,14,56,71,19,61},{94,96,85,28,40,47,9,83,92,69,73,37,65,40,8,81,2,39,72,14,37,72},{23,13,66,77,86,62,41,46,66,42,15,99,45,14,45,28,95,2,75,65,31,97},{14,78,91,97,28,97,64,68,87,65,57,0,99,69,4,31,0,57,17,14,68,60}};
	    int valorBuscado=96;
		assertEquals(15,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado11() {
	    int [][] A={{57,22,24,11,64,55,67,2,33,12,41,36,19,67,17,80,72,95,15,64,86,63,9,97,39,22,68,62,80,80,64},{42,37,79,94,32,64,19,66,98,79,36,95,27,27,68,87,69,46,4,73,26,16,50,19,98,69,5,89,1,11,8},{56,92,62,50,60,62,37,43,95,86,9,75,58,47,68,64,37,96,63,98,21,16,59,17,16,51,22,73,7,41,18},{99,85,4,85,71,36,21,4,86,44,53,8,10,12,55,98,9,73,38,4,8,10,53,6,79,10,86,69,40,76,66},{74,34,8,10,16,18,82,65,30,53,32,5,56,28,9,15,86,83,90,84,60,81,86,99,54,47,18,46,82,83,78},{99,74,40,53,76,35,18,11,52,51,43,67,10,53,93,89,16,39,88,45,27,64,8,15,27,38,71,37,40,75,27},{45,33,80,1,1,4,43,83,30,25,19,7,32,61,69,38,19,17,63,68,46,87,49,64,30,29,95,24,42,19,69},{41,17,84,82,83,91,71,28,74,90,28,75,39,2,70,24,81,56,14,35,57,70,61,34,92,99,35,45,1,13,81},{80,76,19,78,95,2,52,85,61,86,75,41,46,89,75,78,81,66,39,36,9,44,8,92,22,91,25,65,3,44,83},{0,31,16,58,50,73,99,54,73,16,58,11,43,69,7,35,3,82,36,5,61,47,76,34,65,42,48,63,6,16,97},{10,77,90,57,58,82,49,52,95,85,13,9,95,3,41,98,43,1,89,18,25,61,73,70,94,34,0,82,69,10,21}};
	    int valorBuscado=79;
		assertEquals(40,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado12() {
	    int [][] A={{35,13,6,56,5,7,1,37,89,0,60,87,86,21,41,56,68,45,73,74},{50,65,28,61,63,18,71,19,31,89,33,44,43,46,34,36,61,37,60,61},{92,23,52,1,57,98,97,0,84,97,14,93,83,89,11,98,64,87,63,16},{45,31,4,7,1,20,19,74,92,24,77,97,3,4,45,49,58,52,63,50},{30,69,19,87,53,56,21,75,40,50,31,99,83,65,5,54,44,84,11,44},{71,69,52,99,75,46,70,25,92,74,61,75,78,60,5,46,65,85,34,26},{82,42,93,85,48,86,21,99,24,70,86,92,31,21,90,68,9,90,78,20},{32,12,95,88,51,96,1,46,31,48,39,37,22,52,74,27,10,22,38,32},{89,29,22,24,65,39,27,16,44,95,18,68,21,85,91,59,31,68,35,48},{74,35,85,15,38,16,3,74,14,66,85,40,7,84,3,11,31,74,89,47},{80,56,51,97,94,19,54,57,78,98,53,14,53,56,45,88,85,45,30,39},{21,22,16,65,95,9,45,16,5,73,71,66,20,36,80,30,23,15,60,17},{84,38,56,50,24,58,12,24,58,70,78,0,61,84,5,83,89,33,51,55}};
	    int valorBuscado=38;
		assertEquals(51,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado13() {
	    int [][] A={{16,40,27,13,85,97,38,64,30,49,79,67,77},{10,71,14,79,65,16,8,28,25,40,72,2,28},{73,85,79,56,78,79,36,86,40,42,21,10,29}};
	    int valorBuscado=36;
		assertEquals(8,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado14() {
	    int [][] A={{0,18,24,13,77,62,73,42,5,20,36,72,95,31,96,70,85,78,74,69,99,16,48,91,10,53,99,91,45,27,69,21,32},{68,46,39,7,14,79,81,72,72,53,62,24,65,56,30,46,51,98,16,4,32,60,20,36,61,65,51,24,54,21,99,49,42},{69,54,62,69,52,88,20,26,23,21,49,26,66,41,60,73,39,33,31,51,8,42,43,70,70,51,73,10,32,1,89,93,58},{60,57,83,73,67,91,21,35,23,42,59,10,47,84,33,89,42,89,76,12,21,64,52,1,6,82,2,5,79,94,99,12,1},{91,20,20,24,63,66,68,3,47,49,98,12,86,46,56,66,42,42,58,38,55,61,48,3,66,14,69,71,78,70,82,94,45},{8,68,0,77,65,66,89,39,0,19,61,24,79,95,77,17,99,14,36,27,60,88,51,26,94,45,53,17,92,13,79,99,42},{8,31,83,61,45,63,92,29,21,41,48,5,61,55,35,16,57,87,12,89,1,54,38,61,32,16,72,92,19,0,80,99,95},{26,13,7,9,48,88,96,12,12,36,77,96,84,72,11,39,89,44,40,6,6,69,49,30,68,23,29,67,10,32,79,23,76},{83,63,5,19,40,47,90,60,43,36,28,66,37,8,66,85,75,71,23,18,16,63,74,55,45,4,8,97,9,75,15,88,13}};
	    int valorBuscado=16;
		assertEquals(120,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado15() {
	    int [][] A={{44,94,96,32,83,31,9,66,85}};
	    int valorBuscado=19;
		assertEquals(0,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado16() {
	    int [][] A={{6,36,62,64,70,70},{5,19,93,5,8,42},{0,66,52,39,77,30}};
	    int valorBuscado=75;
		assertEquals(0,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado17() {
	    int [][] A={{11,92,4,33,79,68,74,49,44,53,52,52,47,34,50,3,8,55,66,24,70,27,94,70,34,17,59,77,11,55,46,98,59,62,68,64},{37,93,1,95,9,19,60,25,56,91,18,86,23,69,75,38,78,9,78,32,10,66,39,39,8,58,56,73,36,43,42,97,8,37,91,8},{14,91,53,49,65,86,65,25,34,41,16,43,61,0,20,44,36,26,63,40,33,70,81,28,50,80,13,77,65,50,66,96,20,0,67,92},{56,61,91,27,14,82,8,52,47,92,3,26,67,17,65,56,5,44,12,28,20,99,99,86,7,34,92,30,52,67,28,27,56,62,73,87},{7,11,89,94,25,94,48,9,80,2,9,33,26,26,61,53,0,14,36,66,35,28,69,94,28,60,43,23,13,73,63,5,64,69,21,64},{32,23,13,4,24,51,0,86,73,6,74,32,26,52,91,77,51,8,47,72,16,81,23,51,12,83,7,23,2,60,13,84,71,26,28,95},{82,47,14,26,19,91,62,88,94,12,4,76,94,26,70,56,16,71,22,21,3,68,98,91,93,18,75,95,50,21,43,65,70,2,56,5},{82,6,66,18,56,37,47,22,82,60,43,78,64,51,13,46,65,8,46,53,78,98,89,81,46,67,11,35,51,6,38,90,95,22,40,94},{46,21,17,5,97,98,19,68,60,74,80,23,83,25,75,67,96,90,17,5,95,58,93,39,80,0,93,64,1,0,59,90,31,35,43,4},{86,44,19,38,30,16,35,48,65,42,48,35,57,60,20,78,9,42,81,16,72,70,3,45,77,71,60,33,80,82,31,60,84,51,74,86},{2,81,69,53,67,72,12,78,18,17,12,51,14,64,59,36,92,73,57,40,77,35,97,80,70,75,24,89,74,74,90,35,10,39,15,61},{58,32,75,16,4,2,37,34,16,36,79,39,79,80,31,14,5,86,27,21,4,37,90,6,57,54,39,86,29,81,45,79,2,81,0,87},{36,6,66,38,88,29,62,7,83,51,0,91,10,61,24,2,66,36,37,83,60,24,76,4,30,8,92,4,65,77,26,86,2,9,27,38},{91,95,33,62,38,29,64,78,10,16,9,81,91,30,50,24,59,39,82,23,55,38,91,63,50,74,24,28,35,44,56,72,7,7,71,87},{49,66,11,10,34,26,15,1,66,54,56,77,36,33,30,83,31,43,51,70,57,27,59,35,33,94,66,54,10,30,88,65,19,67,96,27}};
	    int valorBuscado=97;
		assertEquals(76,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado18() {
	    int [][] A={{96,56,13,11,59,52,1,73,81,93,3,50,16,64,30,97,55,88},{0,59,16,50,16,36,57,83,60,47,72,92,84,3,11,48,21,14}};
	    int valorBuscado=10;
		assertEquals(0,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}
	@Test
	void sumaIndicesIgualesAValorDado19() {
	    int [][] A={{66,63,45,96,51,76,37,85,22,99},{55,7,41,78,75,21,32,93,81,0},{1,15,18,28,91,61,33,46,44,76},{95,7,4,24,37,7,52,48,66,83},{85,3,32,27,80,39,63,48,14,93},{51,84,57,96,18,95,7,3,0,92},{26,13,98,20,89,46,74,57,49,15},{17,17,80,19,78,32,80,92,95,18}};
	    int valorBuscado=22;
		assertEquals(8,Ejercicio05.sumaIndicesIgualesAValorDado(A,valorBuscado));
	}

}