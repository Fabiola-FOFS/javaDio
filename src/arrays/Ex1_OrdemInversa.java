package arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
    
       
        int[] vetor = {9 , 2, 8, 7, 1};
        int contador = 0;
        //System.out.println(vetor.length); ** conta as posições dentro do array vetor
        /*while(contador <= vetor.length - 1) { 
                contador++;
        }
                System.out.println(contador);  // apenas imprime a quantidade de posições dentro do array vetor
                System.out.println(vetor); // apenas mostra o lugar que o vetor ocupa na memoria do pc
    */  System.out.println("vetor: ");
        while(contador < vetor.length) {
            System.out.print(vetor[contador] + " ");
            contador++;
        } 
        System.out.println("\nvetor: ");
          for ( int i = vetor.length -1 ; i >= 0;  i--) {
            System.out.println(vetor[i] + " ");

          }

        }
    }
