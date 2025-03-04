package metodo.conjuntos;

public class Main {
    public static void main(String[] args) {

        //calculadora 
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3, 6);     // estou chamando o metodo apartir de uma classe por que o metodo é static
        Calculadora.subtracao(9, 1.8);
        Calculadora.divisao(7, 8);
        Calculadora.multiplicacao(5, 2.5);

        //   // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

         // Empréstimo
         System.out.println("Exercício empréstimo");
         Emprestimo.calcular(1000, Emprestimo.getDuasParcelas()); //chamando dois metodos
         Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
         Emprestimo.calcular(1000, 5);

    }

    
}
