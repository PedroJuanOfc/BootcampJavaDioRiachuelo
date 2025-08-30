package A_Praticas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();

        System.out.print("Digite seu nome: ");
        p1.setName(sc.next());

        System.out.print("Digite sua idade: ");
        p1.setAge(sc.nextInt());

        System.out.print("Digite sua altura: ");
        p1.setHeight(sc.nextDouble());

        p1.present();


    }
}
