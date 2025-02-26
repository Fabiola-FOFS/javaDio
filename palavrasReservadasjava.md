## Palavras reservadas :
### 🔹 **Palavras Reservadas em Java**  

As **palavras reservadas** são termos específicos da linguagem que possuem significados especiais e **não podem ser usados como identificadores** (nomes de variáveis, métodos ou classes). Elas são usadas para definir a estrutura e o comportamento do código.  

---

## ✅ **Classificação das Palavras Reservadas**  

### 🔹 **1. Modificadores de Acesso (Controlam a Visibilidade)**
Usados para definir o nível de acesso de classes, métodos e atributos.  

| Palavra-chave | Uso | Escopo |
|--------------|-----|--------|
| `public` | Acessível de qualquer lugar. | Global |
| `private` | Acessível apenas dentro da classe. | Escopo de classe |
| `protected` | Acessível dentro da mesma classe, pacote e subclasses. | Classe, Pacote |
| `default` *(sem palavra-chave)* | Acessível apenas dentro do mesmo pacote. | Pacote |

🔹 **Exemplo:**  
```java
public class Pessoa {
    private String nome; // Só pode ser acessado dentro da classe
}
```

---

### 🔹 **2. Modificadores de Classe, Método e Variável (Definem Comportamento)**
Controlam como classes, métodos e variáveis podem ser usados.  

| Palavra-chave | Uso | Escopo |
|--------------|-----|--------|
| `class` | Define uma classe. | Global |
| `abstract` | Classe ou método abstrato (não pode ser instanciado). | Classe, Método |
| `final` | Impede herança (classe), sobrescrita (método) ou mudança (variável). | Classe, Método, Variável |
| `static` | Pertence à classe, não ao objeto. | Classe |

🔹 **Exemplo:**  
```java
public final class Util { } // Classe que não pode ser herdada
```

---

### 🔹 **3. Controle de Fluxo (Estruturas de Decisão e Repetição)**
Definem a lógica de controle do programa.  

| Palavra-chave | Uso | Escopo |
|--------------|-----|--------|
| `if`, `else` | Estruturas condicionais. | Bloco |
| `switch`, `case`, `default` | Controle de múltiplas condições. | Bloco |
| `for`, `while`, `do` | Estruturas de repetição. | Bloco |
| `break`, `continue` | Controla fluxos de repetição. | Bloco |
| `return` | Finaliza um método e retorna um valor. | Método |

🔹 **Exemplo:**  
```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

---

### 🔹 **4. Manipulação de Objetos e Herança**
Definem como os objetos e classes interagem.  

| Palavra-chave | Uso | Escopo |
|--------------|-----|--------|
| `new` | Cria um novo objeto. | Classe, Método |
| `this` | Refere-se à instância atual da classe. | Classe |
| `super` | Refere-se à superclasse. | Classe |
| `extends` | Indica herança entre classes. | Classe |
| `implements` | Indica implementação de interfaces. | Classe |

🔹 **Exemplo:**  
```java
public class Carro extends Veiculo { } // Herança
```

---

### 🔹 **5. Tratamento de Exceções**
Usados para capturar e tratar erros em tempo de execução.  

| Palavra-chave | Uso | Escopo |
|--------------|-----|--------|
| `try`, `catch`, `finally` | Manipulação de exceções. | Bloco |
| `throw` | Lança uma exceção. | Bloco |
| `throws` | Declara exceções que um método pode lançar. | Método |

🔹 **Exemplo:**  
```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro: divisão por zero!");
}
```

---

### 🔹 **6. Controle de Threads e Concorrência**
Gerenciam processos simultâneos.  

| Palavra-chave | Uso | Escopo |
|--------------|-----|--------|
| `synchronized` | Controla acesso concorrente a métodos. | Método, Bloco |
| `volatile` | Garante visibilidade de mudanças entre threads. | Variável |

🔹 **Exemplo:**  
```java
public synchronized void metodoCritico() { } // Apenas uma thread pode acessar por vez
```

---

### 🔹 **7. Tipos de Dados Primitivos**
Definem os tipos básicos de variáveis.  

| Palavra-chave | Tipo | Escopo |
|--------------|------|--------|
| `int` | Números inteiros. | Variável |
| `double`, `float` | Números decimais. | Variável |
| `char` | Caracteres únicos. | Variável |
| `boolean` | Verdadeiro ou falso. | Variável |
| `byte`, `short`, `long` | Tipos numéricos com diferentes tamanhos. | Variável |

🔹 **Exemplo:**  
```java
int idade = 25;
double altura = 1.75;
boolean ativo = true;
```

---

### 🔹 **8. Palavras-Chave de Controle do Código**
Definem propriedades especiais do código.  

| Palavra-chave | Uso | Escopo |
|--------------|-----|--------|
| `package` | Define o pacote da classe. | Global |
| `import` | Importa classes e pacotes. | Global |
| `instanceof` | Verifica se um objeto pertence a uma classe. | Bloco |
| `native` | Indica método nativo (código externo, ex: C). | Método |
| `transient` | Evita serialização de um atributo. | Variável |
| `strictfp` | Garante precisão de ponto flutuante. | Classe, Método |
| `assert` | Usado para verificações no código. | Bloco |
| `enum` | Define um conjunto de constantes. | Classe |

🔹 **Exemplo:**  
```java
import java.util.Scanner; // Importando Scanner
package meu.pacote;       // Definindo o pacote
```

---

## 🚀 **Resumo Final**
- As **palavras reservadas** são usadas para estruturar o código Java.
- Elas se dividem em **modificadores**, **fluxo de controle**, **tratamento de erros**, **herança**, **concorrência**, **tipos primitivos**, entre outras.
- **Não podem ser usadas como identificadores** (nomes de variáveis, classes ou métodos).

🔹 **Exemplo de código que usa várias palavras reservadas:**
```java
package exemplo;  // Define um pacote

import java.util.Scanner; // Importa uma classe

public class Exemplo {  // Declaração de classe
    private static final int IDADE_MINIMA = 18; // Modificadores

    public static void main(String[] args) { // Método principal
        Scanner scan = new Scanner(System.in); // Uso de "new"
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        if (idade >= IDADE_MINIMA) { // Controle de fluxo
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
```

📌 **Conclusão:** As palavras reservadas estruturam e definem as regras da linguagem Java, garantindo organização e segurança no código. 🚀