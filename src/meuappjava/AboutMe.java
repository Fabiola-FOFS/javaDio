
import java.util.Locale;
import java.util.Scanner;

/*public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Oi, oie fui executado pelo terminal");
    }
}*/
/*public class AboutMe {
    public static void main(String[] args) {
        
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args [2]); 
        double altura = Double.valueOf(args [3]);

        System.out.println("ola, me chamo " + nome + "  " + sobrenome);
        System.out.println("tENHO" + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm");
    }
}*/
public class AboutMe {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("digite seu nome");
        String nome = scanner.next();

        System.out.println("Seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("sua altura");
        double altura = scanner.nextDouble();
        
        System.out.println("ola, me chamo " + nome + " " + sobrenome);
        System.out.println("tENHO" + " "+ idade +"anos");
        System.out.println("Minha altura é " + altura + " cm");
    
        scanner.close();
    }
}
