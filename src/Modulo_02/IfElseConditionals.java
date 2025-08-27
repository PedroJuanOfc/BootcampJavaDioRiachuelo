package Modulo_02;

import java.util.Scanner;

public class IfElseConditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        var name = sc.next();
        System.out.println("Informe sua idade: ");
        var age = sc.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = sc.next().equals("s");

        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
        var message = "";
        if (canDrive) {
            message = name + ", você pode dirigir";
        } else {
            message = name + ", você não pode dirigir";
        }

        System.out.println(message);
    }
}
