package es.devtest.mvn;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.NoSuchElementException;

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
	void testRemoveAnInexistentAutor() {

		Autor autor = Mockito.mock(Autor.class);
		Autor autor2 = Mockito.mock(Autor.class);

		l.addAutor(autor);
		verify(autor,times(1)).addLibro(l);
		assertEquals(1,l.getAuthorsCount());

		assertThrowsExactly(NoSuchElementException.class,()->{
			l.removeAuthor(autor2);
		});

		verify(autor,times(0)).removeLibro(l);

	}

	@Test
	void testCannotAddMoreThanFiveAuthors(){

		Autor[] autors = new Autor[6];

		//Generamos 6 autores
		for (int i = 0; i < 6; i++) {
			autors[i] = Mockito.mock(Autor.class);
		}

		//Agregamos 5
		for (int i = 0; i < 5; i++) {
			l.addAutor(autors[i]);
		}

		//Comprobamos que funciona
		assertEquals(5,l.getAuthorsCount());

		assertThrowsExactly(MaximumNumbersOfAuthorsAlreadyReached.class,()->{
			l.addAutor(autors[5]);
		});

	}

	@Test
	void testGetNombre() {

		Autor autor = Mockito.mock(Autor.class);
		String tituloLibro = "Nombre del Libro";
		Libro l = new Libro(tituloLibro);
		assertNotNull(l);
		assertEquals(tituloLibro, l.getTitulo());

	}

	@Test
	void getAutorSortedByName() {

		Autor autor0 = Mockito.mock(Autor.class);
		when(autor0.getName()).thenReturn("Pepe");

		Autor autor1 = Mockito.mock(Autor.class);
		when(autor1.getName()).thenReturn("Jose");

		Autor autor2 = Mockito.mock(Autor.class);
		when(autor2.getName()).thenReturn("jose");

		Autor autor3 = Mockito.mock(Autor.class);
		when(autor3.getName()).thenReturn("angel");

		l.addAutor(autor0);
		l.addAutor(autor1);
		l.addAutor(autor2);
		l.addAutor(autor3);

		//Comprobamos el orden
		Autor autoresOrdenados[] = l.getAutorSortedByName();

		assertEquals(autor3.getName(),autoresOrdenados[0].getName());
		assertEquals(autor1.getName(),autoresOrdenados[1].getName());
		assertEquals(autor2.getName(),autoresOrdenados[2].getName());
		assertEquals(autor0.getName(),autoresOrdenados[3].getName());



	}
}