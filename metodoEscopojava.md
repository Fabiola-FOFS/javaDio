# metodo: maneira de criar o codigo em java 
### **O que são métodos em Java?**  
Os **métodos** em Java são blocos de código que executam uma tarefa específica. Eles ajudam a **organizar, reutilizar e estruturar** melhor o código.  

---

## **Principais tipos de métodos em Java:**

### **1️⃣ Métodos sem retorno (`void`)**  
- **Executam uma ação**, mas **não retornam** nenhum valor.  
- Exemplo: Um método que imprime uma mensagem.  

```java
public class Exemplo {
    public static void dizerOla() { // Método sem retorno
        System.out.println("Olá, seja bem-vindo!");
    }

    public static void main(String[] args) {
        dizerOla(); // Chamando o método
    }
}
```
✅ **Quando usar?** Quando você só precisa executar uma ação sem precisar devolver um valor.  

---

### **2️⃣ Métodos com retorno (`return`)**  
- **Executam um cálculo ou processamento e retornam um valor**.  
- O tipo de retorno pode ser `int`, `double`, `String`, `boolean`, etc.  

```java
public class Calculadora {
    public static int somar(int a, int b) { // Método que retorna um número inteiro
        return a + b; // Retorna a soma dos números
    }

    public static void main(String[] args) {
        int resultado = somar(5, 3);
        System.out.println("A soma é: " + resultado);
    }
}
```
✅ **Quando usar?** Quando você precisa de um resultado após o processamento.  

---

### **3️⃣ Métodos com parâmetros**  
- **Recebem valores como entrada** para personalizar sua execução.  

```java
public class Mensagem {
    public static void exibirMensagem(String nome) { // Método com parâmetro
        System.out.println("Olá, " + nome + "! Bem-vindo.");
    }

    public static void main(String[] args) {
        exibirMensagem("Lucas"); // Passando "Lucas" como argumento
    }
}
```
✅ **Quando usar?** Quando o método precisa de informações externas para funcionar corretamente.  

---

### **4️⃣ Métodos estáticos (`static`)**  
- Pertencem à **classe** e não a um objeto específico.  
- Podem ser chamados sem precisar criar um objeto da classe.  

```java
public class Util {
    public static void mostrarMensagem() {
        System.out.println("Método estático foi chamado!");
    }

    public static void main(String[] args) {
        mostrarMensagem(); // Chamando sem precisar de um objeto
    }
}
```
✅ **Quando usar?** Quando o método não depende de atributos específicos de um objeto.  

---

### **5️⃣ Métodos de instância (não estáticos)**  
- São métodos que pertencem a um **objeto** e precisam ser chamados através dele.  

```java
public class Pessoa {
    String nome;

    public void dizerOla() { // Método de instância
        System.out.println("Olá, meu nome é " + nome);
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa(); // Criando um objeto
        p.nome = "Ana"; // Atribuindo um valor ao atributo
        p.dizerOla(); // Chamando o método de instância
    }
}
```
✅ **Quando usar?** Quando o método precisa acessar atributos do objeto.  

---

## **Como saber qual método usar para resolver um desafio?**  
1️⃣ **Leia o problema com atenção** e identifique o que ele pede:  
   - O método precisa **retornar um valor**? → **Use um método com `return`**.  
   - O método **só executa uma ação**? → **Use um método `void`**.  
   - O método precisa **receber valores de entrada**? → **Use parâmetros**.  
   - O método **depende de atributos de um objeto**? → **Use um método de instância**.  
   - O método **não depende de atributos do objeto**? → **Use um método `static`**.  

2️⃣ **Divida o problema em partes menores e crie um método para cada funcionalidade**.  
3️⃣ **Teste o método separadamente** antes de integrá-lo ao restante do código.  

---




# escopo:

Em **Java**, o **escopo** define **onde** e **por quanto tempo** uma variável ou método pode ser acessado no código.  

### 🔹 **Tipos de escopo**  

1. **Escopo de bloco** `{}` → Variáveis declaradas dentro de um bloco `{}` só existem ali.  
   ```java
   if (true) {
       int x = 10;  // x existe apenas dentro desse bloco
   }
   // System.out.println(x);  // ❌ Erro: x não é acessível aqui
   ```
   
2. **Escopo de método** → Variáveis declaradas dentro de um método só existem dentro dele.  
   ```java
   public void exemplo() {
       int y = 5;  // Só pode ser usado dentro de exemplo()
   }
   ```

3. **Escopo de classe (atributos)** → Variáveis declaradas na classe podem ser usadas em todos os métodos.  
   ```java
   public class Teste {
       int z = 20;  // Acessível por todos os métodos desta classe
   }
   ```

4. **Escopo global (static)** → Variáveis `static` pertencem à classe e podem ser acessadas sem precisar de um objeto.  
   ```java
   public class Exemplo {
       static int contador = 0;  // Acessível por qualquer parte da classe
   }
   ```

📌 **Resumo:** O escopo define **onde** uma variável pode ser acessada, ajudando a evitar conflitos e melhorar a organização do código. 🚀