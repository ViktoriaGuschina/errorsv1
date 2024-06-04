package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShopRepositoryTest {

    @Test
    void remove() {
        ShopRepository repo = new ShopRepository();
        Product product = new Product(121, "Масло", 145);
        repo.add(product);
        repo.remove(product.id);
        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.remove(121);
        });
    }

    @Test
    public void removeException() {
        ShopRepository repo = new ShopRepository();
        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.remove(121);
        });
    }

}