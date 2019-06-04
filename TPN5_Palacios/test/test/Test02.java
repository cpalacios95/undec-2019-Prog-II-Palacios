package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Carrera;

class Test02 {

	@Test
	void test01_1() {
		//Arrange 
		Carrera c01= new Carrera("Licenciatura en Sistemas","Lic. Sist.","128/08");
		String nombreEsperado="LICENCIATURA EN SISTEMAS"; 
		
		//Act
		String actual=c01.getNombreEnMayuscula();
		
		//Assert
		assertEquals(nombreEsperado, actual);
	}

	@Test
	void test01_2() {
		//Arrange
		Carrera c01= new Carrera("Licenciatura en Sistemas","Lic. Sist.","128/08");
		String nombreEsperado01="Licenciatura en sistemas"; 
		Carrera c02= new Carrera("Abogacia","Abog.","138/08");
		String nombreEsperado02="Abogacia"; 
		Carrera c03= new Carrera("Abogacia","Abog.","138/08");
		String nombreEsperado03="Abogacia"; 
		Carrera c04= new Carrera("aBOGACIA","Abog.","138/08");
		String nombreEsperado04="Abogacia"; 
		
		//Act
		String actual01=c01.getNombreOracion();
		String actual02=c02.getNombreOracion();
		String actual03=c03.getNombreOracion();
		String actual04=c04.getNombreOracion();
		//Assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);
		assertEquals(nombreEsperado04, actual04);
	}
	@Test
	void test01_4() {
		//Arrange
		Carrera c01= new Carrera("Licenciatura en Sistemas","Lic. Sist.","128/08");
		String nombreEsperado01="Licen. Siste."; 
		Carrera c02= new Carrera("Abogacia","Abog.","138/08");
		String nombreEsperado02="Aboga."; 
		Carrera c03= new Carrera("Asdd","Abog.","138/08");
		String nombreEsperado03="Asdd."; 
		//Act 
		String actual01=c01.getNombreAbrev();
		String actual02=c02.getNombreAbrev();
		String actual03=c03.getNombreAbrev();
		
		//Assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);
	}
	@Test 
	void test2_2() {
		//Arrange 
		Materia m01= new Materia("Administracion de Empresas", "Ingenieria en Sistemas", anio_academico.I);
		String MateriaEsperada01="ISI- ADE";
		Materia m02= new Materia("Electronica Digital", "Ingenieria en Sistemas", anio_academico.II);
		String MateriaEsperada02="ISI- ED";
		Materia m03= new Materia("Sistema Operativo I", "Licenciatura en Sistemas", anio_academico.II);
		String MateriaEsperada03="LSII- SOI";
		//Act 
		String actual01 = m01.getNombreNumRomano();
		String actual02 = m01.getNombreNumRomano();
		String actual03 = m01.getNombreNumRomano();
		//Assert
		assertEquals(MateriaEsperada01, actual01);
		assertEquals(MateriaEsperada02, actual02);
		assertEquals(MateriaEsperada03, actual03);
	}
	@Test
	void test3_1() {
		//Arrange
		Carrera c01= new Carrera("Ingenieria en Sistemas", "Ing Sis");
		Carrera c02= new Carrera("Ingenieria en Mecatronica", "Ing Mec");
		Carrera c03= new Carrera("Ingenieria Agronomica", "Ing Agro");
		Carrera c04= new Carrera("Licenciatura en Sistemas", "Lic Sis");
		Carrera c05= new Carrera("Licenciatura en Enologia", "Lic Enolog.");
		Carrera c06= new Carrera("Tecnicatura en Administracion de Empresas", "Tec Adm Emp");
		Carrera c07= new Carrera("Tecnicatura en Analsis de Alimentos", "Tec Anali Alimen");
		String ListadoEsperado01=("Ingenieria en Sistemas"
				+ "Ingenieria en Mecatronica"
				+ "Ingenieria Agronomica");
		String ListadoEsperado02=("Licenciatura en Sistemas"
				+ "Licenciatura en Enologia");
		String ListadoEsperado03=("Tecnicatura en 0Administracion de Emperesas"
				+ "Tecnicatura en Analisis de Alimentos");
				
		//Act
		String actual01= c01.getListadoCarrera();
		String actual02= c04.getListadoCarrera();
		String actual03= c06.getListadoCarrera();
		//Assert
		assertEquals(ListadoEsperado01, actual01);
		assertEquals(ListadoEsperado02, actual02);
		assertEquals(ListadoEsperado03, actual03);
	}
	@Test
	void test5_1() {
		//Arrange
		Alumno a01= new Alumno("Cerezo Jose Guillermo");
		Alumno a02= new Alumno("gallegos Yamil");
		Alumno a03= new Alumno("PorTUgal MatiAS");
		Alumno a04= new Alumno("TRIADOr DANIELA");
		String AlumnoEsperado01= "Cerezo, Jose Guillermo";
		String AlumnoEsperado02= "Gallegos, Yamil";
		String AlumnoEsperado03= "Portugal, Matias";
		String AlumnoEsperado04= "Triador, Daniela";
		//Act
		String actual01= a01.getNombreAlumno();
		String actual02= a01.getNombreAlumno();
		String actual03= a03.getNombreAlumno();
		String actual04= a04.getNombreAlumno();
		//Assert
		assertEquals(AlumnoEsperado01, actual01);
		assertEquals(AlumnoEsperado02, actual02);
		assertEquals(AlumnoEsperado03, actual03);
		assertEquals(AlumnoEsperado04, actual04);
	}
} 
