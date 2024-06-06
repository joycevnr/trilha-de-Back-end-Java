
//classe com o mesmo nome do arquivo
//Classes: PascalCase (e.g., MinhaClasse)
//Métodos e Variáveis: camelCase (e.g., meuMetodo, minhaVariavel)
public class MinhaClasse{ //classe executável tem o método main: tem a capacidade de realizar uma inicialização do projeto
    
    public static void main (String [] args) {
        System.out.print ("Olá Mundo");

        final String BR = "Brasil"; //final- variável que não é alterável, a variável toda em maiúscula nunca é alterada
 
        String concatenacao = "?";
        
        concatenacao = "1" + 1 + 1 + 1; //só concatenou: 1111
        System.out.println(concatenacao);
       
        concatenacao = 1 + "1" + 1 + 1; //só concatenou: 1111 - quando ele detecta uma string ele só concatena
        System.out.println(concatenacao);
        
        concatenacao = "1" + ( 1 + 1 + 1 ); // 13
        System.out.println(concatenacao);
        int numero = 5;

        System.out.println(numero ++);//ainda não soma +1 quando imprimi, só soma após imprimir
        System.out.println(++ numero);
        
        //Operador ternário
        int a, b;
        a = 6;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        
    }
}