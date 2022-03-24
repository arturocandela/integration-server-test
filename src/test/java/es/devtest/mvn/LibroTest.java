package es.devtest.mvn;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LibroTest {

	@Test
	void testHashCode() {
		Autor autor = Mockito.mock(Autor.class);
		String titulo = "El título del libro";
		
		Libro l = new Libro(titulo,autor);
		
		assertEquals( Objects.hash(autor,titulo),l.hashCode() );
		
	}

	@Test
	void testLibro() {
		
		Autor autor = Mockito.mock(Autor.class);
		String tituloLibro = "Nombre del Libro";
		Libro l = new Libro(tituloLibro,autor);
		assertNotNull(l);
	
		
	}

	@Test
	void testGetAutor() {
		
		Autor autor = Mockito.mock(Autor.class);
		String tituloLibro = "Nombre del Libro";
		
		Libro l = new Libro(tituloLibro,autor);
		
		assertNotNull(l);
		assertEquals(autor,l.getAutor());
		
	}

	@Test
	void testGetNombre() {
		
		Autor autor = Mockito.mock(Autor.class);
		String tituloLibro = "Nombre del Libro";
		Libro l = new Libro(tituloLibro,autor);
		assertNotNull(l);
		assertEquals(tituloLibro, l.getNombre());
		
	}

	@Test
	void testCompareTo() {
		
		String tituloOriginal = "Titulo1";
		String tituloIgualMinusculas = tituloOriginal.toLowerCase();
		String tituloAnterior = "Alba";

		Autor autor = Mockito.mock(Autor.class);
		
		Libro original = new Libro(tituloOriginal,autor);
		
		assertEquals(0, original.compareTo(new Libro(tituloOriginal,autor)),
				"La comparación de dos libros con exactamente el mismo titulo no ha dado 0");
		assertEquals(0, original.compareTo(new Libro(tituloIgualMinusculas,autor)),
				"La comparación de dos libros con exactamente el mismo titulo en minusculas no ha dado 0");
		assertTrue( 0 < original.compareTo(new Libro(tituloAnterior,autor)),
				"La comparación de dos libros con un titulo anterior no ha dado lo correcto");
		
		
		
	}

	@Test
	void testEqualsObject() {
		
		Autor autor = Mockito.mock(Autor.class);
		String titulo = "El Titulo";
	
		
		Libro libro = new Libro(titulo,autor);
		
		Autor autor2 = Mockito.mock(Autor.class);
		String titulo2 = "El 2º título";
		
		assertEquals(true,libro.equals(libro));
		assertEquals(false,libro.equals(null));
		assertEquals(false,libro.equals(new Object()));
		
		assertEquals(true,libro.equals(new Libro(titulo, autor)));
		assertEquals(false,libro.equals(new Libro(titulo2, autor)));
		assertEquals(false,libro.equals(new Libro(titulo, autor2)));
		assertEquals(false,libro.equals(new Libro(titulo2, autor2)));

		
	}

}
