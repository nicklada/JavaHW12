package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product(1,"Story1",1000);

    @Test
    void shouldMatchByNameIfExists() {
        String textToFind = "Story1";
        boolean expected = true;
        boolean actual = product.matches(textToFind);
        assertEquals(expected, actual);
    }
    @Test
    void shouldMatchByNameIfNotExists() {
        String textToFind = "Story2";
        boolean expected = false;
        boolean actual = product.matches(textToFind);
        assertEquals(expected, actual);
    }

}