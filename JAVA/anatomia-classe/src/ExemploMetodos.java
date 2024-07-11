public class ExemploMetodos {
    
    // Método estático
    public static void metodoEstatico() {
        System.out.println("Este é um método estático.");
    }
    //static faz um método ou variável pertencer à classe ao invés de às instâncias
    
    // Método não estático (ou de instância)
    public void metodoNaoEstatico() {
        System.out.println("Este é um método não estático.");
    }
    
    public static void main(String[] args) {
        // Chamando o método estático diretamente pela classe
        ExemploMetodos.metodoEstatico();
        
        // Criando uma instância da classe para chamar o método não estático
        ExemploMetodos exemplo = new ExemploMetodos();
        exemplo.metodoNaoEstatico();
    }
}

