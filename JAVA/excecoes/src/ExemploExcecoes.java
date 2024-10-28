import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
// duas subcategorias de exceções: checked \ unchecked
public class ExemploExcecoes {

    // 1. Exemplo de método com `throws` para propagação de exceções
    public static void lerArquivo(String caminho) throws IOException {
        // Abre o arquivo e pode lançar uma exceção se o arquivo não existir
        FileReader arquivo = new FileReader(caminho);
        arquivo.close(); // Fecha o arquivo depois de abrir
    }

    // 2. Exemplo de exceção personalizada: estender a classe Exception (ou uma de suas subclasses).
    public static class IdadeInvalidaException extends Exception {
        public IdadeInvalidaException(String mensagem) {
            super(mensagem);
        }
    }

    // Método que lança exceção personalizada
    //O throws é usado na declaração de um método para indicar que ele pode lançar uma ou mais exceções.
    public static void validarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            //throw - Lança uma exceção manualmente, útil para interromper o fluxo ao encontrar um erro específico.
            throw new IdadeInvalidaException("Idade deve ser maior ou igual a 18.");
        }
    }

    // 3. Método `try-with-resources`
    public static void lerArquivoSeguro(String caminho) {
        try (FileReader fr = new FileReader(caminho)) {
            // Código para ler o arquivo
            System.out.println("Arquivo lido com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
    }

    // 4. Método que usa `throw` para lançar uma exceção manualmente
    public static void verificarNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
    }

    // 5. Exemplo de método que usa `try-catch-finally` e `catch` multicatch
    public static void dividirArray() {
        try {
            int[] array = new int[5];
            int resultado = 10 / 0; // Causa `ArithmeticException`
            array[10] = resultado;   // Causa `ArrayIndexOutOfBoundsException`
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Bloco `catch` multicatch para tratar duas exceções diferentes
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Bloco `finally` que sempre executa, mesmo com exceções
            System.out.println("Operação finalizada.");
        }
    }

    // 6. Método que usa um `while` com valores aleatórios
    public static void gastarMesada() {
        double mesada = 50.0;

        // Loop `while` que continua enquanto houver mesada
        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            // Se o valor do doce for maior que o restante da mesada, compra com o restante
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Comprou doce de valor " + valorDoce);
            mesada -= valorDoce;
        }

        System.out.println("Mesada acabou.");
    }

    // Método auxiliar para gerar valores aleatórios (entre 2 e 8) para `gastarMesada`
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    // 7. Método principal para chamar todos os métodos
    public static void main(String[] args) {
        // Exemplo `try-catch` com `throws`
        try {
            lerArquivo("caminho/invalido.txt");
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }

        // Exemplo de exceção personalizada
        try {
            validarIdade(16);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro de idade: " + e.getMessage());
        }

        // Exemplo de `try-with-resources`
        lerArquivoSeguro("caminho/invalido.txt");

        // Exemplo de `throw`
        try {
            verificarNome(""); // Nome inválido
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Exemplo `try-catch-finally` e `catch` multicatch
        dividirArray();

        // Exemplo de loop `while` com valores aleatórios
        gastarMesada();

        // try {
        //     // Código que pode lançar uma exceção
        // } catch (TipoDeExcecao e) {
        //     // Lidar com a exceção
        // } finally {
        //     // Código que sempre será executado
        // }
        
        
    }
}
