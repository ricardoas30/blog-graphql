
# API Blog GraphQL

GraphQL é uma linguagem de consulta criada pelo Facebook em 2012 e lançada publicamente em 2015. É considerada uma alternativa para arquiteturas REST. O GraphQL é executado por Query e Mutation, onde query é toda consulta realizada e mutation é toda alteração realizada.


## Stack utilizada

**Back-end:** Sprinb Boot 3.3.1, OpenJDK-17, GraphQL \
**Dependências** spring-web, spring-graphql


## Documentação da API

#### Criando um post

```http
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

```http
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

```http
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
![Create Post](https://private-user-images.githubusercontent.com/14126452/346706784-20846b13-cc40-4862-90ac-f0d11b5f6707.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjA0Njg3MjYsIm5iZiI6MTcyMDQ2ODQyNiwicGF0aCI6Ii8xNDEyNjQ1Mi8zNDY3MDY3ODQtMjA4NDZiMTMtY2M0MC00ODYyLTkwYWMtZjBkMTFiNWY2NzA3LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA3MDglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNzA4VDE5NTM0NlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTRlYWY5Y2Y3MjMyOWM5NTQ1NTRiMzk4MzQ0MDA5NWU5MGU3NjA5ZGIzYjNkNDA2MDViMGRiZDYwZDkyNDZjZTEmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.hdg-zrigkmFoReYvUNOcpCSFLhFGae5W-HzP5Py0KYQ)



2.Criando comentários relacionados a um post (mutation)
![Create Comment](https://private-user-images.githubusercontent.com/14126452/346706807-3337a922-bcc4-450a-bab6-07adb5a726a4.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjA0Njg3MjYsIm5iZiI6MTcyMDQ2ODQyNiwicGF0aCI6Ii8xNDEyNjQ1Mi8zNDY3MDY4MDctMzMzN2E5MjItYmNjNC00NTBhLWJhYjYtMDdhZGI1YTcyNmE0LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA3MDglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNzA4VDE5NTM0NlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTdmYTAwMTM3MjBmOWNjNjJkZjI3ZjdjNjFkYTU0M2EzMmJlYzY1YjA4MjA1OGFmZDI1ZTcxMTU0NDFhMDZmMzQmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.47CMQ9V4a9BiMk8aBJYS4-pOdWAxg8cQghI3hVFD8ps)



3.Consultando um post pelo id (query)
![PostById](https://private-user-images.githubusercontent.com/14126452/346706820-873e4687-37c1-43b5-84c4-1d0090caa5e1.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjA0Njg3MjYsIm5iZiI6MTcyMDQ2ODQyNiwicGF0aCI6Ii8xNDEyNjQ1Mi8zNDY3MDY4MjAtODczZTQ2ODctMzdjMS00M2I1LTg0YzQtMWQwMDkwY2FhNWUxLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA3MDglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNzA4VDE5NTM0NlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPThjOGUxYWQ5M2Q1Y2U5MWJiMGUyODMxMWE0NWMyM2RiYjhlOTc5MmZlZTBiNTY5ODBkMWYzOTk1MjUwMGViNjkmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.9BJttL3kDwkPxi3FX5R0fVktvIKalJ7JufIeZKzNAtA)