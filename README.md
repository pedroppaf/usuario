# API REST de Usuários com Spring Boot, JWT e Docker

Este projeto é uma API REST desenvolvida utilizando Java e Spring Boot para gerenciamento de usuários, com autenticação segura baseada em JWT, persistência em banco PostgreSQL e execução containerizada com Docker.

O objetivo deste projeto é demonstrar conhecimentos práticos em desenvolvimento backend, arquitetura em camadas, segurança com Spring Security e integração com serviços externos.

---

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- PostgreSQL
- Spring Cloud OpenFeign
- Swagger 
- Docker
- Docker Compose
- Gradle
- Git

---

## Funcionalidades

- Cadastro de usuários
- Autenticação com JWT
- Autorização baseada em token
- Consulta de usuário por email
- Atualização de dados do usuário
- Cadastro e atualização de endereço
- Cadastro e atualização de telefone
- Integração com API ViaCEP
- Documentação automática com Swagger
- Containerização com Docker

---

## Arquitetura

O projeto segue arquitetura em camadas:
Controller → Service → Repository → Database

Também inclui camada de segurança:
Security → JWT Filter → Authentication → Authorization


---

## Banco de Dados

Banco utilizado: PostgreSQL

---

## Segurança

Este projeto implementa autenticação e autorização utilizando:

- Spring Security
- JWT (JSON Web Token)
- Stateless Authentication

Fluxo de autenticação:

1. Usuário faz login
2. Recebe um JWT
3. Usa o token para acessar endpoints protegidos

---

## Integração Externa

O projeto integra com a API ViaCEP para consulta de endereço via CEP.

Utilizando:

- Spring Cloud OpenFeign

---

## Objetivo do Projeto

Este projeto foi desenvolvido com foco em demonstrar competências em:

- Desenvolvimento backend com Java
- Criação de APIs REST
- Segurança com Spring Security e JWT
- Persistência de dados com JPA
- Integração com serviços externos
- Containerização com Docker
- Arquitetura limpa e organizada

---

## Links

LinkedIn: https://linkedin.com/in/pedroppaf  
GitHub: https://github.com/pedroppaf

---

## Status do Projeto

Projeto funcional e pronto para execução local via Docker.


