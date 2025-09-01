# Tarefas API (Spring Boot + MySQL)

API RESTful simples para gerenciamento de tarefas.

## Endpoints

- `POST /api/tarefas` — cria uma tarefa
- `GET /api/tarefas` — lista todas as tarefas
- `GET /api/tarefas/{id}` — busca uma tarefa pelo ID
- `PUT /api/tarefas/{id}` — atualiza uma tarefa existente
- `DELETE /api/tarefas/{id}` — remove uma tarefa

### Exemplo de JSON (criar/atualizar)

```json
{
  "nome": "Desenvolvimento da API",
  "dataEntrega": "2025-12-12",
  "responsavel": "Nerilton_RU4606523"
}
```

> **Observação:** use o formato de data ISO `yyyy-MM-dd` no JSON.

## Como rodar

1. Crie um banco MySQL chamado `tarefasdb` (ou deixe o `createDatabaseIfNotExist=true` criar automaticamente).
2. Ajuste `spring.datasource.username` e `spring.datasource.password` em `application.properties`.
3. Rode a aplicação:

```bash
mvn spring-boot:run
```

A API subirá em `http://localhost:8080`.

## Postman

Importe a coleção em `postman/Tarefas_API.postman_collection.json`.

## GitHub do projeto
https://github.com/neribarba/tarefas-api


## Deploy rápido (Render com Docker + H2)
1. Faça o push do repositório para o GitHub.
2. No Render: **New > Web Service > Connect repo** e selecione este projeto.
3. Render detectará o `Dockerfile`. Em **Environment** adicione `SPRING_PROFILES_ACTIVE=prod` (opcional, já forçado no Dockerfile).
4. Deploy. A URL pública será algo como `https://seu-servico.onrender.com`. Use essa URL no Postman.
