package org.hannmx;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan","Smirnov",30);
        Person person1 = new Person();
        person1.setFirstName("Nikita");
        person1.setLastName("Sokolov");
        person1.setAge(23);

        System.out.println("Person: " + person);
        System.out.println("Person: " + person1);
    }
}