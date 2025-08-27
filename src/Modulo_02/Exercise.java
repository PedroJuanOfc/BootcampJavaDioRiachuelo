package Modulo_02;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercício 1
        System.out.print("Digite um número de 1 a 10: ");
        var num = sc.nextInt();

        for (var i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }


        //Exercício 2
        System.out.println("Digite sua altura (em metros): ");
        double altura = sc.nextDouble();

        System.out.println("Digite seu peso (em kg): ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau II (Severa)");
        } else {
            System.out.println("Obesidade grau III (Morbida)");
        }


        //Exercício 3
        System.out.print("Digite o primeiro número: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int fim = sc.nextInt();

        System.out.print("Deseja ver os números pares ou ímpares? (digite 'par' ou 'impar'): ");
        String opcao = sc.next();

        for (int i = fim; i >= inicio; i--) {
            if (opcao.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i);
            }
            else if (opcao.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }

        //Exercício 4
        System.out.print("Digite o número inicial: ");
        int inicial = sc.nextInt();

        int numero;

        while (true) {
            System.out.print("Digite outro número: ");
            numero = sc.nextInt();

            if (numero < inicial) {
                System.out.println("Número ignorado (menor que o inicial).");
                continue;
            }

            if (numero % inicial != 0) {
                System.out.println("Número " + numero + " não é divisível por " + inicial + ". Encerrando...");
                break;
            }

            System.out.println("Número aceito: " + numero);
        }

        sc.close();
    }
}
