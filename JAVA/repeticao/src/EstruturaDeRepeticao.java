
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class EstruturaDeRepeticao {
    public static void oFor() {
        for (int indiozinhos = 1; indiozinhos <= 20; indiozinhos++) {
            System.out.println(indiozinhos);
        }
    }

    public static void forEmArrays() {
        String alunos[] = { "ANA", "JONAS", "VITOR" };
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice " + x + " é " + alunos[x]);
        }
        // forma abreviada
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é " + aluno);
        }

    }

    public static void breakContinue() {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                // break;
                continue;
            System.out.println(numero);
        }
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    public static void oWhile() {
        // não pode declarar qualquer outro método dentro de outro método.

        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Valor do doce foi " + valorDoce);
            mesada -= valorDoce;

        }

    }

    public static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;

    }

    public static void doWhile() {
        //executa uma vez, depois verifica
        //int num = 5, count = 1;
        System.out.println("Discando...");
        do{
            System.out.println("Telefone tocando");

        }while(tocando());
        System.out.println("Alô!!!!");

        
    }

    public static void main(String[] args) {
        oFor();
        forEmArrays();
        breakContinue();
        oWhile();
        doWhile();

    }

}
