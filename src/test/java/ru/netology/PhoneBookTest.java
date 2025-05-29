package ru.netology;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    void shouldFindNameByNumber() {
        // arrange
        PhoneBook1 phoneBook = new PhoneBook1();
        phoneBook.add("John", "123456");
        String expected = "John";

        // act
        String actual = phoneBook.findByNumber("123456");

        // assert
        assertEquals(expected, actual);
    }
}
