package test;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test01() {
		//Arrange donde prepara 
		String expectedNombre="Licenciatura en Enologia";
		String expectedAbreviatura="Lic. Enolog";
		String expectedPlan="128/12";
		
		//Act ejecuta
		Carrera c01= new Carrera(expectedNombre, expectedAbreviatura, expectedPlan);
		String actualNombre=c01.getNombre();
		String actualAbreviatura=c01.getAbreviatura();
		String actualPlan=c01.getPlan;
		
		//Assert controla
		assertEquals(expectedNombre, actualNombre);
		assertEquals(expectedAbreviatura, actualAbreviatura);
		assertEquals(expectedPlan, actualPlan); 
		
	}

	void test02() {
		//Arrange	
		Carrera c01= new Carrera("Licenciatura en Sistemas", "Lic. Sis.", "071/08");
		Carrera c02= new Carrera("Licenciatura en Sistemas", "Lic. Sis.", "070/08");
		Carrera c03= new Carrera("Ingenieria en Sistemas", "Lic. Sis.", "071/08");
		
		//Act
		
		boolean actual01=c01.equals(c02);
		boolean actual02=c01.equals(c03);
		
		//Assert 
		assertEquals(false,actual01);
		assertEquals(true,actual02);
	}
	
	void test03() {
		//Arrange
		String expectedNombre="Algoritmos";
		String expectedAbreviatura="Algorit.";
		AnioAcademico expectedAnio=AnioAcademico.I;
		
		//Act
		Materia m01= new Materia(expectedNombre, expectedAbreviatura, AnioAcademico);
		String actualNombre=m01.getNombre();
		String actualAbreviatura=m01.getAbreviatura();
		AnioAcademico actualAnio=m01.getAnio;
		
		//Assert 
		assertEquals(expectedNombre, actualNombre);
		assertEquals(expectedAbreviatura, actualAbreviatura);
		assertEquals(expectedAnio, actualAnio); 
	}
	
	void test04(){
		//Arrange
		Materia m01= new Materia("Algoritmos", "Algorit.", AnioAcademico.I);
		Materia m02= new Materia("Algortimos", "Algor.", AnioAcademico.I);
		Materia m03= new Materia("Programacion II", "Porg.II", AnioAcaddemico.III);
		
		//Act
		boolean actual01=m01.equals(m02);
		boolean actual02=m01.equals(m03);
		
		//Assert
		
		assertEquals(true, actual01);
		assertEquals(false, actual02);
	} 
	
	void test05() {
		
		//Arrange
		Carrera c01= new Carrera("Licenciatura en Sistemas", "Lic. Sis.", "071/08");
		Materia m01= new Materia("Porgramacion II", "Prog.II", AnioAcademico.III);
		String listadoMaterias[]= {"Programacion II"};
				
		//Act		
		boolean actual01=c01.addMateria(m01);
		String [] actual02 =c01.getMaterias(AnioAcademico.III);
		
		//Assert
		
		assertEquals(true,actual01);
		assertArrayEquals(listadoMaterias, actual02);
		
	}
	
	void test06() {
		//Arrange
		Carrera c01= new Carrera("Licenciatura en Sistemas", "Lic. Sis.", "071/08");
		Materia m01= new Materia("Porgramacion II", "Prog.II", AnioAcademico.III);
		String listadoMaterias[]= {"Programacion II"};
		
		//Act		
		boolean actual01=c01.addMateria(m01);		
		boolean actual02=c01.addMateria(m01);
		String [] actual03 =c01.getMaterias(AnioAcademico.III);
		
		//Assert
		assertEquals(true,actual01);
		assertEquals(false,actual02);
		assertArrayEquals(listadoMaterias, actual03);
	}

	void test07() {
		//Arrange 
		Carrera c01= new Carrera("Ingenieria en Sistemas", "Ing. Sis.", "071/08");
		Materia m01= new Materia("Porgramacion I", "Prog.I", AnioAcademico.II);
		Materia m02= new Materia("Sistemas Operativos I", "SOI", AnioAcademico.II);
		Materia m03= new Materia("Sistemas Operativos II", "SOII", AnioAcademico.II);
		Materia m04= new Materia("Analisis Matematico II", "Ana. Mat. II", AnioAcademico.II);

		//Act
		boolean actual01=c01.addMateria(m01);
		boolean actual02=c01.addMateria(m02);
		boolean actual03=c01.addMateria(m03);
		boolean actual04=c01.addMateria(m04);
		
		//Assert
		assertEquals(true,actual01);
		assertEquals(true,actual02);
		assertEquals(true,actual03);
		assertEquals(false,actual04);
	}
	
	void test08() {
		//Arrange 
		Materia m01= new Materia("Porgramacion I", "Prog.I", AnioAcademico.II);
		String fechaInicio= "12/12/2012";
		String aniCalendario="2019";
		Alumnos listadoAlumnos[]= null; 
		String fechaFin= "12/12/2013";
		Implementacion imp01= new Implementacion(m01, aniCalendario, fechaInicio, fechaFin, listadoAlumnos);
		
		//Act
		materia actual01= imp01.getMateria();
		String actual02= imp01.getAnioCalendario();
		String actual03= imp01.getFechaInicio();
		String actual04= imp01.getFechaFin();
		Alumnos [] actual05= imp01.getListadoAlumnnos();
		//Assert
		assertEquals(m01, actual01);
		assertArrayEquals(listadoAlumnos,actual05); 
	}
	
	void test09() {
		
	}
}

