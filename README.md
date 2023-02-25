# learningoOOP
Este repositório contém os meus estudos e exercícios de programação orientada a objeto, utilizando linguagem Java.

## Conteúdo
Neste repositório você encontrará:

- Códigos fontes dos exercícios realizados.
- Diagramas de classes.
- Anotações e resumos teóricos.

## Recursos
Para realizar os exercícios e estudos neste repositório, utilizei as seguintes ferramentas:

Linguagem de programação: Java.
IDE: IntelliJ.

## Progresso
Atualmente, tenho realizado os seguintes tópicos:

- projectBook
- Tópico ultra-emoji-combat

##  projectBook

Este é o código de uma classe Book e de uma interface IBook. A classe Book implementa a interface IBook e possui atributos para armazenar informações sobre um livro, como título, autor, número de páginas e página atual. Além disso, possui métodos para abrir, fechar, folhear, avançar e retroceder página e para obter detalhes sobre o livro. A interface IBook declara os métodos que a classe Book deve implementar, todas as classes possuem methods getters e setters.

Na classe Main, é criado um array de pessoas e um array de livros. 

- Para criar um novo objeto do tipo Book, basta chamar o construtor da classe, passando os valores adequados para os parâmetros do construtor:

```Book novoLivro = new Book("Título do livro", "Nome do autor", número de páginas, objeto do tipo Person que representa o leitor);```;

- Para criar um novo objeto do tipo Person, basta chamar o construtor da classe, passando os valores adequados para os parâmetros do construtor:

```Person novaPessoa = new Person("Nome da pessoa", idade, 'gênero');```
- O gênero deve ser representado por uma letra: 'M' para masculino e 'F' para feminino.

É importante observar que os métodos leafThrough, nextPage e backPage não alteram o valor do atributo currentPage se o livro estiver fechado ou se a página para onde se quer avançar ou retroceder não existir. Isso é feito com a verificação if (p > getTotalPage() || getOpen() == false)... respectivamente.

## Como contribuir
Se você deseja contribuir para este repositório, sinta-se à vontade para:

- Realizar um fork deste repositório
- Criar uma branch com suas alterações (git checkout -b nome-da-branch)
- Realizar um commit das suas alterações (git commit -am 'Descrição das alterações')
- Enviar sua branch para o repositório (git push origin nome-da-branch)
- Criar um pull request
- Lembre-se de sempre seguir a [Política de Contribuição](https://docs.spongepowered.org/stable/pt/contributing/guidelines.html) deste repositório.

## Contato
Se você tiver dúvidas ou sugestões, entre em contato comigo através do meu email ou das minhas redes sociais.

Email: charles.eduardo.mello.guimaraes@hotmail.com

LinkedIn: [Eduardo Mello](linkedin.com/in/eduardomg12/)
