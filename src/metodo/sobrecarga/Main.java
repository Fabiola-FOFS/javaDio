package metodo.sobrecarga;

// crie uma aplicação que calcula a area dos 3 quadriláteros notáveis: quadrado, retangulo, trapezio
//use sobrecarga

public class Main {
    public static void main(String[] args) {

        //Retornos
        System.out.println("exercicio retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println(" area do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d, 5d);
        System.out.println(" area do RETANGULO:" + areaRetangulo);
        
        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println(" area do trapezio:" + areaTrapezio);
        
        float areaLosango = Quadrilatero.area(5f, 5f);
        System.out.println(" area do losango:" + areaLosango);




        //System.out.println("exercicio quadrilatero");
        //Quadrilatero.area( 3);
        //Quadrilatero.area(5d, 5d);
        //Quadrilatero.area(7, 8, 9);
        //Quadrilatero.area(5f,5f); // ele sabe que não é o retangulo pq o tipo de dado é outro

    }
    
} // mudar a quantidade e os tipos de parametros para dar certo a sobrecarga
