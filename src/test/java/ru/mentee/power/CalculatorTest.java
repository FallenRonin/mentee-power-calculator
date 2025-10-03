package ru.mentee.power;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты калькулятора")
class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Тест операции сложения")
    void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-8, calculator.add(-5, -3));
    }
    // 🔎 ВАША ЗАДАЧА: Найдите и исправьте ошибку в этом тесте! 🔎
    @Test
    @DisplayName("Тест операции вычитания")
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-10, calculator.subtract(-5, 5));
        // Ой! В этой строке есть ошибка в ожидаемом результате. Найдите и исправьте её:
        assertEquals(-8, calculator.subtract(-5, -3));
    }

    @Test
    @DisplayName("Тест операции умножения")
    void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(-15, calculator.multiply(-5, 3));
        assertEquals(15, calculator.multiply(-5, -3));
    }

    @Test
    @DisplayName("Тест операции деления")
    void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2));
        assertEquals(-2.5, calculator.divide(-5, 2));
        assertEquals(2.5, calculator.divide(-5, -2));
    }

    // 🔥 ВАША ЗАДАЧА: Дописать этот тест! 🔥
    @Test
    @DisplayName("Тест деления на ноль")
    void testDivideByZero() {
        // 🤔 Вопрос: Что произойдет, если разделить на ноль?
        // Давайте попробуем это проверить!

        // Шаг 1: Создайте переменную типа Exception, которая будет хранить пойманное исключение

        // Шаг 2: Используйте метод assertThrows для проверки, что вызов calculator.divide(5, 0)
        // выбрасывает исключение ArithmeticException
        // Подсказка: assertThrows возвращает исключение, которое было выброшено

        // Шаг 3: Проверьте, что сообщение в исключении содержит текст "Деление на ноль"
        // Подсказка: используйте метод assertEquals для сравнения строк
    }
}