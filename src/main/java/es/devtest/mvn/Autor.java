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
public abstract class Autor extends Persona {
	/**
	 * Creates a new author
	 * 
	 * @param nombre Name of the author
	 * @param apellido Surname of the author
	 */
	public Autor(String nombre, String apellido) {
		super( nombre, apellido );
	}

	/**
	 * Método para agregar un libro escrito por el Autor
	 * @param libro libro a Agregar
	 */
	public abstract void addLibro(Libro libro);

	/**
	 * Método para eliminar un libro escrito por el autor
	 * @param libro Libro a eliminar
	 */
	public abstract void removeLibro(Libro libro);
}
