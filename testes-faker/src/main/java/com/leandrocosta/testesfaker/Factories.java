package com.leandrocosta.testesfaker;

import com.github.javafaker.Faker;

public class Factories {
    private static Faker faker = new Faker();

    public static User createUser() {
        return new User (
            faker.name().username(),
            faker.internet().password(),
            faker.name().fullName(),
            faker.internet().emailAddress()
        );
    }
}
