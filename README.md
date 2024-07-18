
# API Blog GraphQL

GraphQL é uma linguagem de consulta criada pelo Facebook em 2012 e lançada publicamente em 2015. É considerada uma alternativa para arquiteturas REST. O GraphQL é executado por Query e Mutation, onde query é toda consulta realizada e mutation é toda alteração realizada.


## Stack utilizada

**Back-end:** Sprinb Boot 3.3.1, OpenJDK-17, GraphQL \
**Dependências** spring-web, spring-graphql


## Documentação da API

#### Acesso a ferramenta web GraphiQL

```
  http://localhost:8080/graphiql
```

#### Criando um post

```
  mutation CreatePost {
    createPost(content: "Primeiro post") {
        id
        content
    }
}
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `content` | `string` | **Obrigatório**. Conteúdo do post |

#### Comentando um post

```
  mutation CreateComment {
    createComment(content: "Primeiro comentário", postId: "d29f48bb-192d-4b81-aa68-034747d243a6") {
        content
        id
        postId
    }
}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `content`      | `string` | **Obrigatório**. Comentário |
| `postId`      | `string` | **Obrigatório**. O ID relacionado ao post |


#### Consultando um post

```
query postById {
  postById(id: "d29f48bb-192d-4b81-aa68-034747d243a6") {
    content
    id
    comments {
      content
      id
      postId
    }
  }
}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `postId`      | `string` | **Obrigatório**. O ID relacionado ao post |

## Screenshots

1.Criando um post (mutation)
![Create Post](https://private-user-images.githubusercontent.com/14126452/349979210-18a6f353-4a14-46ff-9520-066dc8ad6846.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjEzMTAxMDMsIm5iZiI6MTcyMTMwOTgwMywicGF0aCI6Ii8xNDEyNjQ1Mi8zNDk5NzkyMTAtMThhNmYzNTMtNGExNC00NmZmLTk1MjAtMDY2ZGM4YWQ2ODQ2LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA3MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNzE4VDEzMzY0M1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTVjNTk2YmE3NTA4YTFkNDU4MDRjNDE1MzhhNzUwZTUxNzhjMjg0NzRhZmYyMjgzYTQzMjM3NmIyMzRlMDBlZDkmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.WGP6R0lMzs3irO7sFThlo6RIlRg23y4xrcjTJN8PD5s)



2.Criando comentários relacionados a um post (mutation)
![Create Comment](https://private-user-images.githubusercontent.com/14126452/349979677-97bed1dc-ce04-4814-ac50-8c50ccc14ab4.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjEzMTAxMDMsIm5iZiI6MTcyMTMwOTgwMywicGF0aCI6Ii8xNDEyNjQ1Mi8zNDk5Nzk2NzctOTdiZWQxZGMtY2UwNC00ODE0LWFjNTAtOGM1MGNjYzE0YWI0LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA3MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNzE4VDEzMzY0M1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTZmNjM2YTI3OTNkZmUyMDhhM2FlZDE0MmFlNDE4NzZhM2Q3Y2E2ZmUwZjE0YTAyMzU4Y2VlYTI3YWJiNzgzZjImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.rss0NCfmzQM8QsJK1FS1Rg7-1Wz7yyKdiFy1IBowsB8)



3.Consultando um post pelo id (query)
![PostById](https://private-user-images.githubusercontent.com/14126452/349980137-96bac470-98d3-4e05-b36f-4a25100625eb.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjEzMTAxMDMsIm5iZiI6MTcyMTMwOTgwMywicGF0aCI6Ii8xNDEyNjQ1Mi8zNDk5ODAxMzctOTZiYWM0NzAtOThkMy00ZTA1LWIzNmYtNGEyNTEwMDYyNWViLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA3MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNzE4VDEzMzY0M1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTgwOWQwNDZkYWNiOWYzYmVjM2U1OTVlNGQxMTA3N2MwODUwZDgwZmUzMzA1ZjgwMDExNmFjOGM3MzU4OGQ4NWQmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.FUdgT9rlKMQEiUW9sZfviFzNSBtnGYLjRydUG9kd-a4)