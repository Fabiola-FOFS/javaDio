package operadoreslogicos;
public class App {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "fulano";
        String s2 = "fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;
        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        // Comparações com números inteiros
        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 < i2 " + (i1 < i2));
        
        // Comparações com números de ponto flutuante
        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 > f2 " + (f1 > f2));
        System.out.println("f1 < f2 " + (f1 < f2));
        
        // Comparações com caracteres
        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 < c2 " + (c1 < c2));
        
        // Comparações com strings
        System.out.println("s1 == s2 " + (s1 == s2)); // Compara referências
        System.out.println("s1.equals(s2) " + s1.equals(s2)); // Compara valores
        System.out.println("s1.equals(s3) " + s1.equals(s3));
        System.out.println("s1 != s3 " + (s1 != s3));
        
        // Comparações booleanas
        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        
        // Comparações com long, byte e short
        System.out.println("l1 == l2 " + (l1 == l2));
        System.out.println("l1 > l2 " + (l1 > l2));
        System.out.println("y1 == h1 " + (y1 == h1));
        System.out.println("y1 != h1 " + (y1 != h1));
    }
}

