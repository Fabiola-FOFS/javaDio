# Clareza de escrita
 1. clara - sem abreviações sem sentido
 2. um unico idioma - não mesclar idiomas
 3. usar plural somente para arrays

 # camel case - para nomear as variaveis 

 # Metodos 
 1. declarado como verbos - infinivo
 2. minusculo - se for composta segunda palavra começa maiúscula 
 4. o nome tem que ter uma única finalidade

 # palavras reservadas 
 *** tipos primitivos 
 byte - 1 -127
 short - 2 - 30 mil
 int - 4 bytes - 2 bilhoes 
 long - 8 bytes a 9 trilhões  ex: 985741223l - finaliza com l

 -- int é usado mais para numeros inteiros 

 float - 3,4f -- colocar o f para ñ confundir com double
 double - 1,79

 # Como definir o tipo de dado para definir a variavel?

 # Declaração de variavel 
 <tipo> <nomeVariavel> <atribuirValor>

 ex: int idade; inteiro 
 double salarioMinimo = 2.500 --- numero fracionado

 se o valor do numero começar com zero o java não entende como int ou long, ou short --- tera que ser string 

 # java é fortemente tipado 
 ele é fortemente influenciado pelo tipo de dado -- pode dar erros
 -- **casting** 

 # Constantes :

 - Não podem ser modificados 
***final*** --- define isso - o nome da variavel deve ser em caixa alta
ex: final double VALOR_PI = 3,14; 

# classe string :

# Operadores :
simbolos com signficado proprio para a linguagem e associados a certas operações
realizar operações --
***atribuição***  "=" atribuir valor a variavel ou modificar depois 

cada tipo de dado tem uma forma de atribuir o valor 
string = "string" 
char = 'char'
boolean = false, true; 
new -- criando um objeto 

***operadores aritimeticos***
+ adicão   --- entre strings ele vai concatenar -- juntar palavras 
se a string vier antes do numero ele vai entender tudo como string, porém enquanto houver numero ele vai somar, muda após encontrar o primeiro caracter

- subtração
* multiplicação
/ divião
% modulo -- descobrir o resto

