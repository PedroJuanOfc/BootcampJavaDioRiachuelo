package Modulo_01;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean canDrive;
        boolean isEmancipated;

        System.out.print("Quantos anos você tem? ");
        var age = scanner.nextInt();

        System.out.print("Você é emancipado? ");
        isEmancipated = scanner.nextBoolean();

        canDrive = age >= 18 || isEmancipated && age >= 16;

        System.out.println("Pode dirigir: " + canDrive);

    }
}
