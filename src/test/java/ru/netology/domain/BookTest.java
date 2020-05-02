package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book(1,"Story1",1000,"Lada");

    @Test
    void shouldMatchByNameIfExists() {
        String textToFind = "Story1";
        boolean expected = true;
        boolean actual = book.matches(textToFind);
        assertEquals(expected, actual);
    }
    @Test
    void shouldMatchByNameIfNotExists() {
        String textToFind = "Story2";
        boolean expected = false;
        boolean actual = book.matches(textToFind);
        assertEquals(expected, actual);
    }
    @Test
    void shouldMatchByAuthorIfExists() {
        String textToFind = "Lada";
        boolean expected = true;
        boolean actual = book.matches(textToFind);
        assertEquals(expected, actual);
    }
    @Test
    void shouldMatchByAuthorIfNotExists() {
        String textToFind = "Mari";
        boolean expected = false;
        boolean actual = book.matches(textToFind);
        assertEquals(expected, actual);
    }
}