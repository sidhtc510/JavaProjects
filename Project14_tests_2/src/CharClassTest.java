import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CharClassTest {
    CharClass var = new CharClass();

    @BeforeAll   // Аннотации могут управлять работой программы
    public static void beforeAllTests(){System.out.println("Начало тестирования");}

    @BeforeEach  // Запускаю перед каждым тестом
    public void beforeEachTest(){System.out.println("Тест начался");}

    @AfterEach
    public void afterEach(){
        System.out.println("End  Test");
    }

    @AfterAll
    public static void afterAllTest(){
        System.out.println("End All Tests");
    }

    @Test
    void testFindX() {
        assertEquals('x', var.findX('x'));
    }
}
