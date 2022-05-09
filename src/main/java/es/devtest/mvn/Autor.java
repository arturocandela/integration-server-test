package es.devtest.mvn;

/**
 *
 * Class Author, models a Person
 * <p>
 * This class represents an Author that can have books
 * 
 * @author arturo
 *
 */
public class Autor extends Persona {
	/**
	 * Creates a new author
	 * 
	 * @param nombre Name of the author
	 * @param apellido Surname of the author
	 */
	public Autor(String nombre, String apellido) {
		super( nombre, apellido );
	}

	public void addLibro(Libro libro){



	}
	
}
