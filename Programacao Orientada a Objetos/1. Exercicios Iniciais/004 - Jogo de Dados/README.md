Crie uma classe DadoGame que gerencia um jogo de lançamento de dados entre um jogador e o computador.

Atributos:

-partidas: armazena o registro das partidas, cada partida é representada por uma lista com mapas, cada mapa contendo os detalhes do lançamento do jogador, do computador e o resultado.

-instrucao: armazena as instruções do jogo

Classes:

-exibirMenu: apresenta um menu interativo ao jogador e trata as opções selecionadas

-jogarDado: retorna um número aleatório de 1 a 6

-processarPartida: pega os dados lançados pelo CPU e Player, gera um resultado "Player Wins", "CPU Wins" ou "Empate" e adiciona as informações da partida em um mapa na lista (propriedade) partidas

-exibirUltimaPartida

-jogar: joga os dados do Player e CPU, processa a partida e exibe a última partida.

-getVitoriasPlayer: retorna o número de vitórias do Player

Exemplo de Output:
~~~
----------------------------------------
JOGO DOS DADOS
----------------------------------------
[1] Rolar dado
[2] Exibir partidas
[3] Exibir quantidade de vitórias
[4] Exibir instruções
[5] Sair do Jogo
----------------------------------------
Sua opção: 1
========================================
Player rolou 6
CPU rolou 1
Resultado = Player Wins
========================================
Pressione enter para continuar 
----------------------------------------
JOGO DOS DADOS
----------------------------------------
[1] Rolar dado
[2] Exibir partidas
[3] Exibir quantidade de vitórias
[4] Exibir instruções
[5] Sair do Jogo
----------------------------------------
Sua opção: 2
[{Player=6, CPU=1, Resultado=Player Wins}]
Pressione enter para continuar 
----------------------------------------
JOGO DOS DADOS
----------------------------------------
[1] Rolar dado
[2] Exibir partidas
[3] Exibir quantidade de vitórias
[4] Exibir instruções
[5] Sair do Jogo
----------------------------------------
Sua opção: 3
O Player teve 1 vitórias
Pressione enter para continuar 
----------------------------------------
JOGO DOS DADOS
----------------------------------------
[1] Rolar dado
[2] Exibir partidas
[3] Exibir quantidade de vitórias
[4] Exibir instruções
[5] Sair do Jogo
----------------------------------------
Sua opção: 4
O player digita 1 para rolar o dado. O dado pode cair num número de 1 a 6. Caso
o dado lançado pelo computador for maior do que o do player, o computador ganha.
Do contrário, o player ganha. Se for o mesmo valor, haverá empate.
Pressione enter para continuar 
----------------------------------------
JOGO DOS DADOS
----------------------------------------
[1] Rolar dado
[2] Exibir partidas
[3] Exibir quantidade de vitórias
[4] Exibir instruções
[5] Sair do Jogo
----------------------------------------
Sua opção: 1
========================================
Player rolou 6
CPU rolou 4
Resultado = Player Wins
========================================
Pressione enter para continuar 
----------------------------------------
JOGO DOS DADOS
----------------------------------------
[1] Rolar dado
[2] Exibir partidas
[3] Exibir quantidade de vitórias
[4] Exibir instruções
[5] Sair do Jogo
----------------------------------------
Sua opção: 2
[{Player=6, CPU=1, Resultado=Player Wins}, {Player=6, CPU=4, Resultado=Player Wins}]
Pressione enter para continuar 
----------------------------------------
JOGO DOS DADOS
----------------------------------------
[1] Rolar dado
[2] Exibir partidas
[3] Exibir quantidade de vitórias
[4] Exibir instruções
[5] Sair do Jogo
----------------------------------------
Sua opção: 5
~~~