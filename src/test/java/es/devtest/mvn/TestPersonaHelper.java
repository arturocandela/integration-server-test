package es.devtest.mvn;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TestPersonaHelper {
	
	static void testPersonaGetName(Persona p, String TestName, String TestSurname) {

        assertEquals(TestName, p.getName(),"El método getName no devuelve el valor esperado");

	}

    
    static void testPersonaGetSurename(Persona p, String TestName, String TestSurname) {

        assertEquals(TestSurname, p.getSurename(),"El método getSurname no devuelve el valor esperado" );

    }


    static void testPersonaSetName(Persona p, String TestName, String TestSurname) {

        String newName = "Art" + TestName;
        p.setName(newName);
        assertEquals(newName,p.getName(),"La modificación del nombre no funciona adecuadamente");

    }

    static void testPersonaSetSurename(Persona p, String TestName, String TestSurname) {

        String newSurname = "blabla" + TestName;
        p.setSurename(newSurname);
        assertEquals(newSurname,p.getSurename(),"La modificación del Apellido no funciona adecuadamente");

    }

}
