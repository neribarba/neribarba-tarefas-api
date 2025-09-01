# Exemplos de respostas (para comparação)

## POST /api/tarefas
Status: 201 Created
Body (exemplo):
{
  "id": 1,
  "nome": "Desenvolvimento da API",
  "dataEntrega": "2025-12-12",
  "responsavel": "Nerilton_RU4606523"
}

## GET /api/tarefas
Status: 200 OK
Body (exemplo):
[
  {
    "id": 1,
    "nome": "Desenvolvimento da API",
    "dataEntrega": "2025-12-12",
    "responsavel": "Nerilton_RU4606523"
  },
  {
    "id": 2,
    "nome": "Revisão de requisitos",
    "dataEntrega": "2025-11-30",
    "responsavel": "Nerilton_RU4606523"
  }
]

## PUT /api/tarefas/1
Status: 200 OK
Body (exemplo):
{
  "id": 1,
  "nome": "Desenvolvimento da API - Atualizado",
  "dataEntrega": "2025-12-12",
  "responsavel": "Nerilton_RU4606523"
}

## DELETE /api/tarefas/1
Status: 204 No Content
