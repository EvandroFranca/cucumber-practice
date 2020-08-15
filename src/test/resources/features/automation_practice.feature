#language:pt

  Funcionalidade: Testar acesso ao site automation practice e navegação por ele

  @login
  Cenário: Verificar se o sistema permite efetuar login
  Dado que acessei o site "http://www.automationpractice.com" com sucesso
  E que acessei a tela de login
  Quando preencho o campo email com "evs.ftw@gmail.com"
  E preencho o campo password com "12345"
  E clico no botao login
  Entao o sistema permite o login