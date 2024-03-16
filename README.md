# API de Todo

Esta é uma API de Todo construída com Spring Boot. Ela permite que os usuários gerenciem uma lista de tarefas a fazer.

## Funcionalidades

A API suporta as seguintes operações:

- **Criar uma tarefa**: Os usuários podem adicionar uma nova tarefa à lista.
- **Atualizar uma tarefa**: Os usuários podem atualizar o status ou o conteúdo de uma tarefa.
- **Listar todas as tarefas**: Os usuários podem ver todas as tarefas na lista.
- **Excluir uma tarefa**: Os usuários podem remover uma tarefa da lista.

## Documentação da API

A documentação da API é gerada automaticamente usando o Swagger. Você pode acessar a documentação da API em `/swagger-ui.html`.

## Testes

Esta API inclui testes unitários para garantir a qualidade do código e o funcionamento correto das funcionalidades. Os testes foram escritos usando o JUnit e o Mockito.

## Como usar

Para usar a API, faça uma solicitação HTTP para o endpoint apropriado. Aqui estão alguns exemplos:

- **Criar uma tarefa**: Faça uma solicitação POST para `/api/tasks/save` com o corpo da solicitação contendo os detalhes da tarefa.
- **Atualizar uma tarefa**: Faça uma solicitação PUT para `/api/tasks/{id}` com o corpo da solicitação contendo os novos detalhes da tarefa.
- **Listar todas as tarefas**: Faça uma solicitação GET para `/api/tasks`.
- **Excluir uma tarefa**: Faça uma solicitação DELETE para `/api/tasks/{id}`.

## Contribuindo

Se você quiser contribuir para este projeto, por favor, faça um fork do repositório e envie um pull request.

## Licença

Este projeto está licenciado sob a licença MIT.
