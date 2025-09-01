# Passo a passo para publicar no GitHub (neribarba)

Repositório: **tarefas-api**

## Via site do GitHub
1. Acesse https://github.com/new
2. Repository name: `tarefas-api` (Public)
3. Create repository

No terminal, na pasta do projeto:
```bash
git init
git config user.name "neribarba"
git config user.email "nerilton2010@hotmail.com"

git add .
git commit -m "Projeto: Tarefas API (Spring Boot + JPA + MySQL)"
git branch -M main
git remote add origin https://github.com/neribarba/tarefas-api.git
git push -u origin main
```
Se for solicitado, utilize um **Personal Access Token (classic)** como senha.

Depois, confira: https://github.com/neribarba/tarefas-api
