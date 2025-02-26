package loops;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares */

/*primeira coisa é criar o metodo */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner -- que captura dados de entrada pelo teclado
        System.out.print("quantos numeros deseja inseriri?  ");
        int quantidade = scanner.nextInt(); // Lê a quantidade de números

        int[] numeros = new int[quantidade]; // Cria um array para armazenar os números
        List<Integer> pares = new ArrayList<>(); // Lista para números pares
        List<Integer> impares = new ArrayList<>(); // Lista para números ímpares
        for (int i = 0; i < quantidade; i++) {
            System.out.print("digite o numero " + (i + 1)+ ": ");
            numeros[i] = scanner.nextInt(); // Lê e armazena cada número
            
            // Classifica os números em pares e ímpares
            if (numeros[i] % 2 == 0) {
                pares.add(numeros[i]); // Adiciona à lista de pares
            } else {
                impares.add(numeros[i]); // Adiciona à lista de ímpares
            }
        }  /*for → Inicia um loop que itera sobre um conjunto de números.
        int i = 0 → Inicializa uma variável i com o valor 0. Esta variável será usada como índice para controlar quantas vezes o loop será executado.
        i < quantidade → Define a condição de parada do loop. O loop continuará enquanto i for menor que o valor de quantidade (o número de entradas que o usuário deseja inserir).
        i++ → Incrementa i em 1 a cada iteração do loop, o que garante que, em algum momento, a condição i < quantidade se tornará falsa e o loop será encerrado. */
       
        System.out.println("Números inseridos:  "); //Exibe a mensagem "Números inseridos:" no console. O *println faz a quebra de linha automática após a mensagem.
        for ( int num : numeros) {  
            System.out.print(num + " ");
        } // Essa é uma "for-each loop" (estrutura simplificada do for), que percorre todos os elementos do array numeros. *int num : numeros → Para cada número dentro do array numeros, ele armazena o valor na variável num. *System.out.print(num + " "); → Imprime o número na tela seguido de um espaço (" "), para que fiquem organizados em uma linha. *O print (sem "ln") evita que os números sejam exibidos um abaixo do outro.

        // Exibe números pares
        System.out.println("\nNúmeros pares:");
        for (int par : pares) {
            System.out.print(par + " ");
        }

        // Exibe números ímpares
        System.out.println("\nNúmeros ímpares:");
        for (int impar : impares) {
            System.out.print(impar + " ");
        }

        scanner.close(); // scanner.close(); → Fecha o scanner para liberar recursos.
    } 
      
}


/* Passo a passo da logica: 
1. preciso pedir "n" numeros e dizer quais são pares e quais são impares:
2. preciso pra isso criar uma forma de inserir dados pelo teclado, quantos numero quero avaliar? definir "N"
3. criar o texto que pede os numeros e quantos serão: entrada de dados
4. utilizar este numero para definir o limite de entradas : definir N
5. criar um lugar para armazenar os numeros que estou pedindo: criar um array
6. criar uma forma de entrada dos numeros : pedir os numeros 
7. julgar qual é par e qual é impar 
8. devolver no terminal as classificações! 


 * Explicação rápida:
Scanner scanner = new Scanner(System.in); → Cria um scanner para capturar entrada do teclado.
scanner.nextInt(); → Lê um número inteiro digitado pelo usuário.
scanner.close(); → Fecha o scanner para liberar recursos.
*/