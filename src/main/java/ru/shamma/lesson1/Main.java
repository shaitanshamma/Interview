package ru.shamma.lesson1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .firstName("Vasyl")
                .lastName("Gaikin")
                .middleName("Ivanovich")
                .country("Russia")
                .address("aa").build();

        person.info();
    }
}
