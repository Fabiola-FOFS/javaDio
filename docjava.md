Para documentar seu código em Java, você pode usar **comentários** e **JavaDoc**, que são a forma padrão de documentação no Java. Aqui estão os principais tipos:  

---

## **1. Comentários Simples (Linha única)**
Usado para pequenas explicações no código.  
```java
// Isso é um comentário de linha única
int idade = 25; // Variável para armazenar a idade
```

---

## **2. Comentários de Bloco (Múltiplas Linhas)**
Útil para explicações maiores.  
```java
/*
   Esse é um comentário de bloco.
   Pode ter várias linhas.
*/
```

---

## **3. JavaDoc (Documentação para classes e métodos)**
Utilizado para documentar **classes**, **métodos** e **atributos**.  
Ferramentas como o **Javadoc** podem gerar páginas HTML a partir desses comentários.

```java
/**
 * Classe que representa uma pessoa no sistema.
 * @author Seu Nome
 * @version 1.0
 */
public class Pessoa {
    
    /**
     * Nome da pessoa.
     */
    private String nome;
    
    /**
     * Define o nome da pessoa.
     * @param nome O nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Retorna o nome da pessoa.
     * @return Nome da pessoa.
     */
    public String getNome() {
        return nome;
    }
}
```
### **Principais tags do JavaDoc**  
- `@author` → Nome do autor do código.  
- `@version` → Versão do código.  
- `@param` → Explica um parâmetro do método.  
- `@return` → Explica o que o método retorna.  
- `@see` → Faz referência a outra classe/método.  
- `@throws` → Indica possíveis exceções lançadas.  

---

### **Gerando a Documentação**
Se quiser criar arquivos HTML com o JavaDoc, use este comando no terminal:  
```sh
javadoc -d docs MeuArquivo.java
```
Isso criará uma pasta `docs` com a documentação gerada.  

---

Com isso, seu código fica bem organizado e fácil de entender! 🚀  
Se precisar de mais detalhes, me avise. 😊

ver meu script documentado : javadoc -d docs loops/Ex4_ParEImpar.java (diretorio/arquivo)