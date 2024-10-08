﻿# Desafio Target

## Estrutura do Código

O código está organizado em uma classe chamada `Main`, que contém cinco métodos, cada um representando um exercício diferente. O método `main` coordena a execução dos exercícios com base na escolha do usuário.

### Métodos

#### 1. `public static void ex01()`

Este método calcula a soma dos números inteiros de 1 até um valor `indice` pré-definido (13) e exibe o resultado.

- **Variáveis**:
  - `indice`: valor até onde os números serão somados.
  - `soma`: armazena a soma dos números.
  - `k`: contador que percorre de 1 até `indice`.

- **Funcionamento**:
  - O laço `while` incrementa o valor de `k` e adiciona seu valor à variável `soma` até que `k` seja igual a `indice`.
  - Ao final, o resultado da soma é exibido no console.

#### 2. `public static boolean ex02(int a, int b, int n)`

Este método verifica se um número `n` pertence à sequência de Fibonacci.

- **Parâmetros**:
  - `a` e `b`: valores iniciais da sequência de Fibonacci.
  - `n`: número a ser verificado.

- **Funcionamento**:
  - Se `n` for igual a `a` ou `b`, o método retorna `true`.
  - Se `b` for maior que `n`, o método retorna `false`.
  - Caso contrário, o método é chamado recursivamente para verificar se `n` pertence à sequência de Fibonacci.

#### 3. `public static void ex03(double[] dados)`

Este método recebe um array de dados de faturamento diário e calcula:

- O menor valor de faturamento.
- O maior valor de faturamento.
- O número de dias em que o faturamento foi superior à média mensal.

- **Parâmetros**:
  - `dados`: array contendo os valores de faturamento diário.

- **Funcionamento**:
  - O método percorre o array para encontrar o menor e o maior valor.
  - Calcula a média mensal de faturamento considerando apenas os dias com faturamento positivo.
  - Conta o número de dias em que o faturamento foi superior à média mensal.
  - Exibe os resultados no console.

#### 4. `public static void ex04(double sp, double rj, double mg, double es, double outros)`

Este método calcula e exibe o percentual de representação de faturamento de cada estado em relação ao total.

- **Parâmetros**:
  - `sp`, `rj`, `mg`, `es`, `outros`: valores de faturamento de cada estado.

- **Funcionamento**:
  - O método soma os valores de todos os estados para obter o faturamento total.
  - Calcula o percentual de cada estado em relação ao total e exibe no console.

#### 5. `public static String ex05(String str)`

Este método inverte uma string fornecida pelo usuário.

- **Parâmetros**:
  - `str`: string a ser invertida.

- **Funcionamento**:
  - O método converte a string em um array de caracteres.
  - Usa dois ponteiros, um no início e outro no final do array, para trocar os caracteres de posição até que a string seja invertida.
  - Retorna a string invertida.

### Método Principal

#### `public static void main(String[] args)`

Este é o ponto de entrada da aplicação. Ele apresenta um menu ao usuário, permitindo que ele escolha qual exercício deseja executar.

- **Funcionamento**:
  - O método exibe um menu de opções e aguarda a escolha do usuário.
  - Com base na escolha, o método correspondente ao exercício é executado.
  - O processo continua até que o usuário escolha a opção de sair.

### Exemplo de Execução

Ao executar o programa, o usuário verá o seguinte menu:

