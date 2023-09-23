Modo decorativo
Quatro funções:
Componente componente abstrato

Componente é uma interface ou classe abstrata, que define nosso objeto principal, que é o objeto mais primitivo.

No modo de decoração, deve haver uma interface ou classe abstrata mais básica, central e original que sirva como o componente abstrato Component.

Componente de concreto ConcreteComponent

ConcreteComponent é a implementação central, mais primitiva e mais básica de uma interface ou classe abstrata, e é o objeto que precisa ser decorado.

Personagem decorativo decorador

Geralmente uma classe abstrata. Pode não haver necessariamente métodos abstratos nele, mas deve haver uma variável privada em suas propriedades apontando para o componente abstrato Component.

Classe de decoração de concreto ConcreteDecorator

Para uma decoração específica, as coisas mais essenciais, originais e básicas devem ser decoradas em outras coisas.