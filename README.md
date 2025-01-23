# 📝 TODO List

Bem-vindo ao **TODO List**, uma API simples, elegante e poderosa para gerenciar suas tarefas como um verdadeiro(a) profissional! 🚀

Este projeto foi criado com base na aula do canal da @giulianabezerra, como parte de um estudo prático para consolidar conhecimentos em desenvolvimento backend. Ele também atende aos requisitos [deste desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para desenvolvedores(as) backend júnior, permitindo aplicar conceitos aprendidos e se preparar para oportunidades incríveis na Simplify. ✨✨

---

## 🛠 Tecnologias Utilizadas

Este projeto é movido pelas seguintes tecnologias e ferramentas de ponta:

- 🌱 **[Spring Boot](https://spring.io/projects/spring-boot)**: O coração da aplicação.
- 🌐 **[Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)**: Para criar APIs REST de forma rápida e robusta.
- 🗃️ **[Spring Data JPA](https://spring.io/projects/spring-data-jpa)**: Consultas ao banco de dados com zero complicação.
- 📖 **[SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)**: Geração automática de documentação (Swagger).
- 🐬 **[MySQL](https://dev.mysql.com/downloads/)**: Onde as tarefas descansam (mas só até serem completadas 😉).

---

## 🚀 Práticas Adotadas

Para garantir qualidade e simplicidade, seguimos as melhores práticas do mercado:

- **Princípios:** SOLID, DRY, YAGNI, KISS 🧠
- **API REST:** Limpa, organizada e fácil de usar.
- **Consultas:** Utilizando a mágica do Spring Data JPA.
- **Injeção de Dependências:** Porque ninguém gosta de acoplamento!
- **Tratamento de Erros:** Respostas amigáveis até nos piores momentos. 💔
- **Swagger:** Documentação automática com OpenAPI 3.

---

## 📦 Como Executar

Chegou a hora de colocar essa belezura para rodar! 😎

1. **Clone o repositório:**
```
$ git clone <url-do-repositorio>
```

Construa o projeto:

```
$ ./mvnw clean package
```

Execute a aplicação:

```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

🎉 Acesse a API:

http://localhost:8080
Documentação Swagger: http://localhost:8080/swagger-ui.html
🔗 API Endpoints
Aqui está um guia rápido para brincar com a API. Para facilitar, usamos o httpie. Escolha sua tarefa e divirta-se!

1️⃣ Criar Tarefa

```
$ http POST :8080/todos nome="Tarefa 1" descricao="Minha primeira tarefa" prioridade=1
```

Resposta:

```
{
  "id": 1,
  "nome": "Tarefa 1",
  "descricao": "Minha primeira tarefa",
  "prioridade": 1,
  "realizado": false
}
```

2️⃣ Listar Tarefas

```
$ http GET :8080/todos
```

Resposta:

```
[
  {
    "id": 1,
    "nome": "Tarefa 1",
    "descricao": "Minha primeira tarefa",
    "prioridade": 1,
    "realizado": false
  }
]
```

3️⃣ Atualizar Tarefa
```
$ http PUT :8080/todos/1 nome="Tarefa Atualizada" descricao="Agora com mais detalhes" prioridade=2
```

Resposta:

```
{
  "id": 1,
  "nome": "Tarefa Atualizada",
  "descricao": "Agora com mais detalhes",
  "prioridade": 2,
  "realizado": false
}
```

4️⃣ Remover Tarefa
```
$ http DELETE :8080/todos/1
```

Resposta:
```
[]
```

💡 Contribuindo
Sinta-se à vontade para abrir issues ou enviar pull requests. Vamos construir algo incrível juntos! 🌟

📜 Licença
Este projeto está sob a licença MIT. Fique à vontade para usar, modificar e compartilhar!

🎉 Divirta-se!
Gerenciar tarefas nunca foi tão divertido. Bora colocar ordem na bagunça e arrasar na organização! 🏆
