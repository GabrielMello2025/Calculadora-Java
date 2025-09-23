# Calculadora Java

Uma calculadora simples desenvolvida em Java que realiza operações básicas e cálculo de porcentagem, com menu interativo via terminal.

---

## Funcionalidades

- Soma
- Subtração
- Multiplicação
- Divisão (trata divisão por zero lançando exceção)
- Cálculo de porcentagem
- Menu interativo no terminal

---

## Tecnologias Utilizadas

- Java 23
- Terminal / Console
- VS Code (opcional para desenvolvimento)

---

## Como Usar

1. Clone este repositório ou baixe os arquivos do projeto.
2. Abra o terminal na pasta do projeto.
3. Compile os arquivos Java:

```bash
javac Operation.java Calculator.java
Execute o programa:

bash
Copiar código
java Calculator
Siga as instruções do menu para escolher a operação e inserir os valores.

Estrutura do Projeto
text
Copiar código
CalculatorJava/
├─ Operation.java       # Classe com métodos de cálculo
├─ Calculator.java      # Classe principal com menu interativo
├─ README.md            # Este arquivo
Observações
A divisão por zero é tratada lançando uma exceção IllegalArgumentException.

Os resultados são exibidos com duas casas decimais.

Cada operação retorna imediatamente o resultado no terminal.

Autor
Gabriel Mello