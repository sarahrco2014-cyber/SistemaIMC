# Sistema IMC

## Descrição

Sistema desenvolvido em Java para cálculo do Índice de Massa Corporal (IMC), utilizando conceitos de Programação Orientada a Objetos (POO).

O sistema permite:

* Cadastrar pessoas
* Cadastrar atletas
* Calcular IMC
* Exibir histórico de cálculos
* Validar entradas com exceções personalizadas

## Conceitos Utilizados

* Classes e Objetos
* Encapsulamento
* Herança
* Polimorfismo
* Classe Abstrata
* Interface
* Composição
* Recursão
* Exceções Personalizadas
* ArrayList

## Estrutura do Projeto

* CalculadoraIMC.java (Interface)
* PessoaBase.java (Classe Abstrata)
* Pessoa.java
* Atleta.java
* Historico.java
* SistemaIMC.java
* CalculadoraRecursiva.java
* EntradaInvalidaException.java
* Main.java

## Dependência utilizada

O projeto utiliza a biblioteca JUnit Jupiter como dependência do Maven.

Ela foi adicionada para permitir a criação de testes unitários, seguindo as boas práticas de desenvolvimento Java e atendendo ao requisito de gerenciamento de dependências do projeto.

## Como Executar

Compilar o projeto:

javac src/main/java/*.java

Executar o programa:

java -cp src/main/java Main

## Exemplo de Uso

1. Escolher a opção "Cadastrar pessoa" ou "Cadastrar atleta".
2. Informar os dados solicitados.
3. O sistema calcula e exibe o IMC.
4. A opção "Exibir histórico" mostra todos os registros realizados.

## Autor

Sarah Rodrigues Cunha RA:72600293

Caio Trentin Tibério RA:72601237

