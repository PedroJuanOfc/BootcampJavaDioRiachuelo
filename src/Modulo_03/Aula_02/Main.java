package Modulo_03.Aula_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Pedro Juan", 24);

        System.out.println("Nome: " + person.name());
        System.out.println("Idade: " + person.age());
    }
}