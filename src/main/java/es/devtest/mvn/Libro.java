package es.devtest.mvn;

public class Libro implements Comparable {

    public Persona autor;

    public Libro( Persona autor)
    {
        this.autor = autor;
    }

    public Persona getAutor()
    {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int compareTo(Object o) {
        return 1;
    }
}
