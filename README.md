# Projeto Java Puro – Gestão de Dívidas e Transações

## Objetivo
Este projeto tem como objetivo consolidar conhecimentos de **Java puro** aplicando o padrão **MVC (Model-View-Controller)**. Ele permite gerenciar dívidas e transações de forma simples, servindo como **vitrine para estudos e portfólio**.

O foco principal do projeto é:
- Fixar lógica de programação e orientação a objetos.
- Praticar manipulação de listas (`ArrayList`) e operações básicas de CRUD.
- Entender o fluxo de dados entre **Model**, **Repository**, **Service** e **Controller**.
- Servir como base para futuros estudos em **Spring Boot e banco de dados**.

---

## Estrutura do Projeto

src/
- model: Contém as classes de domínio (Divida, Transacao)
-  repository: Camada de persistência em memória (ArrayList)
-  service: Camada de regras de negócio
-  controller: Camada de interação com o usuário (menu, entrada/saída)


**Fluxo geral:**
1. O **Controller** recebe a interação do usuário (via console).
2. O Controller chama a **Service**, que aplica regras de negócio.
3. A Service interage com o **Repository**, que gerencia os dados em memória.
4. A **Model** representa os objetos de domínio (`Divida` e `Transacao`).

---

## Funcionalidades

### Dívidas
- Adicionar nova dívida.
- Listar todas as dívidas.
- Remover dívida existente.

### Transações
- Adicionar nova transação.
- Listar todas as transações.
- Remover transação existente.

---

## Tecnologias e Conceitos
- **Java Puro** (sem frameworks externos).
- **Padrão MVC**.
- **Coleções Java** (`ArrayList`).
- **Entrada e saída de dados via Console** (`Scanner`).
- **Manipulação de objetos e métodos**.
- Conceitos de **orientação a objetos**: classes, objetos, encapsulamento, getters/setters.

---

## Demonstração

O projeto é executado via console, mostrando a interação das camadas **Controller** e **Service**.  
O usuário pode:

- Adicionar dívidas e transações.
- Listar todas as dívidas e transações.
- Remover itens existentes.

Toda a lógica é processada na camada **Service**, enquanto a persistência é feita em memória na camada **Repository**.  
O **Controller** é responsável por capturar a entrada do usuário e exibir as informações no console.

**Vídeos de demonstração no repositório:**
- [Fluxo de Dívidas](DemonstraçãoDaCamadaDivida.mp4)
- [Fluxo de Transações](DemonstraçãoDaCamadaTransação.mp4)


## Observações

- **Este projeto ainda está em evolução, servindo como base para estudo e futura integração com Spring Boot, H2 Database e um front-end básico.**

- **Código comentado para facilitar revisão e aprendizado.**
