package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone smartphone = new Smartphone(4, "Iphone", 10000, "Apple");

    @Test
    void shouldMatchByNameIfExists() {
        String textToFind = "Iphone";
        smartphone.matches(textToFind);
        assertTrue(true);
    }

    @Test
    void shouldMatchByNameIfNotExists() {
        String textToFind = "Galaxy";
        smartphone.matches(textToFind);
        assertFalse(false);
    }

    @Test
    void shouldMatchByProducerIfExists() {
        String textToFind = "Apple";
        smartphone.matches(textToFind);
        assertTrue(true);
    }

    @Test
    void shouldMatchByProducerIfNotExists() {
        String textToFind = "Samsung";
        smartphone.matches(textToFind);
        assertFalse(false);
    }

}