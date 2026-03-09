FIAP Ride 🚗

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos da FIAP.

📚 Objetivo

Implementar classes em Java utilizando conceitos de Programação Orientada a Objetos (POO), como:

Classes

Atributos

Métodos

Instanciação de objetos

Regras de negócio

O projeto simula um sistema simples de mobilidade urbana chamado FiapRide, onde passageiros possuem uma carteira digital para pagar viagens.

🧩 Diagrama de Classes

O diagrama UML do projeto está disponível na pasta:

/diagramas/diagrama-classes.asta

Ele representa a estrutura da classe Passageiro, incluindo seus atributos e métodos.

🚶 Classe Passageiro

A classe Passageiro representa um usuário do sistema FiapRide que pode adicionar saldo à sua carteira digital e pagar viagens.

Atributos

nome → Nome do passageiro

cpf → CPF do passageiro

saldo → Saldo disponível para pagar viagens

Métodos

adicionarSaldo(valor)
Adiciona saldo à carteira do passageiro.

Validação:

O valor da recarga deve ser maior que zero.

pagarViagem(custo)
Realiza o pagamento de uma corrida utilizando o saldo disponível.

Validações:

O custo da viagem deve ser maior que zero

O passageiro deve possuir saldo suficiente

🛠 Tecnologias Utilizadas

Java

Eclipse

Astah UML

Git

GitHub

👨‍💻 Autor

Ryan Amorim de Castro Santana
