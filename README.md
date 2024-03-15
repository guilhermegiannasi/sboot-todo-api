# API de Todo

Esta é uma API de Todo construída com Spring Boot. Ela permite que os usuários gerenciem uma lista de tarefas a fazer.

## Desenvolvimento em Andamento

A documentação da API no Swagger está atualmente em desenvolvimento. Estamos trabalhando para fornecer uma documentação completa e fácil de usar para todos os endpoints da API.

## Funcionalidades

A API suporta as seguintes operações:

- **Criar uma tarefa**: Os usuários podem adicionar uma nova tarefa à lista.
- **Listar todas as tarefas**: Os usuários podem ver todas as tarefas na lista.
- **Excluir uma tarefa**: Os usuários podem remover uma tarefa da lista.

## Como usar

Para usar a API, faça uma solicitação HTTP para o endpoint apropriado. Aqui estão alguns exemplos:

- **Criar uma tarefa**: Faça uma solicitação POST para `/api/tasks/save` com o corpo da solicitação contendo os detalhes da tarefa.
- **Listar todas as tarefas**: Faça uma solicitação GET para `/api/tasks`.
- **Excluir uma tarefa**: Faça uma solicitação DELETE para `/api/tasks/{id}`.

## Contribuindo

Se você quiser contribuir para este projeto, por favor, faça um fork do repositório e envie um pull request.

## Licença

Este projeto está licenciado sob a licença MIT.
