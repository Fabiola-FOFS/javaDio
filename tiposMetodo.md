Aqui estão exemplos de cada tipo de método e por que usá-los:  

Metodo é uma porção de codigo disponibilizado por uma classe, é executado quando uma requisição é feita a ele (é preciso chamar ele para ele executar). Responsavel por definir e realizar um comportamento.


# **Padrão de definição de um metodo: o que está entre ? ? é opcional, ou seja retorno, nome parenteses, e corpo são obrigatorios.

<?visibilidade?> pode ser : public, protecd, private
<?tipo?> : concreto, abstrato
<?modoficador?> : static, final
retorno:  tipo de dado primitivos, ou objeto/classe, ou void (ñ retorna nada)
nome: nome dado ao metodo 
(<?parametro>): parametros que se pode receber -dentro dos parenteses
<?exceções?> : exceções que se pode lançar (erros)
corpo : codigo entre chaves { }, ou vazio:  só coloca o ";"

# curso de metodos vamos usar o padrão: public static retono Nome (parametros) {...}
passasse uma mensagem através de uma classe ou objeto: 
nomedaclasse.nomedometodo(); ou nomedaclasse.nomedometodo(...)

# Particularidades
classe se nomeia com letra maiuscula, e objeto com letra minuscula
*** Assinatura = nome + parametro 
*** mensagem : ato de solicitar ao metodo que ele se execute (direcionada a classe/objeto)
***  Passagem de parametros: 
                          valor ou copia ( os valores fora do metodo não são alterados, usa-se uma copia deles dentro do metodo)
                          Referencia : 


# Boas praticas para nomes de metodos:
1. descritivos  e curtos (verbos e substantivos)
2. camel case - primeira paralvra minuscula e segunda palavra inicia com letra maiuscula
# metodo:
tamanho: entre 80 e 120 linhas 
evitar listas de parametros longas
visibilidades adequadas : definir as visibilidades 

### Sobrecarga do metodo
# conceito: É a capacidade de definir metodos para diferentes contextos, preservando seu nome

- vai se comportar de maneira diferente mudando a lista de parametros. (alterar a assinatura). Essa nova assinatura é a sobrecarga do parametro, mudou parametros e manteve o nome criou-se uma sobrecarga.

*** exemplo :
println ()

´´´´
### **Sobrecarga de Métodos (Method Overloading) em Java**
A **sobrecarga de métodos** em Java acontece quando criamos **múltiplos métodos com o mesmo nome, mas com assinaturas diferentes** (quantidade, tipo ou ordem dos parâmetros). Isso permite reutilizar o nome do método para executar diferentes operações, dependendo dos argumentos passados.

---

### **Regras da Sobrecarga**
1. **Nome do método deve ser o mesmo**.
2. **Os parâmetros devem ser diferentes** (pode variar a quantidade, tipo ou ordem).
3. **O retorno do método não interfere** (não é suficiente mudar apenas o tipo de retorno).

---

### **Exemplo de Sobrecarga em Java**
```java
class Calculadora {
    
    // Método para somar dois números inteiros
    int somar(int a, int b) {
        return a + b;
    }

    // Método para somar três números inteiros (quantidade diferente)
    int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método para somar dois números decimais (tipo diferente)
    double somar(double a, double b) {
        return a + b;
    }

    // Método para somar um inteiro e um decimal (ordem diferente)
    double somar(int a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println(calc.somar(5, 10));         // Chama o método com dois inteiros
        System.out.println(calc.somar(5, 10, 15));    // Chama o método com três inteiros
        System.out.println(calc.somar(5.5, 2.3));     // Chama o método com dois doubles
        System.out.println(calc.somar(5, 2.3));       // Chama o método com int e double
    }
}
```

---

### **Vantagens da Sobrecarga de Métodos**
✅ **Facilita a legibilidade do código** – o mesmo nome de método pode ser usado para operações semelhantes.  
✅ **Evita criar métodos diferentes** (ex: `somarInt`, `somarDouble`), deixando o código mais limpo.  
✅ **Permite flexibilidade na chamada de métodos** dependendo dos argumentos passados.  

Se precisar de mais detalhes ou exemplos, me avise! 🚀
# Sobrescrita : ver em orientação a objetos


### **1️⃣ Método sem retorno (`void`)**  
✅ **Escolha:** Quando só precisa executar algo sem devolver um valor.  
```java
public class Exemplo {
    public static void exibirMensagem() {
        System.out.println("Olá, bem-vindo!");
    }

    public static void main(String[] args) {
        exibirMensagem(); // Chama o método, mas não retorna nada
    }
}
```

---

### **2️⃣ Método com retorno (`return`)**  
✅ **Escolha:** Quando precisa calcular e retornar um valor.  
```java
public class Calculadora {
    public static int somar(int a, int b) {
        return a + b; // Retorna o resultado
    }

    public static void main(String[] args) {
        int resultado = somar(5, 3);
        System.out.println("Soma: " + resultado);
    }
}
```

---

### **3️⃣ Método com parâmetros**  
✅ **Escolha:** Quando precisa personalizar a execução com entrada de dados.  
```java
public class Saudacao {
    public static void dizerOla(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    public static void main(String[] args) {
        dizerOla("Lucas"); // Personaliza a mensagem
    }
}
```

---

### **4️⃣ Método estático (`static`)**  
✅ **Escolha:** Quando o método não depende de atributos de um objeto.  
```java
public class Util {
    public static void mostrarMensagem() {
        System.out.println("Isso é um método estático!");
    }

    public static void main(String[] args) {
        mostrarMensagem(); // Pode ser chamado sem criar objeto
    }
}
```

---

### **5️⃣ Método de instância (não estático)**  
✅ **Escolha:** Quando o método precisa acessar atributos do objeto.  
```java
public class Pessoa {
    String nome;

    public void apresentar() {
        System.out.println("Meu nome é " + nome);
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Ana";
        p.apresentar(); // Depende do objeto criado
    }
}
```

