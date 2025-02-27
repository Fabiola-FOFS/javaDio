package loops;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares */

/*primeira coisa é criar o metodo */
public class Ex4_ParEImpar2 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);  //acesso ao teclado
      
      int quantNumeros; // cria uma variavel para guardar os numeros
      int numero;
      int quantPares = 0, quantImpares = 0;

      System.out.println("quantidade de números: "); //printa na tela a requisição de numeros
       quantNumeros = scan.nextInt(); // guardo na variavel quantN as entradas 
   
      int count = 0;
      do { 
        System.out.println("Número: ");
        numero = scan.nextInt();
        
        if (numero % 2 == 0) quantPares++;
        else quantImpares++;

        count++;
          
      } while (count < quantNumeros);  // vai ficar num loop infinito se não incrementar
   
     System.out.println("quantidade Par: " + quantPares);
     System.out.println("quantidade impares: " + quantImpares);

      }
}