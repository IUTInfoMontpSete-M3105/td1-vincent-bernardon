package la;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoursTest {

    @Test
    void courstostirng(){
        Cours ru = new Cours("oui",1);
        ru.toString();

        Cours lui = new Cours("oui",1);

        Assertions.assertEquals(ru.toString(), lui.toString());
    }

    @Test
    void corusram(){
        Cours ru = new Cours("oui",1);
        ru.toString();

        Cours lui = new Cours("oui",1);

        Assertions.assertNotEquals(ru, lui);
    }

}