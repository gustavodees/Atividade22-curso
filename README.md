# Somador de Números

## Visão Geral

Este programa Java solicita ao usuário que digite um valor para `N`, que representa a quantidade de números que serão somados. Em seguida, o programa pede ao usuário para digitar `N` valores de `X`, e ao final, exibe a soma de todos os valores de `X` inseridos.

## Como Usar

Para executar este programa, você precisará ter o Java Development Kit (JDK) instalado em seu computador.

**Passos para executar o programa:**

1.  **Salve o código:** Salve o código Java fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`. A estrutura de pastas deve ser:
    ```
    seu_projeto/
    └── principal/
        └── Main.java
    ```

2.  **Compile o código:** Abra o terminal ou prompt de comando, navegue até a pasta raiz do seu projeto e execute o seguinte comando:
    ```bash
    javac principal/Main.java
    ```
    Isso irá gerar um arquivo chamado `Main.class` dentro da pasta `principal`.

3.  **Execute o programa:** No mesmo terminal ou prompt de comando, execute o programa com o comando:
    ```bash
    java principal.Main
    ```
    O programa abrirá uma caixa de diálogo para solicitar o valor de `N`, seguido por `N` caixas de diálogo para inserir os valores de `X`. Finalmente, uma caixa de diálogo mostrará a soma total.

## Explicação do Código

O código Java realiza as seguintes operações:

* **Importa `javax.swing.*`:** Importa as classes necessárias para criar janelas de diálogo gráficas.
* **Declaração da classe `Main`:** Define a classe principal do programa.
* **Método `main`:** O ponto de entrada do programa.
* **Solicita o valor de N:**
    * `Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N"))`: Abre uma caixa de diálogo para o usuário inserir o número de valores que serão somados. A entrada, que é uma `String`, é convertida para um inteiro usando `Integer.parseInt()` e armazenada na variável `n`. **Esta é uma operação de conversão de tipo (parsing).**
* **Inicializa a variável `soma`:** Uma variável inteira chamada `soma` é criada e inicializada com o valor 0. Esta variável será usada para acumular a soma dos valores de `X`.
* **Loop `for`:** Um loop `for` é executado `n` vezes (o valor que o usuário digitou).
    * **Solicita o valor de X:**
        * `int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"))`: Dentro do loop, para cada iteração, o programa solicita ao usuário que digite um valor para `X`. A entrada (uma `String`) é convertida para um inteiro e armazenada na variável `x`. **Outra operação de parsing ocorre aqui.**
    * **Atualiza a soma:**
        * `soma += x;`: O valor de `x` digitado pelo usuário é adicionado ao valor atual da variável `soma`.
* **Exibe o resultado:**
    * `JOptionPane.showMessageDialog(null, "A soma é: " + soma)`: Após o loop terminar (depois que `n` valores de `X` foram digitados), uma caixa de diálogo é exibida mostrando a mensagem "A soma é: " seguida pelo valor total da `soma`.

## Conversão de Tipos (Parsing)

Assim como no exemplo anterior, este código também utiliza a conversão de tipos (parsing) através do método `Integer.parseInt()`:

```java
int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N"));
