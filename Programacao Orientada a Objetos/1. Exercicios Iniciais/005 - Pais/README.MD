Escreva uma classe que represente um país. Um país é representado através dos atributos: código ISO 3166-1 (ex.: BRA), nome (ex.: Brasil), e a sua dimensão em Km2 (ex.: 8.515.767,049). Além disso, cada país mantém uma lista de outros países com os quais ele faz fronteira. Instancie alguns países para poder manipulá-los. A seguir estão os membros da classe:

1- Construtor que inicialize o código ISO, o nome e a dimensão do
país;

2- Métodos de acesso (getter/setter) para as propriedades código
ISO, nome e dimensão do país;

3- Um método que permita verificar se dois objetos representam o
mesmo país (igualdade semântica);

4- Um método que informe se outro país é limítrofe do país que
recebeu a mensagem;

5- Um método que receba um país como parâmetro e retorne a lista de
vizinhos comuns aos dois países.

Exemplo de Output:
~~~
---------------------------------------------
                    MENU
---------------------------------------------
1 - Selecionar um país
2 - Exibir países
3 - Verificar fronteira com outro país
4 - Verificar fronteiras em comum com outro país
5 - Sair do Programa
---------------------------------------------
Sua opção: 1
---------------------------------------------
ISO  Nome                Dimensão
BRA  Brasil              8510417.771
VEN  Venezuela           912050.0
CHL  Chile               756945.0
ECU  Equador             283561.0
PRY  Paraguai            406752.0
COL  Colômbia            1142000.0
Digite a ISO de um país: BRA
---------------------------------------------
                    MENU
---------------------------------------------
PAÍS SELECIONADO: Brasil
1 - Selecionar outro país
2 - Exibir países
3 - Verificar fronteira com outro país
4 - Verificar fronteiras em comum com outro país
5 - Sair do Programa
---------------------------------------------
Sua opção: 2
---------------------------------------------
ISO  Nome                Dimensão
BRA  Brasil              8510417.771
VEN  Venezuela           912050.0
CHL  Chile               756945.0
ECU  Equador             283561.0
PRY  Paraguai            406752.0
COL  Colômbia            1142000.0
Pressione Enter para voltar ao Menu 
---------------------------------------------
                    MENU
---------------------------------------------
PAÍS SELECIONADO: Brasil
1 - Selecionar outro país
2 - Exibir países
3 - Verificar fronteira com outro país
4 - Verificar fronteiras em comum com outro país
5 - Sair do Programa
---------------------------------------------
Sua opção: 3
---------------------------------------------
ISO  Nome                Dimensão
BRA  Brasil              8510417.771
VEN  Venezuela           912050.0
CHL  Chile               756945.0
ECU  Equador             283561.0
PRY  Paraguai            406752.0
COL  Colômbia            1142000.0
Digite a ISO de um país: VEN
Sim. Brasil faz fronteira com Venezuela
Pressione Enter para voltar ao Menu 
---------------------------------------------
                    MENU
---------------------------------------------
PAÍS SELECIONADO: Brasil
1 - Selecionar outro país
2 - Exibir países
3 - Verificar fronteira com outro país
4 - Verificar fronteiras em comum com outro país
5 - Sair do Programa
---------------------------------------------
Sua opção: 3
---------------------------------------------
ISO  Nome                Dimensão
BRA  Brasil              8510417.771
VEN  Venezuela           912050.0
CHL  Chile               756945.0
ECU  Equador             283561.0
PRY  Paraguai            406752.0
COL  Colômbia            1142000.0
Digite a ISO de um país: CHL
Não faz fronteira.
Pressione Enter para voltar ao Menu 
---------------------------------------------
                    MENU
---------------------------------------------
PAÍS SELECIONADO: Brasil
1 - Selecionar outro país
2 - Exibir países
3 - Verificar fronteira com outro país
4 - Verificar fronteiras em comum com outro país
5 - Sair do Programa
---------------------------------------------
Sua opção: 4
---------------------------------------------
ISO  Nome                Dimensão
BRA  Brasil              8510417.771
VEN  Venezuela           912050.0
CHL  Chile               756945.0
ECU  Equador             283561.0
PRY  Paraguai            406752.0
COL  Colômbia            1142000.0
Digite a ISO de um país: COL
Brasil e Colômbia - Fronteiras em Comum: []
Pressione Enter para voltar ao Menu 
---------------------------------------------
                    MENU
---------------------------------------------
PAÍS SELECIONADO: Brasil
1 - Selecionar outro país
2 - Exibir países
3 - Verificar fronteira com outro país
4 - Verificar fronteiras em comum com outro país
5 - Sair do Programa
---------------------------------------------
Sua opção: 4
---------------------------------------------
ISO  Nome                Dimensão
BRA  Brasil              8510417.771
VEN  Venezuela           912050.0
CHL  Chile               756945.0
ECU  Equador             283561.0
PRY  Paraguai            406752.0
COL  Colômbia            1142000.0
Digite a ISO de um país: VEN
Brasil e Venezuela - Fronteiras em Comum: [Colômbia]
Pressione Enter para voltar ao Menu 
---------------------------------------------
                    MENU
---------------------------------------------
PAÍS SELECIONADO: Brasil
1 - Selecionar outro país
2 - Exibir países
3 - Verificar fronteira com outro país
4 - Verificar fronteiras em comum com outro país
5 - Sair do Programa
---------------------------------------------
Sua opção: 5
~~~