Crie um sistema de gestão escolar. O seu programa deverá ter estes componentes:

1- classe Escola: responsável por gerenciar departamentos e cursos. Contém métodos para visualizar, adicionar e criar esses elementos.

2- singleton Leitor: responsável por ler e validar as entradas do usuário, além de exibir mensagens e interagir com o usuário durante a execução do programa.

3- singleton Painel: contém representações visuais dos menus e cabeçalhos exibidos para o usuário.

4- singleton Cores:  lida com a formatação colorida do texto exibido no console.

5- arquivo Main.kt: ponto de entrada do programa. Contém um loop principal que exibe um menu para a interação do usuário com as opções disponíveis.


Exemplo de Output:
~~~
----------------------------------------
             MENU PRINCIPAL
----------------------------------------
1 - Departamentos
2 - Cursos
3 - Sair do Programa
Sua opção: 1
----------------------------------------
             DEPARTAMENTOS
----------------------------------------
1 - Visualizar Departamentos
2 - Adicionar Departamentos
3 - Voltar ao Menu
Sua opção: 2
----------------------------------------
        CADASTRO DE DEPARTAMENTO
----------------------------------------
Nome do Departamento (0 para cancelar): Linguística
Departamento criado com sucesso.
Pressione Enter para voltar à aba de Departamentos 
----------------------------------------
             DEPARTAMENTOS
----------------------------------------
1 - Visualizar Departamentos
2 - Adicionar Departamentos
3 - Voltar ao Menu
Sua opção: 1
----------------------------------------
         LISTA DE DEPARTAMENTOS
----------------------------------------
ID   Nome
1    Linguística
Pressione Enter para voltar à aba de Departamentos 
----------------------------------------
             DEPARTAMENTOS
----------------------------------------
1 - Visualizar Departamentos
2 - Adicionar Departamentos
3 - Voltar ao Menu
Sua opção: 3
----------------------------------------
             MENU PRINCIPAL
----------------------------------------
1 - Departamentos
2 - Cursos
3 - Sair do Programa
Sua opção: 2
----------------------------------------
                CURSOS
----------------------------------------
1 - Visualizar Cursos
2 - Adicionar Cursos
3 - Voltar ao Menu
Sua opção: 1
----------------------------------------
         LISTA DE DEPARTAMENTOS
----------------------------------------
ID   Nome
1    Linguística
----------------------------------------
Selecione um departamento (0 para cancelar): 1
Não existe nenhum curso atrelado a este departamento.
Pressione Enter para voltar à aba de Cursos 
----------------------------------------
                CURSOS
----------------------------------------
1 - Visualizar Cursos
2 - Adicionar Cursos
3 - Voltar ao Menu
Sua opção: 2
----------------------------------------
         LISTA DE DEPARTAMENTOS
----------------------------------------
ID   Nome
1    Linguística
----------------------------------------
Selecione um departamento (0 para cancelar): 1
----------------------------------------
           CADASTRO DE CURSO
----------------------------------------
Digite o nome do curso (0 para cancelar): Semântica Formal
Curso criado com sucesso.
Pressione Enter para voltar à aba de Cursos 
----------------------------------------
                CURSOS
----------------------------------------
1 - Visualizar Cursos
2 - Adicionar Cursos
3 - Voltar ao Menu
Sua opção: 1
----------------------------------------
         LISTA DE DEPARTAMENTOS
----------------------------------------
ID   Nome
1    Linguística
----------------------------------------
Selecione um departamento (0 para cancelar): 1
ID   Nome
1    Semântica Formal
Pressione Enter para voltar à aba de Cursos 
----------------------------------------
                CURSOS
----------------------------------------
1 - Visualizar Cursos
2 - Adicionar Cursos
3 - Voltar ao Menu
Sua opção: 3
----------------------------------------
             MENU PRINCIPAL
----------------------------------------
1 - Departamentos
2 - Cursos
3 - Sair do Programa
Sua opção: 3
----------------------------------------
Programa encerrado.
~~~