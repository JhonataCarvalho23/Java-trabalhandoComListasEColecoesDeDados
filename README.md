# 🎬 ScreenMatch: Trabalhando com Listas e Coleções de Dados

Projeto desenvolvido no curso **"Java: trabalhando com listas e coleções de dados"** da Alura. O objetivo principal do curso foi aprofundar o domínio sobre coleções no Java, explorando a classe `ArrayList`, reutilização de código com construtores e o método `toString()`, além de conceitos como **Type Casting**, verificação com `instanceof`, polimorfismo em coleções e técnicas de **ordenação** utilizando as interfaces `Comparable` e `Comparator`.

---

## 📜 Certificado de Conclusão

<div align="center">

<img src="assets/certificado.png" alt="Certificado" width="800px">

📄 [Clique aqui para abrir/baixar o Certificado em PDF](assets/certificado.pdf)

*Certificado de conclusão do curso "Java: trabalhando com listas e coleções de dados" pela Alura.*

</div>

---

## 📌 Navegação pelas Branches

A evolução do projeto ao longo das aulas está dividida nas seguintes branches:

| Branch | Status | Tópicos Principais |
| :--- | :---: | :--- |
| [`aula-01`](../../tree/aula-01) | 🛠️ Concluído | Introdução ao `ArrayList`, adição de elementos e iteração em listas de objetos (`Filme`, `Serie`, `Pessoa`). |
| [`aula-02`](../../tree/aula-02) | 🛠️ Concluído | Construtores personalizados em classes Java, reescrita do método `toString()`, herança e coleções (`Produto`, `ProdutoPerecivel`). |
| [`aula-03`](../../tree/aula-03) | 🛠️ Concluído | Polimorfismo em listas, conversão de tipos (**Type Casting**), operador `instanceof` e percorrendo coleções. |
| [`aula-04`](../../tree/aula-04) | 🛠️ Concluído | Ordenação de listas com `Collections.sort()`, implementação da interface `Comparable`, interface `List`, diferença entre `ArrayList` e `LinkedList` e ordenação por critérios (`Comparator`). |

---

## 🚀 Conteúdo Detalhado das Aulas

### 🔹 Aula 01: Coleções e o ArrayList
* **Uso da Classe `ArrayList`:** Criação e manipulação de listas dinâmicas para armazenar elementos do tipo `Filme` e `Serie`.
* **Métodos Principais:** Utilização de `add()`, `size()`, `get()` e exibição dos elementos da coleção.
* **Exercícios Práticos:** Criação da classe `Pessoa` e manipulação de uma lista de objetos `Pessoa`.

### 🔹 Aula 02: Construtores e Reescrita do Método `toString()`
* **Construtores Personalizados:** Definição de construtores obrigatórios com parâmetros para garantir o estado inicial dos objetos.
* **Sobrescrita do `toString()`:** Personalização da saída impressa ao exibir os itens da lista no console.
* **Modelagem e Polimorfismo:** Criação da classe `Produto` e sua subclasse `ProdutoPerecivel`.

### 🔹 Aula 03: Polimorfismo, Casting e `instanceof`
* **Polimorfismo com Coleções:** Armazenamento de diferentes objetos (`Filme`, `Serie`) em uma única lista de `Titulo`.
* **Type Casting:** Conversão de tipos genéricos para tipos específicos ao percorrer coleções.
* **Operador `instanceof`:** Validação do tipo do objeto antes de realizar o cast de forma segura.
* **Exercícios Práticos:** Trabalhando com abstração (`Forma`, `Circulo`, `Quadrado`), contas bancárias e hierarquias de animais.

### 🔹 Aula 04: Ordenação e a Interface `Comparable`
* **Ordenação de Listas:** Uso do `Collections.sort()` para ordenar elementos em ordem alfabética ou por atributos específicos.
* **Interface `Comparable`:** Implementação do método `compareTo()` na classe `Titulo` para definir a ordem natural dos objetos.
* **Comparatores Dinâmicos:** Ordenação de listas por ano de lançamento utilizando `Titulo::getAnoDeLancamento`.
* **Interface `List`:** Uso do tipo genérico `List` e comparação prática entre `ArrayList` e `LinkedList`.

---

## 💻 Tecnologias Utilizadas

* **Java 8+**
* **Paradigma Orientado a Objetos (POO)**
* **Eclipse**

---

## ⚙️ Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/JhonataCarvalho23/Java-trabalhandoComListasEColecoesDeDados.git
   ```

2. **Navegue até a branch desejada:**
   ```bash
   git checkout aula-04
   ```

3. **Execute o projeto:**
   Abra o projeto em sua IDE e execute as classes principais:
   * `src/principal/Principal.java` (Demonstração do ScreenMatch)
   * `src/principal/PrincipalComListas.java` (Exemplos de ordenação e uso de interfaces)
