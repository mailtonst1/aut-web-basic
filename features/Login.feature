# language:pt
# encoding:utf-8

@mailton
Funcionalidade: Login

    Contexto: Eu como usuário desejo fazer login no sistema
    "phptravels" com login é senha validos.
        Dado que estou na pagina de login do sistema

        Esquema do Cenário: Logar informando email e senha validos
            E       que preencho um login é uma senha valido <login> <senha>
            Quando  confirmo para logar
            Então   devo ver minha página principal
            Exemplos:
                | login                | senha          |
                | user@phptravels.com  | demouser       |



