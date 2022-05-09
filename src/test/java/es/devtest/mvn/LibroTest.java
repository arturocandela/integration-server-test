package es.devtest.mvn;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LibroTest {

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
		
		Autor autor = Mockito.mock(Autor.class);

		l.addAutor(autor);
		verify(autor,times(1)).addLibro(l);
		assertEquals(1,l.getAuthorsCount());
		assertEquals(autor,l.getAutors()[0]);
	}


	@Test
	void testRemoveOneAutor() {

		Autor autor = Mockito.mock(Autor.class);
		l.addAutor(autor);
		verify(autor,times(1)).addLibro(l);
		assertEquals(1,l.getAuthorsCount());
		l.removeAuthor(autor);
		verify(autor,times(1)).removeLibro(l);
		assertEquals(0,l.getAuthorsCount());

	}


	@Test
	void testGetNombre() {
		
		Autor autor = Mockito.mock(Autor.class);
		String tituloLibro = "Nombre del Libro";
		Libro l = new Libro(tituloLibro);
		assertNotNull(l);
		assertEquals(tituloLibro, l.getTitulo());
		
	}

}
