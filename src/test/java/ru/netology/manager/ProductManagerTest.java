package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);
    Book first = new Book(1,"Story1",1000,"Lada");
    Book second = new Book(2,"Story2",2000,"Mari");
    Smartphone apple = new Smartphone(4,"Iphone",10000,"Apple");
    Smartphone nokia = new Smartphone(5,"New",10000,"Nokia");
    Book fourth = new Book(7,"New",3000,"Peter");

   @BeforeEach
    void setup() {
        manager = new ProductManager(repository);
        manager.productAdd(first);
        manager.productAdd(second);
        manager.productAdd(apple);
        manager.productAdd(nokia);
    }

    @Test
   void shouldFindBookByNameIfExists() {
        String textToFind = "Story2";
        Product[] expected = new Product[]{second};
        Product[] actual = manager.searchBy(textToFind);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindBookByAuthorIfExists() {
        String textToFind = "Lada";
        manager.searchBy(textToFind);
        Product[] expected = new Product[]{first};
        Product[] actual = manager.searchBy(textToFind);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldNotFindBookByNameIfNotExists() {
        String textToFind = "Story3";
        manager.searchBy(textToFind);
        Product[] expected = new Product[]{};
        Product[] actual = manager.searchBy(textToFind);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldNotFindBookByAuthorIfNotExists() {
        String textToFind = "Natali";
        manager.searchBy(textToFind);
        Product[] expected = new Product[]{};
        Product[] actual = manager.searchBy(textToFind);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindSmartByNameIfExists() {
        String textToFind = "Iphone";
        manager.searchBy(textToFind);
        Product[] expected = new Product[]{apple};
        Product[] actual = manager.searchBy(textToFind);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindSmartByProducerIfExists() {
        String textToFind = "Nokia";
        manager.searchBy(textToFind);
        Product[] expected = new Product[]{nokia};
        Product[] actual = manager.searchBy(textToFind);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldNotFindSmartByNameIfNotExists() {
        String textToFind = "Galaxy";
        manager.searchBy(textToFind);
        Product[] expected = new Product[]{};
        Product[] actual = manager.searchBy(textToFind);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldNotFindSmartByProducerIfNotExists() {
        String textToFind = "Samsung";
        manager.searchBy(textToFind);
        Product[] expected = new Product[]{};
        Product[] actual = manager.searchBy(textToFind);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindSmartAndBookWithTheSameName() {
        manager.productAdd(fourth);
        String textToFind = "New";
        manager.searchBy(textToFind);
        Product[] expected = new Product[]{nokia,fourth};
        Product[] actual = manager.searchBy(textToFind);
        assertArrayEquals(expected, actual);
    }

}