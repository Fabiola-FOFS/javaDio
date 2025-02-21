package controledefluxo;

public class ControleDeFluxo {
    public static void main(String[] args) {
        ifFlecha();
    }

    private static void ifFlecha() {
        int mes = 1; // Exemplo de variável

        if (mes == 1) {
            System.out.println("janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else {
            System.out.println("Outro mês");
        }
    }
}
