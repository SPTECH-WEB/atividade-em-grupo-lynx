# 📦 Projeto de Entregas com Adapter, Strategy e Observer

## 🎯 Objetivo

Este projeto demonstra a aplicação dos padrões de projeto **Adapter**, **Strategy** e **Observer** em um cenário realista de desenvolvimento de software. O sistema simula um módulo de **entregas** para uma plataforma de e-commerce, utilizando **Java com Spring Boot**.

---

## 🧱 Cenário

O módulo de entregas foi projetado para ser **flexível**, **reutilizável** e de **fácil manutenção**, atendendo a requisitos típicos de sistemas corporativos. Foram utilizados três padrões de projeto para garantir uma arquitetura sólida e escalável.

---

## 📐 Padrões de Projeto Aplicados

| Padrão     | Descrição |
|------------|-----------|
| **Adapter** | Permite a integração com uma API de transportadora externa, adaptando interfaces incompatíveis. |
| **Strategy** | Oferece diferentes estratégias de cálculo de frete, alteráveis em tempo de execução. |
| **Observer** | Permite executar múltiplas ações reativas automaticamente após o processamento de um pedido (ex: e-mails, logs, notificações). |

---

## 🚀 Funcionalidades Implementadas

- Cadastro de pedidos via endpoint REST
- Cálculo de frete baseado no tipo de entrega (`expressa`, `econômica`, `transportadora`)
- Integração com transportadora externa simulada
- Notificações automáticas (e-mail, log e notificação) após o processamento de pedidos

---

## 📡 Endpoints Disponíveis

- `POST /pedidos` → Cria e processa um novo pedido
- `GET /pedidos` → Lista todos os pedidos cadastrados

---

## 🧪 Como Executar e Testar

### 1. Executar a aplicação

```bash
mvn spring-boot:run
```

### 2. Enviar uma requisição `POST` para criar um pedido

```http
POST /pedidos
Content-Type: application/json

{
  "cliente": "Maria",
  "produto": "Notebook",
  "peso": 5.0,
  "tipoEntrega": "transportadora"
}
```

### 3. Verificar o console

A aplicação deve exibir logs relacionados ao cálculo de frete, envio de notificações e integração com a transportadora externa.

---

## ✅ Funcionalidades Obrigatórias

- [x] Cadastro de pedidos
- [x] Cálculo de frete com Strategy
- [x] Integração com transportadora externa via Adapter
- [x] Disparo de observadores após processamento (e-mail, log, notificação)
- [x] README explicativo com instruções de uso

---

## 📄 Licença

Uso acadêmico — Projeto desenvolvido para fins educacionais e demonstração prática de padrões de projeto.

---

## 📘 Observações

Este projeto foi idealizado para fins de estudo em arquitetura de software, sendo uma base sólida para sistemas que demandam extensibilidade, integração externa e automação de processos pós-execução.
