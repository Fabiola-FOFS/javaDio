package operadoresLogicos;

public class Operadores {
    public static void main(String[] args) {
        // Cabeçalho da tabela
        System.out.println("-------------------------------------------------");
        System.out.println("| A     | B     | A && B | A || B | A ^ B  | !A  | !B  |");
        System.out.println("-------------------------------------------------");

        // Possíveis valores de A e B
        boolean[] valores = {true, false};

        // Loop para exibir todas as combinações
        for (boolean A : valores) {
            for (boolean B : valores) {
                // Calculando os operadores lógicos
                boolean and = A && B;
                boolean or = A || B;
                boolean xor = A ^ B;
                boolean notA = !A;
                boolean notB = !B;

                // Exibir os resultados formatados
                System.out.printf("| %-5b | %-5b | %-6b | %-6b | %-6b | %-4b | %-4b |\n", 
                                  A, B, and, or, xor, notA, notB);
            }
        }

        System.out.println("-------------------------------------------------");
    }
}
