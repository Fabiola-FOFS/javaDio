package loops;
import java.util.Scanner;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1) --- decompor o numero
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // acesso ao teclado

        System.err.println("qual numero quer fatorar? "); // imprime a pergunta
         int fatorado = scan.nex6tInt();  // pega a entrada e armazena em fatorado que é do tipo inteiro
        
         int multiplicacao = 1;
       
    
        System.out.println(fatorado +"! = ");
         for(int i = fatorado ; i >= 1 ;  i-- ) {
        multiplicacao = multiplicacao * i; 
    }
        System.out.println(multiplicacao);
}

} 
