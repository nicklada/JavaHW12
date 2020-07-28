package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book(1,"Story1",1000,"Lada");

    @Test
    void shouldMatchByNameIfExists() {
        String textToFind = "Story1";
        book.matches(textToFind);
        assertTrue(true);
    }

    @Test
    void shouldMatchByNameIfNotExists() {
        String textToFind = "Story2";
        book.matches(textToFind);
        assertFalse(false);
    }

    @Test
    void shouldMatchByAuthorIfExists() {
        String textToFind = "Lada";
        book.matches(textToFind);
        assertTrue(true);
    }

    @Test
    void shouldMatchByAuthorIfNotExists() {
        String textToFind = "Mari";
        book.matches(textToFind);
        assertFalse(false);
    }

}