package metodo.sobrecarga;

// exercita sobrecarga e return 


public class Quadrilatero {
    public static double area(double lado) {

      //System.out.println("a area do quadrado é " + lado * lado);     
         return lado * lado;  
    }
    
    public static double area(double lado1, double lado2) {

        //System.out.println("a area do retangulo é " + lado1 * lado2); 
        return lado1 * lado2;  

      }

      public static double area(double baseMaior, double baseMenor, double altura) {

       // System.out.println("a area do trapézio é " + ((baseMaior+baseMenor)* altura)/ 2);       
       return ((baseMaior+ baseMenor)* altura) /2; 
    
    }

      //public static void area(double diagonal1, double diagonal2) só aceita como sobrecarga se a assinatura for diferente no tipo de dado tbm  { 
        public static float area(float diagonal1, float diagonal2) {
            return ((diagonal1 + diagonal2) /2);
        //System.out.println("a area do losango é " + (diagonal1 + diagonal2)/2);       
      }


} 

// 3 sobrecargas para o metodo de calcular a area cada um com uma assinatura diferente
// 