package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.AnioAcademico;
import dominio.Carrera;
import dominio.Materia;

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
	void test1_5() {
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		String nombreEsperado01 = "LS";
		Carrera c02 = new Carrera("Tecnologias del DESARROLLO  DE aplicaciones Web", "Lic. Sist.", "071/08");
		String nombreEsperado02 = "TDA";
		//Act
		String actual01 = c01.getNombrePrimeraLetra();
		String actual02 = c02.getNombrePrimeraLetra();
		//AssertassertEquals(nombreEsperado, actual);
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
	}
	@Test
	void test2_1() {
		//Arrange 
		Materia m01= new Materia("Administracion de Empresas", "Ingenieria en Sistemas", AnioAcademico.I);
		String MateriaEsperada01="IS - AdmDeEmp";
		Materia m02= new Materia("Electronica Digital", "Ingenieria en Sistemas", AnioAcademico.II);
		String MateriaEsperada02="IS - EleDig";
		Materia m03= new Materia("Sistema Operativo I", "Licenciatura en Sistemas", AnioAcademico.II);
		String MateriaEsperada03="LS - SisOpeI";
		//Act 
		String actual01 = m01.getNombreMatFormato();
		String actual02 = m02.getNombreMatFormato();
		String actual03 = m03.getNombreMatFormato();
		//Assert
		assertEquals(MateriaEsperada01, actual01);
		assertEquals(MateriaEsperada02, actual02);
		assertEquals(MateriaEsperada03, actual03); 
	}

	@Test 
	void test2_2(){
		//Arrange 
		Materia m01= new Materia("Administracion de Empresas", "Ingenieria en Sistemas", AnioAcademico.I);
		String MateriaEsperada01="ISI - AdmDeEmp";
		Materia m02= new Materia("Electronica Digital", "Ingenieria en Sistemas", AnioAcademico.I);
		String MateriaEsperada02="ISI - EleDig";
		Materia m03= new Materia("Sistema Operativo I", "Licenciatura en Sistemas", AnioAcademico.II);
		String MateriaEsperada03="LSII - SisOpeI";
		//Act 
		String actual01 = m01.getNombreNumRomano();
		String actual02 = m02.getNombreNumRomano();
		String actual03 = m03.getNombreNumRomano();
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
	void test3_2() {
		//Arrange
		Carrera c01 = new Carrera("IS", "Inge. Sist.", "071/08");
		String nombreEsperado01 = "Ingenieria en Sistemas";
		Carrera c02 = new Carrera("E", "Enfe.", "071/08");
		String nombreEsperado02 = "Enfermeria";
		//Act
		String actual01 = c01.getNombreCarFormato5();
		String actual02 = c02.getNombreCarFormato5();
		//AssertassertEquals(nombreEsperado, actual);
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
	}
	@Test
	void test4_1() {
		//Ingresando solamente una parte del nombre de la materia devolver el listado de todas las
		//materias que contengan esa parte del texto.
		//Arrange
		Materia m01= new Materia("Administracacion de", "Ingenieria en Sistemas", Anio_Academico.I);
		String MateriaEsperada01="Administracion de Empresas";
		Materia m02= new Materia("Electro", "Ingenieria en Sistemas", Anio_Academico.II);
		String MateriaEsperada02="Electronica Digital"
				+ "Electrotecnia";
		Materia m03= new Materia("Sist", "Licenciatura en Sistemas", Anio_Academico.II);
		String MateriaEsperada03="Sistema Operativos I"
				+ "Sistemas Operativos II"
				+ "Sistemas I"
				+ "Sistemas II";
		//Act 
		String actual01 = m01.getNombreBusqueda();
		String actual02 = m01.getNombreBusqueda();
		String actual03 = m01.getNombreBusqueda();
		//Assert
		assertEquals(MateriaEsperada01, actual01);
		assertEquals(MateriaEsperada02, actual02);
		assertEquals(MateriaEsperada03, actual03);
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
