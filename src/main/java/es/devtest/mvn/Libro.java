package es.devtest.mvn;

public class Libro {

    public Persona autor;

    public Libro( Persona autor)
    {
        this.autor = autor;
    }

    public Persona getAutor()
    {
        return autor;
    }
}
