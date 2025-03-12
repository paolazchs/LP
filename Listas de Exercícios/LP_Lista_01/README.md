![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
        start(( Início )) --> inputnota[\ Digite sua Nota \]
        start --> input[\ Digite sua Frequencia \]
        inputnota --> verification{ Nota >= 50? }
        input --> verification1{ Frequencia >= 75%? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        verification1 --> |Sim| A1[/ Aprovado /]
        verification1 --> |Não| B1[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
        A1 --> finish([ Fim ])
        B1 --> finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
   start(( Início )) --> input[\ Digite o primeiro numero \]
   input --> input2[\ Digite o segundo numero \]
   input2 --> soma{num1 + num2}
   soma --> |Sim| result[/ Resultado        /]
   result --> finish([ Fim ])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite um numero \]
      input --> num{ numero >= 0}
      num --> |Sim| result[/ Positivo /]
      num --> |Não| result2[/ Negativo /]
      result --> finish[(Fim)]
      result2 --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Informe sua idade\]
      input --> idade{Idade > 16}
      idade --> |Sim| result[/ Pode votar /]
      idade --> |Não| result2[/ Não pode votar /]
      result --> finish[(Fim)]
      result2 --> finish
   ```
   
   6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
      ```mermaid
      flowchart TD
         start(( Início )) --> input[\ Informe o primeiro num\]
         input --> input2[\ Informe o segundo num\]
         input2 --> maior{ Numero1 > Numero2}
         maior --> |Sim| result[/O primeiro numero é maior/]
         maior --> |Não| result2[/O segundo numero é maior/]
         result --> finish[(Fim)]
         result2 --> finish
      ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Informe o primeiro num\]
      input --> input2[\ Informe o segundo num\]
      input2 --> input3[\ Informe o terceiro num\]
      input3 --> c1{ Primeiro > segundo e terceiro}
      c1 --> |Sim| result[/O primeiro numero é maior/]
      c1 --> |Não| c2{Segundo > primeiro e terceiro}
      c2 --> |Sim| result2[/O segundo numero é maior/]  
      c2 --> |Não| result3[/O terceiro numero é maior/]
      result2 --> finish([Fim])
      result3 --> finish
      result --> finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Informe um numero\]
      input --> input2{numero informado > 0}
      input2 --> |Não| result[/fim da aplicação /]
      input2 --> |Sim| result[/faça num * fatoração/]
      c1 --> |Não| c2{Segundo > primeiro e terceiro}
      input2 --> fatoracao{ num - 1}
      fatoracao --> c[/ num * fatoracao/]
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Informe um numero\]
      input --> numpar{ num % 2 = 0}
      numpar --> |Sim| result[/O numero é par/]
      numpar --> |Não| result2[/O numero não é par/]
      result2 --> finish([ Fim ])
      result --> finish
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Informe um numero\]
      input --> numprimo{ numInformado/1 = 1 \n E \n numInformado/numInformado = 1}
      numprimo --> |Sim| result[\ O numero é primo\]
      numprimo --> |Não| result2[\ O numero não é primo\]
      result2 --> finish([ Fim ])
      result --> finish
   ```