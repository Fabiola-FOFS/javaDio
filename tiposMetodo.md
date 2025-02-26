Aqui estão exemplos de cada tipo de método e por que usá-los:  

---

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

Se precisar de mais detalhes, me avise! 🚀