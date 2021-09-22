package la;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RenduTest {

    @Test
    void rendutostirng(){
        Rendu ru = new Rendu("oui","oui","oui");
        ru.toString();

        Rendu lui = new Rendu("oui","oui","oui");

        Assertions.assertEquals(ru.toString(), lui.toString());
    }

    @Test
    void renduram(){
        Rendu ru = new Rendu("oui","oui","oui");
        ru.toString();

        Rendu lui = new Rendu("oui","oui","oui");

        Assertions.assertNotEquals(ru, lui);
    }

}