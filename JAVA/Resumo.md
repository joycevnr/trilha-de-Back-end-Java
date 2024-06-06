# Plano de Estudos em Java

## Introdução
Java é uma das linguagens de programação mais populares e amplamente utilizadas no mundo. É conhecida por sua portabilidade, desempenho e robustez. Este plano de estudos é voltado para iniciantes e visa fornecer uma base sólida nos conceitos fundamentais de Java.

## Sumário

1. [Preparação do Ambiente de Desenvolvimento](#1-preparação-do-ambiente-de-desenvolvimento)
    1. [Instalação do JDK](#11-instalação-do-jdk)
    2. [Instalação de uma IDE (Integrated Development Environment)](#12-instalação-de-uma-ide-integrated-development-environment)
2. [Conceitos Básicos de Programação](#2-conceitos-básicos-de-programação)
    1. [Estrutura de um Programa Java](#21-estrutura-de-um-programa-java)
    2. [Sintaxe Básica](#22-sintaxe-básica)
    3. [Estruturas de Controle](#23-estruturas-de-controle)
3. [Conceitos Avançados de Programação](#3-conceitos-avançados-de-programação)
    1. [Métodos](#31-métodos)
    2. [Classes e Objetos](#32-classes-e-objetos)
    3. [Encapsulamento](#33-encapsulamento)
4. [Conceitos de Programação Orientada a Objetos (POO)](#4-conceitos-de-programação-orientada-a-objetos-poo)
    1. [Herança](#41-herança)
    2. [Polimorfismo](#42-polimorfismo)
    3. [Abstração e Interfaces](#43-abstração-e-interfaces)
5. [Estruturas de Dados em Java](#5-estruturas-de-dados-em-java)
    1. [Arrays](#51-arrays)
    2. [Coleções do Java (Java Collections Framework)](#52-coleções-do-java-java-collections-framework)
6. [Manipulação de Arquivos](#6-manipulação-de-arquivos)
    1. [Leitura e Escrita de Arquivos](#61-leitura-e-escrita-de-arquivos)
7. [Trabalhando com Banco de Dados](#7-trabalhando-com-banco-de-dados)
    1. [JDBC (Java Database Connectivity)](#71-jdbc-java-database-connectivity)
8. [Práticas Recomendadas](#8-práticas-recomendadas)
    1. [Convenções de Código](#81-convenções-de-código)
    2. [Comentários e Documentação](#82-comentários-e-documentação)

## 1. Preparação do Ambiente de Desenvolvimento

### 1.1. Instalação do JDK
- Baixe e instale o JDK (Java Development Kit) mais recente do site oficial da Oracle ou OpenJDK.
  - [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
  - [OpenJDK](https://openjdk.java.net/install/)

### 1.2. Instalação de uma IDE (Integrated Development Environment):
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  - [Eclipse](https://www.eclipse.org/)
  - [NetBeans](https://netbeans.apache.org/)

## 2. Conceitos Básicos de Programação

### 2.1. Estrutura de um Programa Java
A estrutura básica de um programa Java inclui uma definição de classe e um método principal. Vamos detalhar cada parte:

#### Exemplo:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

#### Explicação:

1. **Declaração de Classe:**
   ```java
   public class HelloWorld {
   ```
   - `public`: Modificador de acesso que torna a classe acessível a outras classes.
   - `class`: Palavra-chave que define uma nova classe.
   - `HelloWorld`: Nome da classe. Em Java, é uma convenção nomear classes usando PascalCase.

2. **Método Principal:**
   ```java
   public static void main(String[] args) {
   ```
   - `public`: Modificador de acesso que torna o método acessível a outras classes.
   - `static`: Permite que o método seja chamado sem precisar instanciar a classe.
   - `void`: Indica que o método não retorna nenhum valor.
   - `main`: Nome do método principal que serve como ponto de entrada para o programa.
   - `String[] args`: Parâmetro que aceita uma matriz de strings, permitindo a passagem de argumentos de linha de comando.

3. **Corpo do Método:**
   ```java
   System.out.println("Hello, World!");
   ```
   - `System.out.println`: Método que imprime uma mensagem no console.

### 2.2. Sintaxe Básica
#### Variáveis e Tipos de Dados
```java
int numero = 10;
double decimal = 3.14;
char caractere = 'A';
boolean verdade = true;
```

- `int`: Tipo de dado para números inteiros.
- `double`: Tipo de dado para números decimais de precisão dupla.
- `char`: Tipo de dado para caracteres únicos.
- `boolean`: Tipo de dado para valores booleanos (`true` ou `false`).

#### Operadores
```java
int soma = 5 + 3;
int subtracao = 10 - 2;
int multiplicacao = 4 * 2;
int divisao = 20 / 4;
int modulo = 10 % 3;
```

- `+`: Soma.
- `-`: Subtração.
- `*`: Multiplicação.
- `/`: Divisão.
- `%`: Módulo (resto da divisão).

### 2.3. Estruturas de Controle
#### Condicionais
```java
if (numero > 5) {
    System.out.println("Maior que 5");
} else {
    System.out.println("Menor ou igual a 5");
}
```

- `if`: Avalia uma condição.
- `else`: Bloco executado se a condição no `if` for falsa.

#### Laços de Repetição
- **For:**
  ```java
  for (int i = 0; i < 10; i++) {
      System.out.println(i);
  }
  ```

  - `for`: Laço de repetição que itera de acordo com uma condição.

- **While:**
  ```java
  int i = 0;
  while (i < 10) {
      System.out.println(i);
      i++;
  }
  ```

  - `while`: Laço de repetição que executa enquanto a condição for verdadeira.

## 3. Conceitos Avançados de Programação

### 3.1. Métodos: todas as ações das aplicações são consideradas métodos

#### Definindo e Chamando Métodos
```java
public class ExemploMetodos {
    public static void main(String[] args) {
        saudacao();
        int resultado = soma(5, 3);
        System.out.println("Resultado: " + resultado);
    }

    public static void saudacao() {
        System.out.println("Olá, Mundo!");
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
```

- `saudacao()`: Método que imprime uma mensagem.
- `soma(int a, int b)`: Método que retorna a soma de dois inteiros.

### 3.2. Classes e Objetos
#### Definição de Classes
```java
public class Pessoa {
    String nome;
    int idade;

    public void dizerOla() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
```

- `String nome`: Variável de instância para armazenar o nome.
- `int idade`: Variável de instância para armazenar a idade.
- `dizerOla()`: Método que imprime uma mensagem com o nome.

#### Criação de Objetos
```java
public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "João";
        pessoa.idade = 25;
        pessoa.dizerOla();
    }
}
```

- `Pessoa pessoa = new Pessoa()`: Criação de um objeto da classe `Pessoa`.
- `pessoa.nome`: Acessa e modifica o atributo `nome` do objeto.
- `pessoa.dizerOla()`: Chama o método `dizerOla` do objeto.

### 3.3. Encapsulamento
#### Uso de Getters e Setters
```java
public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void dizerOla() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
```

- `private`: Modificador de acesso que restringe o acesso direto aos atributos.
- `getNome()`, `setNome(String nome)`: Métodos para acessar e modificar o atributo `nome`.
- `getIdade()`, `setIdade(int idade)`: Métodos para acessar e modificar o atributo `idade`.

## 4. Conceitos de Programação Orientada a Objetos (POO)
POO é um paradigma de programação que organiza o código em objetos, que são instâncias de classes. Isso permite uma representação mais próxima do mundo real, onde objetos têm atributos e comportamentos. 

### 4.1. Herança
A herança é um mecanismo que permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse). Isso promove a reutilização de código e facilita a manutenção.
#### Definição de Classes Derivadas
```java
public class Animal {
    public void fazerSom() {
        System.out.println("Som do animal");
    }
}

public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Latido");
    }
}
```
Na hierarquia acima, a classe Cachorro herda da classe Animal. O método fazerSom() na classe Cachorro sobrescreve o método homônimo na classe Animal.

- `extends`: Palavra-chave usada para indicar que uma classe herda de outra.
- `@Override`: Anotação que indica que um método está sobrescrevendo um método da superclasse.

### 4.2. Polimorfismo
O polimorfismo permite que um objeto seja tratado de várias formas, dependendo do contexto. Isso é alcançado através de métodos sobrescritos e classes/interfaces polimórficas.
#### Uso de Polimorfismo
```java
public class Principal {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.fazerSom(); // Output: Latido
    }
}
```

- Polimorfismo permite que um objeto de uma classe derivada seja tratado como um objeto de sua superclasse.
- Neste exemplo, um objeto da classe Cachorro é atribuído a uma referência da classe Animal. Isso demonstra polimorfismo, onde o método fazerSom() é chamado. O método sobrescrito na classe Cachorro é executado.
### 4.3. Abstração e Interfaces
A abstração permite modelar objetos do mundo real em software através de classes e interfaces. Uma interface define um conjunto de métodos que uma classe deve implementar, promovendo o contrato entre classes.
#### Definindo e Implementando Interfaces
```java
public interface SerVivo {
    void comer();
}

public class Pessoa implements SerVivo {
    @Override
    public void comer() {
        System.out.println("Pessoa comendo");
    }
}
```
A interface SerVivo define o método comer(). A classe Pessoa implementa essa interface, fornecendo uma implementação específica para o método comer().

- `interface`: Palavra-chave usada para definir uma interface.
- `implements`: Palavra-chave usada para indicar que uma classe implementa uma interface.

## 5. Estruturas de Dados em Java

### 5.1. Arrays
#### Declaração e Uso de Arrays
```java
int[] numeros = {1, 2, 3, 4, 5};
for (int numero : numeros) {
    System.out.println(numero);
}
```

- `int[] numeros`: Declaração de um array de inteiros.
- `for (int numero : numeros)`: Laço for aprimorado para iterar sobre um array.

### 5.2. Coleções do Java (Java Collections Framework)
- **ArrayList:**
  ```java
  import java.util.ArrayList;

  public class ExemploArrayList {
      public static void main(String[] args) {
          ArrayList<String> lista = new ArrayList<>();
          lista.add("Item 1");
          lista.add("Item 2");
          lista.add("Item 3");

          for (String item : lista) {
              System.out.println(item);
          }
      }
  }
  ```

## 6. Manipulação de Arquivos

### 6.1. Leitura e Escrita de Arquivos
- **Leitura de Arquivos:**
  ```java
  import java.io.BufferedReader;
  import java.io.FileReader;
  import java.io.IOException;

  public class LeituraArquivo {
      public static void main(String[] args) {
          try (BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"))) {
              String linha;
              while ((linha = br.readLine()) != null) {
                  System.out.println(linha);
              }
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
  }
  ```

- **Escrita de Arquivos:**
  ```java
  import java.io.BufferedWriter;
  import java.io.FileWriter;
  import java.io.IOException;

  public class EscritaArquivo {
      public static void main(String[] args) {
          try (BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo.txt"))) {
              bw.write("Primeira linha");
              bw.newLine();
              bw.write("Segunda linha");
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
  }
  ```

## 7. Trabalhando com Banco de Dados

### 7.1. JDBC (Java Database Connectivity)
- **Conexão com Banco de Dados:**
  ```java
  import java.sql.Connection;
  import java.sql.DriverManager;
  import java.sql.SQLException;

  public class ConexaoBanco {
      public static void main(String[] args) {
          String url = "jdbc:mysql://localhost:3306/meubanco";
          String usuario = "root";
          String senha = "senha";

          try {
              Connection conexao = DriverManager.getConnection(url, usuario, senha);
              System.out.println("Conexão estabelecida!");
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
  }
  ```

## 8. Práticas Recomendadas

### 8.1. Convenções de Código
- **Nomes de Classes, Métodos e Variáveis:**
  - Classes: `PascalCase` (e.g., `MinhaClasse`)
  - Métodos e Variáveis: `camelCase` (e.g., `meuMetodo`, `minhaVariavel`)
  -  Método escrito no infinitivo
  - Constantes são escritas em CAIXA ALTA e são representados pela palavra reservada `final`
  - Variável é uma identificação de um espaço em memória utilizado pelo nosso programa. 
### 8.2. Comentários e Documentação
- **Comentários de Linha e Bloco:**
  ```java
  // Este é um comentário de linha
  /* Este é um comentário de bloco */
  ```

- **JavaDoc:**
  ```java
  /**
   * Este método realiza uma saudação.
   */
  public void saudacao() {
      System.out.println("Olá!");
  }
  ```
