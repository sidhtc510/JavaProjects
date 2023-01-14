import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human human = new Human(12, "Anya", 'f');

    @Test
    public void checkName(){
        assertEquals("Anya", human.getName());
    }

    @Test
    public void checkAge(){
        assertEquals(12, human.getAge());
    }

    @Test
    public void isUnderAge(){
        assertTrue(human.getAge() >= 18);
    }

    @Test
    public void checkFatherName(){
        assertNotNull(human.getFatherName());
    }

}
