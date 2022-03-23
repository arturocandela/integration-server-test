package es.devtest.mvn;

import java.util.Objects;

public class Libro implements Comparable<Libro> {

    private Autor autor;
    private String titulo;
    
    public Libro( String titulo, Autor autor)
    {
        this.autor = autor;
        this.titulo = titulo;
    }
    
    public Persona getAutor() {
		return autor;
	}

	public String getNombre() {
		return titulo;
	}

	@Override
    public int compareTo(Libro o) {
       
    	if ( equals(o)) {
    		
    		return 0;
    		
    	} else {
    		return titulo.compareToIgnoreCase(o.titulo);
    	}
    	
    }

	@Override
	public int hashCode() {
		return Objects.hash(autor, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
	}
    
    
    
    
    


}
