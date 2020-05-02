package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone smartphone = new Smartphone(4,"Iphone",10000,"Apple");

    @Test
    void shouldMatchByNameIfExists() {
        String textToFind = "Iphone";
        boolean expected = true;
        boolean actual = smartphone.matches(textToFind);
        assertEquals(expected, actual);
    }
    @Test
    void shouldMatchByNameIfNotExists() {
        String textToFind = "Galaxy";
        boolean expected = false;
        boolean actual = smartphone.matches(textToFind);
        assertEquals(expected, actual);
    }
    @Test
    void shouldMatchByProducerIfExists() {
        String textToFind = "Apple";
        boolean expected = true;
        boolean actual = smartphone.matches(textToFind);
        assertEquals(expected, actual);
    }
    @Test
    void shouldMatchByProducerIfNotExists() {
        String textToFind = "Samsung";
        boolean expected = false;
        boolean actual = smartphone.matches(textToFind);
        assertEquals(expected, actual);
    }
}