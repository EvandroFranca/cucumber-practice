#language:pt

  @api_user
  Funcionalidade: Verificar o funcionamento do endpoint 'user' da API petshop

    @cadastrar_user_valido
    Cenario: Verificar a criação de novo usuário da API petshop
      Dado que informo dados de usuário "válido" na API
      Quando realizo a chamada da API de usuários
      Então a API retorna mensagem de sucesso

    @cadastrar_user_invalido
    Cenario: Verificar a criação de novo usuário da API petshop sem informar username
      Dado que informo dados de usuário "válido" na API
      E que não informo o campo userName
      Quando realizo a chamada da API de usuários
      Então a API retorna mensagem de erro de requisição