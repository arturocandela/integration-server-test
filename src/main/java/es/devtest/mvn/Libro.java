package es.devtest.mvn;

import java.util.*;

/**
 * Esta clase modela un libro, se utiliza para relacionarla con la
 * base de datos
 * 
 * @author Arturo Candela Moltó
 *
 */
public class Libro {

    private List<Autor> autors = new ArrayList<>();
    private String titulo;

    
    public Libro( String titulo)
    {
        this.titulo = titulo;

    }

    /**
     * 
     * @return String con el título del libro
     */
	public String getTitulo() {
		return titulo;
	}

    /**
     * Agrega un autor como autor del libro
     *
     * @param autor Autor a Agregar
     * @exception MaximumNumbersOfAuthorsAlreadyReached Si se agregan más de 5 autores
     */
	public void addAutor(Autor autor) {

        if (autors.size() == 5 ){
            throw new MaximumNumbersOfAuthorsAlreadyReached();
        }
        autors.add(autor);
        autor.addLibro(this);
	}

    /**
     * Elimina un autor del array
     * @param autor Autor a eliminar
     * @exception NoSuchElementException En el caso de que no se encuentre el autor
     */
    public void removeAuthor(Autor autor){


        if (autors.remove(autor)){
            autor.removeLibro(this);
        } else {
            throw new NoSuchElementException();
        }

    }

    /**
     * Obtiene la cantidad de autores que tiene este libro
     *
     * @return el número de autores del libro
     */
    public int getAuthorsCount() {
        return autors.size();
    }

    public Autor[] getAutors() {

        Autor[] array = new Autor[autors.size()];
        return autors.toArray(array);

    }

    /**
     * Obtiene los autores ordenados por su nombre de pila
     *
     * @return El vector con los nombres de los autores ordenado por nombre
     */
    public Autor[] getAutorSortedByName()
    {
        Autor[] autors = getAutors();

        Arrays.sort(autors, new Comparator<Autor>() {
            @Override
            public int compare(Autor o1, Autor o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

        return autors;

    }

}
