Neste exercício, você criará uma hierarquia de classes em Kotlin para simular componentes gráficos, como botões. Comece definindo uma classe Component com um método abstrato para posição e um método para renderização que exiba a posição de um componente. Em seguida, crie uma classe Text que herde de Component, adicione um atributo de texto e personalize o método de renderização para exibir posição e texto.

Depois, desenvolva a classe Button herdando de Text. Adicione um atributo de cor de fundo ao botão e um atributo que representa uma posição. Ajuste o método de posição para lidar com a posição específica do botão e personalize o método de renderização para exibir posição, texto e cor de fundo. Ao praticar, crie um objeto Button com um texto, uma cor de fundo e uma posição. Em seguida, chame o método de renderização deste botão para ver as informações na saída.

Exemplo de Output:
~~~
Posição: 4 | 5
Texto: Clique Aqui
Cor: 30
~~~