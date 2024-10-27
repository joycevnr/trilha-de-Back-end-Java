public class AboutMe {
    
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
        //rodo no terminal java AboutMe Joyce Vitória 18 1.62 no diretório bin
        //posso rodar add no arquivo launch, quando abro as conf, add os args que quero separado por vírgula dentro de um array
    }
}
