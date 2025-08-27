package Modulo_01;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva seu nome: ");
        var name = sc.next();
        System.out.print("Escreva sua idade: ");
        var age = sc.nextInt();

        System.out.printf("Olá %s, você tem %s anos! \n", name, age);

        // =============================================================

        System.out.print("Escreva o tamanho do lado do quadrado: ");
        var side = sc.nextInt();
        var area = side * side;
        System.out.printf("A área do quadrado é %s!\n", area);

        // =============================================================

        System.out.print("Escreva a base do retângulo: ");
        var base = sc.nextInt();
        System.out.print("Escreva a altura do retângulo: ");
        var height = sc.nextInt();
        var area1 = base * height;
        System.out.printf("A área do retângulo é %s!\n", area1);

        // =============================================================

        System.out.print("Escreva a idade da pessoa 1: ");
        var age1 = sc.nextInt();
        System.out.print("Escreva a idade da pessoa 2: ");
        var age2 = sc.nextInt();
        var difference = Math.abs(age1 - age2);
        System.out.printf("A diferença entre a idade das duas pessoas é de %s ano(s)!", difference);

    }
}
