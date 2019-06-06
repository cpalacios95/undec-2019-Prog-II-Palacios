package test;

import static org.junit.jupiter.api.Assertions.*;


import dominio.Alumno;
import dominio.AnioAcademico;
import dominio.Carrera;
import dominio.Implementacion;
import dominio.Materia;

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
		String actualPlan=c01.getPlan();
		
		//Assert controla
		assertEquals(expectedNombre, actualNombre);
		assertEquals(expectedAbreviatura, actualAbreviatura);
		assertEquals(expectedPlan, actualPlan); 
		
	}
	@org.junit.jupiter.api.Test
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
	@org.junit.jupiter.api.Test	void test03() {
		//Arrange
		String expectedNombre="Algoritmos";
		String expectedAbreviatura="Algorit.";
		AnioAcademico expectedAnio=AnioAcademico.I;
		
		//Act
		Materia m01= new Materia(expectedNombre, expectedAbreviatura, expectedAnio);
		String actualNombre=m01.getNombre();
		String actualAbreviatura=m01.getAbreviatura();
		AnioAcademico actualAnio=m01.getAnio();
		
		//Assert 
		assertEquals(expectedNombre, actualNombre);
		assertEquals(expectedAbreviatura, actualAbreviatura);
		assertEquals(expectedAnio, actualAnio); 
	}
	@org.junit.jupiter.api.Test
	void test04(){
		//Arrange
		Materia m01= new Materia("Algoritmos", "Algorit.", AnioAcademico.I);
		Materia m02= new Materia("Algoritmos", "Algor.", AnioAcademico.II);
		Materia m03= new Materia("Programacion II", "Porg.II", AnioAcademico.III);
		
		//Act
		boolean actual01=m01.equals(m03);
		boolean actual02=m01.equals(m02);
		
		//Assert
		
		assertEquals(false, actual01);
		assertEquals(true, actual02);
	} 
	@org.junit.jupiter.api.Test
	void test05() {
		
		//Arrange
		Carrera c01= new Carrera("Licenciatura en Sistemas", "Lic. Sis.", "071/08");
		Materia m01= new Materia("Porgramacion II", "Prog.II", AnioAcademico.III);
		Materia m02= new Materia("Sistemas II", "Sis. II", AnioAcademico.III);
		Materia m03= new Materia("Base de Datos I", "BDI", AnioAcademico.III);
		Materia m04= new Materia("Fisica III", "Fis II", AnioAcademico.III);
				
		//Act		
		boolean actual01=c01.addMateria(m01);
		boolean actual02= c01.addMateria(m01);
		boolean actual03= c01.addMateria(m02);
		boolean actual04= c01.addMateria(m03);
		boolean actual05= c01.addMateria(m04);
		//Assert 
		
		assertEquals(true,actual01);	
		assertEquals(false,actual02);
		assertEquals(true,actual03);
		assertEquals(true,actual04);;
		assertEquals(false,actual05);
		
	}
	@org.junit.jupiter.api.Test
	void test06() {
		//Arrange
		Carrera c01= new Carrera("Licenciatura en Sistemas", "Lic. Sis.", "071/08");
		Materia m01= new Materia("Porgramacion II", "Prog.II", AnioAcademico.III);
		Materia m02= new Materia("Sistemas II", "Sistemas.II", AnioAcademico.III);
		Materia m03= new Materia("Analisis III", "Ana. III", AnioAcademico.III);
		Materia m04= new Materia("Porgramacion I", "Prog.I", AnioAcademico.II);
		Materia m05= new Materia("Analisis I", "Ana.I", AnioAcademico.I);
		Materia[] listadoMaterias=new Materia[3];
		listadoMaterias[0]=m01;
		listadoMaterias[1]=m02;
		listadoMaterias[2]=m03;
		//Act	
		Materia [] actual06;
		c01.addMateria(m01);		 
		c01.addMateria(m02);
		c01.addMateria(m03);
		boolean actual03=c01.addMateria(m04);
		boolean actual04=c01.addMateria(m05);
		actual06 =c01.getMateria(AnioAcademico.III);
		
		//Assert
		assertEquals(true,actual03);
		assertEquals(true,actual04);
		assertArrayEquals(listadoMaterias, actual06);
	}
	@org.junit.jupiter.api.Test
	void test07() {
		//Arrange
		Materia m01= new Materia("Porgramacion II", "Prog.II", AnioAcademico.III);
		String fechaInicio= "12/08";
		String fechaFin="12/12";
		String anioCalendario="2019";
		Alumno[] listadoAlumnos =null;
		Implementacion imp01= new Implementacion(m01, anioCalendario, fechaInicio, fechaFin, listadoAlumnos);
		//Act
		Materia actual01=imp01.getMateria(); 	
		String actual02=imp01.getAnioCalendario();
		String actual03=imp01.getFechaInicio();
		String actual04=imp01.getFechaFin();
		Alumno [] actual05= imp01.getListadoAlumnos();
		//Assert
		assertEquals(m01, actual01); 
		assertEquals(anioCalendario, actual02);
		assertEquals(fechaInicio, actual03);
		assertEquals(fechaFin, actual04); 
		assertArrayEquals(listadoAlumnos, actual05);
	}
	
	@org.junit.jupiter.api.Test
	
	
	void test08() {
	//Arrange
	Materia m01= new Materia("Programacion II", "Prog. II", AnioAcademico.III); 
	Alumno a01= new Alumno("Palacios", "Cristian", "190352", "Ingenieria en Sistemas");
	Alumno a02= new Alumno("Palacios", "Cristian", "190352", "Ingenieria en Sistemas");
	Alumno a03= new Alumno("Cardozo", "Franco", "190353", "Ingenieria en Sistemas");
	Alumno a04= new Alumno("Chanampe", "Santiago", "190354", "Ingenieria en Sistemas");
	Alumno a05= new Alumno("Chanampe", "Santiago", "190354", "Licenciatura en Sistemas");
	Alumno a06= new Alumno("Chanampa", "Santiago", "190354", "Licenciatura en Sistemas");
	Alumno[] listadoAlumnos = new Alumno[10];
	Implementacion imp01= new Implementacion(m01, "2019", "12/08", "12/12", listadoAlumnos);
	
	
	//Act
	boolean actual01=imp01.addAlumno(a01);
	boolean actual02=imp01.addAlumno(a02);
	boolean actual03=imp01.addAlumno(a03);
	boolean actual04=imp01.addAlumno(a04);
	boolean actual05=imp01.addAlumno(a05);
	boolean actual06=imp01.addAlumno(a06);
	
	//Assert
	assertEquals(true, actual01);
	assertEquals(false, actual02);
	assertEquals(true, actual03);
	assertEquals(true, actual04);
	assertEquals(false, actual05);
	assertEquals(false, actual06);
	}
} 
