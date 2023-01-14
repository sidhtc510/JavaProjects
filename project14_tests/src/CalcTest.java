import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    /*
     * Задача
     * Написать тесты для остальных методов класса Calculator
     */

    Calculator calculator = new Calculator();

    @BeforeAll // Аннотации могут управлять работой программы
    public static void beforeAllTests() {
        System.out.println("Начало тестирования");
    }

    @BeforeEach // Запускаю перед каждым тестом
    public void beforeEachTest() {
        System.out.println("Тест начался");
    }

    @Test // Аннотация
    public void testAdd() {
        System.out.println("Начинаем тест суммы: ");
        assertEquals(4, calculator.sum(2, 2));
    } // Устанавливаю ожидаемое значение и вызываю метод для проверки

    @Test
    public void testDiv() {
        System.out.println("Начинаем тест деления: ");
        assertNotEquals(1, calculator.div(3, 2));
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Тест завершился");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Тесты завершены");
    }

}
