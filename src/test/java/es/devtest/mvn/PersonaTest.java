package es.devtest.mvn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(" unitaria dels mètodes de Persona")
class PersonaTest {

    private final static String TestName = "Arturo";
    private final static String TestSurname = "Candela";

    private Persona p;
    
    @BeforeEach
    void beforeEach() {
    	p = new Persona(TestName, TestSurname);
    }
    
    @Test
    void testGetName() {

        TestPersonaHelper.testPersonaGetName(p, TestName, TestSurname);
    }

    @Test
    void testGetSurename() {

        
        TestPersonaHelper.testPersonaGetSurename(p, TestName, TestSurname);

    }

    @Test
    void testSetName() {

        TestPersonaHelper.testPersonaSetName(p, TestName, TestSurname);

    }

    @Test
    void testSetSurename() {

        TestPersonaHelper.testPersonaSetSurename(p, TestName, TestSurname);

    }
}
