Padroes de Projeto

1) Criacionais -> Os padrões criacionais fornecem vários mecanismos de criação de objetos, que aumentam a flexibilidade e reutilização de código já existente.
2) Estruturais -> Os padrões estruturais explicam como montar objetos e classes em estruturas maiores mas ainda mantendo essas estruturas flexíveis e eficientes.
3) Comportamentais -> Padrões comportamentais são voltados aos algoritmos e a designação de responsabilidades entre objetos.

* Estruturais

1.Adapter

O que é:
O Adapter é um padrão de projeto estrutural, que permite a colaboração de objetos incompatíveis.

Aplicabilidade:
Utilize a classe Adaptador quando você quer usar uma classe existente, mas sua interface não for compatível com o resto do seu código.
Utilize o padrão quando você quer reutilizar diversas subclasses existentes que não possuam alguma funcionalidade comum que não pode ser adicionada a superclasse.

Identificação:
O Adapter é reconhecível por um construtor que utiliza uma instância de tipo abstrato/interface diferente. Quando o adaptador recebe uma chamada para qualquer um de seus métodos, ele converte parâmetros para o formato apropriado e direciona a chamada para um ou vários métodos do objeto envolvido.

Exempos de utilizacao:
java.util.Arrays#asList()
java.util.Collections#list()