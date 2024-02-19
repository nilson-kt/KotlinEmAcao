Escreva uma classe em que cada objeto representa um voo que acontece em determinada data. Cada voo possui no máxximo 100 passageiros, e a classe permite controlar a ocupação das vagas. A classe deve ter os seguintes métodos:

-construtor: configura os dados do voo (recebidos como parâmetro): id do voo, data (para armazenar a data, utilize um objeto da classe Data, criada na questão anterior)

-proximoLivre: retorna o número da próxima cadeira livre

-verificaa: verifica se o número da cadeira recebido como parâmetro está ocupada

-ocupa: ocupa determinada cadeira do voo, cujo número é recebido como parâmetro, e retorna verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso contrário

-vagas: retorna o número de cadeiras disponíveis (não ocupadas) no voo

-getVoo: retorna o id do voo

Exemplo de Output:
~~~
----------------------------------------
MENU
----------------------------------------
[1] Ver cadeiras disponíveis
[2] Ver todas as cadeiras
[3] Ocupar uma cadeira
[4] Ver próxima cadeira disponível
[5] Verificar uma cadeira
[6] Ver informações sobre o voo
[7] Sair do programa
----------------------------------------
Sua opção: 1
{1=vazia, 2=vazia, 3=vazia, 4=vazia, 5=vazia, 6=vazia, 7=vazia, 8=vazia, 9=vazia, 10=vazia, 11=vazia, 12=vazia, 13=vazia, 14=vazia, 15=vazia, 16=vazia, 17=vazia, 18=vazia, 19=vazia, 20=vazia, 21=vazia, 22=vazia, 23=vazia, 24=vazia, 25=vazia, 26=vazia, 27=vazia, 28=vazia, 29=vazia, 30=vazia, 31=vazia, 32=vazia, 33=vazia, 34=vazia, 35=vazia, 36=vazia, 37=vazia, 38=vazia, 39=vazia, 40=vazia, 41=vazia, 42=vazia, 43=vazia, 44=vazia, 45=vazia, 46=vazia, 47=vazia, 48=vazia, 49=vazia, 50=vazia, 51=vazia, 52=vazia, 53=vazia, 54=vazia, 55=vazia, 56=vazia, 57=vazia, 58=vazia, 59=vazia, 60=vazia, 61=vazia, 62=vazia, 63=vazia, 64=vazia, 65=vazia, 66=vazia, 67=vazia, 68=vazia, 69=vazia, 70=vazia, 71=vazia, 72=vazia, 73=vazia, 74=vazia, 75=vazia, 76=vazia, 77=vazia, 78=vazia, 79=vazia, 80=vazia, 81=vazia, 82=vazia, 83=vazia, 84=vazia, 85=vazia, 86=vazia, 87=vazia, 88=vazia, 89=vazia, 90=vazia, 91=vazia, 92=vazia, 93=vazia, 94=vazia, 95=vazia, 96=vazia, 97=vazia, 98=vazia, 99=vazia, 100=vazia}
----------------------------------------
MENU
----------------------------------------
[1] Ver cadeiras disponíveis
[2] Ver todas as cadeiras
[3] Ocupar uma cadeira
[4] Ver próxima cadeira disponível
[5] Verificar uma cadeira
[6] Ver informações sobre o voo
[7] Sair do programa
----------------------------------------
Sua opção: 3
Qual cadeira deseja ocupar?: 4
A cadeira 4 foi ocupada com sucesso!
----------------------------------------
MENU
----------------------------------------
[1] Ver cadeiras disponíveis
[2] Ver todas as cadeiras
[3] Ocupar uma cadeira
[4] Ver próxima cadeira disponível
[5] Verificar uma cadeira
[6] Ver informações sobre o voo
[7] Sair do programa
----------------------------------------
Sua opção: 1
{1=vazia, 2=vazia, 3=vazia, 5=vazia, 6=vazia, 7=vazia, 8=vazia, 9=vazia, 10=vazia, 11=vazia, 12=vazia, 13=vazia, 14=vazia, 15=vazia, 16=vazia, 17=vazia, 18=vazia, 19=vazia, 20=vazia, 21=vazia, 22=vazia, 23=vazia, 24=vazia, 25=vazia, 26=vazia, 27=vazia, 28=vazia, 29=vazia, 30=vazia, 31=vazia, 32=vazia, 33=vazia, 34=vazia, 35=vazia, 36=vazia, 37=vazia, 38=vazia, 39=vazia, 40=vazia, 41=vazia, 42=vazia, 43=vazia, 44=vazia, 45=vazia, 46=vazia, 47=vazia, 48=vazia, 49=vazia, 50=vazia, 51=vazia, 52=vazia, 53=vazia, 54=vazia, 55=vazia, 56=vazia, 57=vazia, 58=vazia, 59=vazia, 60=vazia, 61=vazia, 62=vazia, 63=vazia, 64=vazia, 65=vazia, 66=vazia, 67=vazia, 68=vazia, 69=vazia, 70=vazia, 71=vazia, 72=vazia, 73=vazia, 74=vazia, 75=vazia, 76=vazia, 77=vazia, 78=vazia, 79=vazia, 80=vazia, 81=vazia, 82=vazia, 83=vazia, 84=vazia, 85=vazia, 86=vazia, 87=vazia, 88=vazia, 89=vazia, 90=vazia, 91=vazia, 92=vazia, 93=vazia, 94=vazia, 95=vazia, 96=vazia, 97=vazia, 98=vazia, 99=vazia, 100=vazia}
----------------------------------------
MENU
----------------------------------------
[1] Ver cadeiras disponíveis
[2] Ver todas as cadeiras
[3] Ocupar uma cadeira
[4] Ver próxima cadeira disponível
[5] Verificar uma cadeira
[6] Ver informações sobre o voo
[7] Sair do programa
----------------------------------------
Sua opção: 2
{1=vazia, 2=vazia, 3=vazia, 4=ocupada, 5=vazia, 6=vazia, 7=vazia, 8=vazia, 9=vazia, 10=vazia, 11=vazia, 12=vazia, 13=vazia, 14=vazia, 15=vazia, 16=vazia, 17=vazia, 18=vazia, 19=vazia, 20=vazia, 21=vazia, 22=vazia, 23=vazia, 24=vazia, 25=vazia, 26=vazia, 27=vazia, 28=vazia, 29=vazia, 30=vazia, 31=vazia, 32=vazia, 33=vazia, 34=vazia, 35=vazia, 36=vazia, 37=vazia, 38=vazia, 39=vazia, 40=vazia, 41=vazia, 42=vazia, 43=vazia, 44=vazia, 45=vazia, 46=vazia, 47=vazia, 48=vazia, 49=vazia, 50=vazia, 51=vazia, 52=vazia, 53=vazia, 54=vazia, 55=vazia, 56=vazia, 57=vazia, 58=vazia, 59=vazia, 60=vazia, 61=vazia, 62=vazia, 63=vazia, 64=vazia, 65=vazia, 66=vazia, 67=vazia, 68=vazia, 69=vazia, 70=vazia, 71=vazia, 72=vazia, 73=vazia, 74=vazia, 75=vazia, 76=vazia, 77=vazia, 78=vazia, 79=vazia, 80=vazia, 81=vazia, 82=vazia, 83=vazia, 84=vazia, 85=vazia, 86=vazia, 87=vazia, 88=vazia, 89=vazia, 90=vazia, 91=vazia, 92=vazia, 93=vazia, 94=vazia, 95=vazia, 96=vazia, 97=vazia, 98=vazia, 99=vazia, 100=vazia}
----------------------------------------
MENU
----------------------------------------
[1] Ver cadeiras disponíveis
[2] Ver todas as cadeiras
[3] Ocupar uma cadeira
[4] Ver próxima cadeira disponível
[5] Verificar uma cadeira
[6] Ver informações sobre o voo
[7] Sair do programa
----------------------------------------
Sua opção: 4
A próxima cadeira disponível é: 1
----------------------------------------
MENU
----------------------------------------
[1] Ver cadeiras disponíveis
[2] Ver todas as cadeiras
[3] Ocupar uma cadeira
[4] Ver próxima cadeira disponível
[5] Verificar uma cadeira
[6] Ver informações sobre o voo
[7] Sair do programa
----------------------------------------
Sua opção: 5
Digite o número de uma cadeira para fazermos a verificação: 4
A cadeira 4 está ocupada.
----------------------------------------
MENU
----------------------------------------
[1] Ver cadeiras disponíveis
[2] Ver todas as cadeiras
[3] Ocupar uma cadeira
[4] Ver próxima cadeira disponível
[5] Verificar uma cadeira
[6] Ver informações sobre o voo
[7] Sair do programa
----------------------------------------
Sua opção: 6
ID: 1
Data: 02/12/2023
----------------------------------------
MENU
----------------------------------------
[1] Ver cadeiras disponíveis
[2] Ver todas as cadeiras
[3] Ocupar uma cadeira
[4] Ver próxima cadeira disponível
[5] Verificar uma cadeira
[6] Ver informações sobre o voo
[7] Sair do programa
----------------------------------------
Sua opção: 7
Programa Encerrado. Volte sempre.
~~~