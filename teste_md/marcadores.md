## Teste de marcação no Markdown

1. um
1. dois
1. três

### Um novo teste de variação

1. ### Um
2. ### Dois
3. ### Três

---

# Comandos git e linguagem de programação Java

- ## Linguagem de programação Java
    ### - Estruturas de decisão
    
    - #### IF E ELSE:
    ```java
    int valor = 10;
    if (valor == 10) {
        System.out.println("Compra aceita");
    } else {
        System.out.println("Compra não aceita");
    }
    ```
    
    - #### WHILE:
    ```java
    int valor = 1;
    while (valor < 10) {
        System.out.println(valor);
        valor += 1;
    }
    ```

    - #### FOR:
    ```java
    // Exemplo de loop for com uso do break
    for (int i = 0; i < 100; i++) {
        System.out.println(i);
        if (i == 10) break; // Sai do laço
    }
  
    // Exemplo do loop for com uso continue
    for (int i = 0; i < 100; i++) {
        if (i > 3 && i < 7) {
            continue; // Não imprimi os valores: 4, 5 e 6
        }
        System.out.println(i);
    }
    ```

    - #### SWITCH:
    ```java
    char letra = args[0]; 
    
    switch (letra) {
        case "a":
            System.out.println("A letra " + letra + " possuí o equivalente em ascii= " + (int)letra);
            break;
        case "b":
            System.out.println("A letra " + letra + " possuí o equivalente em ascii= " + (int)letra);
            break;
        default:
            System.out.println("Letra desconhecida");
            break.
    }
    
  ```  

    ### - Métodos da classe String
  
    ```java
    String str = "Metodos da classe string";
    
    // Obtém o carater na posicao especificada entre parênteses
    Sytem.out.println(str.charAt(1));   
    
    // Retorna o valor em unicode do caractere
    System.out.println(str.codePointAt(1)); 
  
    // Comparar strings
    // Compara considerendo letras maiúsculas e minúsculas
    // retorna diferença entre string
    // se diferença for igual a zero então strings são iguais
    System.out.println("Palavras são: "(str.compareTo("Metodos da casse string") == 0 ? "iguais" : "diferentes"));
  
    // Compara ignorando se são letras maiúsculas ou minúsculas
    System.out.println("Palavras são: "(str.compareTo(metodos da classe string)== 0 ? "iguais" : "diferentes"));
  
    // Verifica se string está vazia
    System.out.println(str.isEmpty());
    // Obs.: A verificação é feita no comprimento da string = 0
    // portanto, para string com valor NULL, retornara uma exceção: "NullPointerException"
  
    // Transforma uma única string com separador em um array de substrings
    String[] separadaPorSplit = str.split(" ");
    
    // Imprimi em tela array de substrings
    for (String substring : separaPorSplit) {
        System.out.println(substring);
    }  
    
    // Retorna uma parte específica de um determinada string
    // substring(posInicio, posFim)
    System.out.println(str.substring(0,7));
  
    // Converte string para caixa baixa
    System.out.println(str.toLowerCase());
  
    // Converte string para caixa alta
    System.out.println(str.toLowerCase());
  
    // Converte diversos tipos (booleano, inteiro, char, double, float, long, Object) para string
    boolean confere = true;
    System.out.println(String.valueOf(confere));
  ```

    ### - Interação com o usuário

    ```java
    import java.util.Scanner;
  
      class User {
          public static void main(String[] args) {
  
              Scanner teclado = new Scanner(System.in);
  
              System.out.println("Entre com sua idade: ");
              int idade = teclado.nextInt();
          
              teclado.nextLine();
  
              System.out.println("Entre com seu nome: ");
              String nome = teclado.nextLine();
  
              System.out.println("Nome: " + nome + " Idade: " + idade);
          }
      }
    ```

- ## Comandos git
    ### - Fluxo de trabalho ramos
    ```shell
    $ git checkout master
    $ git merge decisao
    ```
    ```shell
    $ git checkout master
    $ git merge string
    ```
  
    ![Figura-01](figuras/Tela-saida-git%20-tree.png "Figura 01")
