package utils;

import com.github.javafaker.Faker;

public class DataGeneration {

    private DataGeneration() {
    }
    static Faker faker = new Faker();
    public static String userName() {
        return faker.name().username();
    }
}
