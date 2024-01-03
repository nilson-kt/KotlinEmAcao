Crie uma classe abstrata chamada Instrumento. Estabeleça uma hierarquia: InstrumentoDeCorda, InstrumentoDeSopro. Defina o método afinar() e tocar() na classe de instrumentos, onde tocar() verifica a afinação antes de um músico tocar o instrumento. Crie subclasses como Violao, Violino, Flauta e Trombone, detalhando o comportamento específico de afinação em cada instrumento ao implementar o método afinar(). Desenvolva uma classe separada para representar os músicos, garantindo que eles possam ser associados aos instrumentos que tocam. Implemente uma função tocar() que receba um instrumento e um músico como parâmetros, verificando a afinação antes de permitir que o músico toque. Na função main(), crie instâncias dos instrumentos e músicos, associe cada músico ao seu instrumento correspondente e chame a função tocar() para simular a interação entre músicos e instrumentos.


Exemplo de Output:
~~~
Michael, por favor, afine seu instrumento: Violino
------------------------------------------------------------
Afinando as cordas respectivamente MI LÁ RÉ SOL SI MI...
(Maria toca o Violão)
------------------------------------------------------------
Afinando por meio do ajuste das chaves e da embocadura...
(João toca a Flauta)
------------------------------------------------------------
Afinando por meio do ajuste da posição da vara...
(Rafaela toca o Trombone)
------------------------------------------------------------
~~~