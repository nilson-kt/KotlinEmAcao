Escreva um singleton (uma única instância de uma classe) chamada Jokenpo. Esse singleton terá os seguintes métodos: 

1- jogadaPlayer: lê a jogada do jogador, exibe-a na tela e retorna uma lista com a identificação do jogador e sua jogada.

2- jogadaCPU: gera aleatoriamente a jogada da CPU, exibindo-a na tela, e retorna uma lista com a identificação da CPU e sua jogada.

3- determinarVencedor: determina o vencedor com base nas jogadas do jogador e da CPU.

4- checarContinuacaoDoJogo: verifica se o jogador deseja continuar jogando.

5- fimDeJogo: exibe informações finais sobre o jogo e quebra o loop, encerrando o programa.

6- jogar: inicia o jogo, gerenciando as rodadas e o fluxo do jogo.


Além disso, crie um outro singleton chamado Leitor, que terá o método lerJogada, responsável por ler e tratar a entrada do jogador. Caso deseje, crie mais outro singleton chamado Cores, que terá métodos que retornam uma string com uma cor específica.

Exemplo de Output:
~~~
----------------------------------------
1 - [Pedra]
2 - [Papel]
3 - [Tesoura]
----------------------------------------
Qual é a sua jogada?: 2
Player: Papel.
Computador: Pedra.
O vencedor é Player!
----------------------------------------
Deseja jogar mais uma? [S/N]: 
Opção inválida.
Deseja jogar mais uma? [S/N]: s
----------------------------------------
1 - [Pedra]
2 - [Papel]
3 - [Tesoura]
----------------------------------------
Qual é a sua jogada?: 
Opção inválida. Digite um número inteiro de 1 a 3.
Qual é a sua jogada?: 5
Opção inválida. Digite um número inteiro de 1 a 3.
----------------------------------------
1 - [Pedra]
2 - [Papel]
3 - [Tesoura]
----------------------------------------
Qual é a sua jogada?: 3
Player: Tesoura.
Computador: Papel.
O vencedor é Player!
----------------------------------------
Deseja jogar mais uma? [S/N]: s
----------------------------------------
1 - [Pedra]
2 - [Papel]
3 - [Tesoura]
----------------------------------------
Qual é a sua jogada?: 2
Player: Papel.
Computador: Papel.
Houve um empate!
----------------------------------------
Deseja jogar mais uma? [S/N]: s
----------------------------------------
1 - [Pedra]
2 - [Papel]
3 - [Tesoura]
----------------------------------------
Qual é a sua jogada?: 1
Player: Pedra.
Computador: Papel.
O vencedor é CPU!
----------------------------------------
Deseja jogar mais uma? [S/N]: n
----------------------------------------
Informações Finais: 
-Total de Partidas: 4
-Vitórias do Player: 2
-Vitórias do Computador: 1
-Empates: 1
----------------------------------------
Fim do Jogo. Volte sempre.
~~~