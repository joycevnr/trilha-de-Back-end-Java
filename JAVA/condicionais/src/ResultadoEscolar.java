public class ResultadoEscolar {
    public static void condicionalComposta() {
        int nota = 8;
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }

    public static void ternario() {
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

    }

    public static void switchCase() {
        String sigla = "M";
        switch(sigla){
            case "S":{
                System.out.println("Small");
                //break; //se entrar no primeiro case e não tiver break, ele vai imprimir os outros cases
            }
            case "M":{
                System.out.println("Medium");
                //break;
            }
            case "B":{
                System.out.println("Big");
                //break;
            }
            default:
            System.out.println("Indefinite");

        }
    
    }

    public static void main(String[] args) {
        condicionalComposta();
        ternario();
        switchCase();

    }

}
