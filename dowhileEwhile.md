loops feitos com do while podem ser feitos com while tbm ou for 
## 
### 🔄 **while vs do-while em Java**
Os loops `while` e `do-while` são usados para **repetir um bloco de código** enquanto uma condição for verdadeira. A principal diferença entre eles está em **quando** a condição é verificada.

---

## 🔹 **while** (verifica a condição antes de executar)

O loop `while` primeiro verifica a condição. **Se for verdadeira, ele executa o bloco de código**; caso contrário, **o loop nem chega a rodar**.

### ✅ **Exemplo de `while`**
```java
int contador = 1;

while (contador <= 5) {
    System.out.println("Contagem: " + contador);
    contador++; // Incremento para evitar loop infinito
}
```
### 🔹 **Fluxo do `while`**
1. Verifica a condição (`contador <= 5`).
2. Se for verdadeira, executa o bloco.
3. Volta para a condição e repete até que seja falsa.
4. Se a condição for **falsa desde o início**, o bloco **nunca** é executado.

---

## 🔹 **do-while** (executa pelo menos uma vez)
Diferente do `while`, o `do-while` **executa o bloco de código pelo menos uma vez**, pois a verificação da condição ocorre **depois** da execução.

### ✅ **Exemplo de `do-while`**
```java
int contador = 1;

do {
    System.out.println("Contagem: " + contador);
    contador++; // Incremento para evitar loop infinito
} while (contador <= 5);
```
### 🔹 **Fluxo do `do-while`**
1. Executa o bloco **uma vez** sem verificar a condição.
2. Depois, verifica a condição (`contador <= 5`).
3. Se for verdadeira, repete o bloco.
4. Se for falsa, o loop termina.

---

## ⚡ **Diferença prática entre os dois**
Se a variável inicial não atender à condição, o `while` **não executa nada**, mas o `do-while` roda **pelo menos uma vez**.

### **Exemplo comparativo**
```java
int x = 10;

// Usando while (nunca será executado)
while (x < 5) {
    System.out.println("While: Este código nunca será executado!");
}

// Usando do-while (executa pelo menos uma vez)
do {
    System.out.println("Do-while: Executa pelo menos uma vez!");
} while (x < 5);
```

---

## 📌 **Quando usar cada um?**
| Situação | Melhor escolha |
|----------|---------------|
| O código **só deve rodar se a condição for verdadeira** | `while` |
| O código **precisa rodar pelo menos uma vez** antes da verificação | `do-while` |

🔹 **Exemplo de uso do `do-while`**: Capturar entrada do usuário até que ele digite um valor válido.
```java
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número maior que zero: ");
            numero = scanner.nextInt();
        } while (numero <= 0);

        System.out.println("Número válido: " + numero);
        scanner.close();
    }
}
```
🔹 **Exemplo de uso do `while`**: Contagem regressiva até zero.
```java
int contagem = 10;
while (contagem >= 0) {
    System.out.println("Tempo restante: " + contagem);
    contagem--;
}
System.out.println("FIM!");
```

---

## 🎯 **Resumo**
| Estrutura   | Quando verifica a condição? | Garante pelo menos uma execução? |
|------------|----------------------------|----------------------------------|
| **while**  | Antes do bloco             | ❌ Não |
| **do-while** | Depois do bloco          | ✅ Sim |

Precisa de mais exemplos? 🚀😊