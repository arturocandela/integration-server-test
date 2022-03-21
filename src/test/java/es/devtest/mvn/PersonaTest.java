package es.devtest.mvn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(" unitaria dels mètodes de Persona")
class PersonaTest {

    private final static String TestName = "Arturo";
    private final static String TestSurname = "Candela";

    @Test
    void testGetName() {

        Persona p = new Persona(TestName, TestSurname);
        assertEquals(TestName, p.getName());
    }

    @Test
    void testGetSurename() {

        Persona p = new Persona(TestName, TestSurname);
        assertEquals(TestSurname, p.getSurename());

    }

    @Test
    void testSetName() {

        Persona p = new Persona(TestName, TestSurname);
        String newName = "Art" + TestName;

        p.setName(newName);
        assertEquals(newName,p.getName());

    }

    @Test
    void testSetSurename() {

        Persona p = new Persona(TestName, TestSurname);
        String newSurname = "blabla" + TestName;

        p.setSurename(newSurname);
        assertEquals(newSurname,p.getSurename());

    }
}
