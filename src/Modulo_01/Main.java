package Modulo_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá, digite o seu nome: ");
        String name = scanner.next();

        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();

        System.out.printf("Olá %s, sua idade é %s", name, age );
    }
}
