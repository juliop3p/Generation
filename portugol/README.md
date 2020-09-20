# Bloco I - Lógica de programação

## O que é algoritmo?
- Procedimento computacional que possuí entrada processamento e saída de dados.

## Formas de representação:
**Descrição Narrativa:** Descrito em linguagem natural um processo a ser executado (receita de bolo).

**Diagrama de Blocos ou Fluxograma:** Representação Gráfica de algoritmos utilizando formas geométricas.

**Pseudocódigo (ou Portugol):** A forma mais proxima da programação, muito mais rica em detalhes, já utilizando elementos da programação.

## Exemplo de Pseudocódigo
```
Algoritmo <nome_do_algoritmo>
<declaração_de_variáveis>
<subalgoritmos>
Início
<corpo do algoritmo>
Fim
```

## O que é lógica de programação?

- É um conjunto de regras e conceitos que norteiam a criação de um código.

## O que é um dado?

- Qualquer tipo de valor que pode ser armazenado.

## O que é uma variável?
- São valores que são armazenados na memória que podem sofrer mutações.

## O que é uma variável constante?
- São valores que são armazenados na memória que NÃO podem sofrer mutações.

## Tipos de dados

**inteiro:** *Números positivos ou negativos incluíndo o zero.*

**real:** *Números inteiros ou números fracionados.*

**caractere:** *São letras (pode ser apenas uma letra).*

**lógico:** *Verdadeiros ou falsos (booleanos).*

## Operadores Relacionais

<table>
  <thead>
    <tr>
      <td>Operador</td>
      <td>Comparação</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>==</td>
      <td>Igual</td>
    </tr>
    <tr>
      <td>!=</td>
      <td>Diferente</td>
    </tr>
    <tr>
      <td><</td>
      <td>Menor</td>
    </tr>
    <tr>
      <td>></td>
      <td>Maior</td>
    </tr>
    <tr>
      <td><=</td>
      <td>Menor Igual</td>
    </tr>
    <tr>
      <td>>=</td>
      <td>Maior Igual</td>
    </tr>
  </tbody>
</table>

# Introdução ao Git e GitHub

## Versionamento

- É uma metodologia de classificação adotada por programadores com o intuito de controlar e acompanhar o histórico de alterações em um software.

## Git comandos

`git status`: verifica os status dos arquivos novos ou modificados.

`git add "arquivo"/"diretório"`: insere novos arquivos ao git.

`git pull origin "nome da branch"`: obtém esta branch ao projeto.

`git commit -m "msg do commit"`: efetiva as alterações locais feitas como se fosse a última versão.

`git push origin "nome da branch"`: efetiva o upload das alterações para o repo remoto.

`git checkout -b "ProjetoA"`: cria uma nova branch e acessa ela imediatamente.

`git checkout "master"`: acessa uma determinada branch.

`git branch -d "projetoA"`: exclui uma branch.