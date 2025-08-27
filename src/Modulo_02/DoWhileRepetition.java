package Modulo_02;

public class DoWhileRepetition {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 3) {
            System.out.println("While: número " + i);
            i++;
        }
        // WHILE
        // Verifica a condição ANTES de executar o bloco
        // Se a condição for falsa logo de início, o bloco pode nem rodar nenhuma vez


        int j = 1;
        do {
            System.out.println("Do-While: número " + j);
            j++;
        } while (j <= 3);
        // DO-WHILE
        // Executa o bloco PELO MENOS UMA VEZ
        // mesmo que a condição seja falsa já na primeira verificação
    }
}
