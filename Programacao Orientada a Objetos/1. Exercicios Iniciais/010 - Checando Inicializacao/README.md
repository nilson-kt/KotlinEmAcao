Crie uma classe "PerfilUsuario" com uma propriedade nome marcada como lateinit. Implemente um método chamado "checarInicializacao" para verificar se o nome foi inicializado. Crie também um singleton chamado "Leitor" que possua o método "lerNome" para capturar e validar um nome. O nome não deve ser vazio ou em branco e também só pode aceitar letras ou espaços. 

No final, crie uma instância de "PerfilUsuario", use o método do Leitor para atribuir um nome, e utilize o método "checarInicializacao" para verificar se o nome foi inicializado.

Exemplos de Output:

1-
~~~
Digite um nome: @
Somente é aceito letras e espaços.
O nome não foi inicializado ainda.
~~~

2-
~~~
Digite um nome:        
Nome vazio.
O nome não foi inicializado ainda.
~~~

3-
~~~
Digite um nome: Gustavo
Nome inicializado!
Nome: Gustavo
~~~