package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    void shouldFindNameByNumber() {
        // arrange
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "123456");
        String expected = "John";

        // act
        String actual = phoneBook.findByNumber("123456");

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindNumberByName() {
        // Подготовка (Arrange)
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "987654");  // Добавляем контакт для проверки
        String expectedNumber = "987654";   // Ожидаемый номер

        // Действие (Act)
        String actualNumber = phoneBook.findByName("Alice");

        // Проверка (Assert)
        assertEquals(expectedNumber, actualNumber);
    }
}
