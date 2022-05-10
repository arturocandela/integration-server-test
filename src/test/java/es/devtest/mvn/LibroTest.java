package es.devtest.mvn;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.NoSuchElementException;

class LibroTest {

	private static final String TEST_NO_IMPLEMENTAT = "Test no Implementat";
	String tituloLibro = "Nombre del Libro";
	Libro l;

	@BeforeEach
	void setUpLibro()
	{
		l = new Libro(tituloLibro);
	}

	@AfterEach
	void tearDown(){
		l = null;
	}

	@Test
	void createLibro() {

		assertNotNull(l);
	
	}

	@Test
	void testAddOneAutor() {

		fail(TEST_NO_IMPLEMENTAT);

	}

	@Test
	void testRemoveOneAutor() {

		fail(TEST_NO_IMPLEMENTAT);

	}

	@Test
	void testRemoveAnInexistentAutor() {

		fail(TEST_NO_IMPLEMENTAT);

	}

	@Test
	void testCannotAddMoreThanFiveAuthors(){

		fail(TEST_NO_IMPLEMENTAT);

	}

	@Test
	void testGetNombre() {

		Libro l = new Libro(tituloLibro);
		assertNotNull(l);
		assertEquals(tituloLibro, l.getTitulo());
		
	}

	@Test
	void getAutorSortedByName() {

		fail(TEST_NO_IMPLEMENTAT);

	}
}
