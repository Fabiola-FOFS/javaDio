# Return -- 
esta ligado ao conceito de metodo 
O metodo executa seu retorno quando:

a) completa todas as suas instruções internas 
b) chega a uma declaração explicita de retorno
C) lança uma exceção -- se encontrar um erro

O tipo de return do metodo é definido na sua criação, e pode ser um tipo primitivo ou objeto. 
O tipo de dado do return deve ser compativel com o dado do metodo -- o return é definido antes do nome do metodo
se o metodo for void (sem retorno), pode ou ñ ter um return para encerrar a execução

# exemplo:
public String getMensagem() {
    return "Olá"
}; 

public int getParcelas() {
    return 1.36f     // vai dar erro de compilação pois esperava inteiro e retornou um float 
}

public void setIdade() {
    return 10;  // erro tbm pq void não aceita retorno
}


