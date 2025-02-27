### 📌 **Scanner em Java**
O `Scanner` é uma classe do pacote `java.util` usada para **ler entradas do usuário** no console ou de arquivos. Ele facilita a captura de diferentes tipos de dados, como `String`, `int`, `double`, etc.

---

## 🚀 **Como usar o Scanner?**
### **1️⃣ Importando a classe**
Antes de usar o `Scanner`, é necessário importá-lo:
```java
import java.util.Scanner;
```

---

### **2️⃣ Criando um objeto Scanner**
Para capturar a entrada do teclado, criamos um objeto `Scanner` usando `System.in`:
```java
Scanner scanner = new Scanner(System.in);
```

---

### **3️⃣ Lendo diferentes tipos de dados**
O `Scanner` fornece métodos para capturar diferentes tipos de entrada:

```java
import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        // Criando o Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo uma String
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Lendo um número inteiro
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Lendo um número decimal (use ponto como separador)
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        // Exibindo os dados capturados
        System.out.println("\nDados capturados:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        // Fechando o Scanner (boa prática)
        scanner.close();
    }
}
```

---

## 🛠 **Principais Métodos do Scanner**
| Método              | Tipo de Dado         | Exemplo de Entrada |
|---------------------|---------------------|---------------------|
| `nextLine()`       | String (linha toda)  | "João Silva"       |
| `next()`           | String (apenas uma palavra) | "João" |
| `nextInt()`        | int                  | 25                  |
| `nextDouble()`     | double               | 1.75 (usa `.` como separador) |
| `nextBoolean()`    | boolean              | `true` ou `false`   |

---

## ⚠ **Cuidados ao usar o Scanner**
1. **Mistura de `nextLine()` com outros métodos**  
   - O `nextLine()` lê toda a linha, enquanto `nextInt()`, `nextDouble()`, etc., leem apenas o valor.  
   - Se você ler um número e, em seguida, quiser ler uma `String` com `nextLine()`, pode ocorrer um problema porque o `nextLine()` pode capturar o **Enter** deixado pelo `nextInt()`.
   
   **Solução:** Adicione um `scanner.nextLine();` logo após ler números.
   ```java
   System.out.print("Digite sua idade: ");
   int idade = scanner.nextInt();
   scanner.nextLine(); // Consome a quebra de linha pendente

   System.out.print("Digite seu nome completo: ");
   String nome = scanner.nextLine();
   ```

2. **Fechar o Scanner no final**  
   - Sempre use `scanner.close();` para liberar recursos quando não precisar mais dele.

---

## 🎯 **Conclusão**
O `Scanner` é uma ferramenta essencial para interagir com o usuário e capturar entradas de forma simples e eficiente. Basta lembrar de escolher o método correto para o tipo de dado desejado!

Quer testar com algum exemplo específico? 😊