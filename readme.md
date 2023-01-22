# Projeto #01 - API Tweteroo com Java Spring

# Descrição

Seu primeiro projeto Spring será a construção da API do conhecido **Tweteroo**, um clone do Twitter, que foi implementado no módulo de back-end

![Untitled](https://mlabs-wordpress-site.s3.amazonaws.com/wp-content/uploads/2020/09/novidades-do-twitter-header.jpg)


[tweteroo-front-api-spring.zip](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6bfd86bf-0f79-4c81-93ba-25c9fc2be3a7/tweteroo-front-api-spring.zip)


# Requisitos

- Geral
    - [ ]  A porta utilizada pelo seu servidor deve ser a 8080 (Porta padrão do Spring)
    - [ ]  Versionamento usando Git é obrigatório, crie um **repositório público** no seu perfil do GitHub
    - [ ]  Faça commits a cada funcionalidade implementada
- Armazenamento de dados
    - [ ]  Para persistir os dados (usuários e tweets), utilize variáveis globais em memória
    - [ ]  O formato de um **usuário** deve ser:
        
        ```jsx
        {
        	username: 'bobesponja', 
        	avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info" 
        }
        ```
        
    - [ ]  O formato de um **tweet** deve ser:
        
        ```jsx
        {
        	username: "bobesponja",
        	avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info", 
          text: "eu amo o hub"
        }
        ```
        
- **POST** `/sign-up`
    - [ ]  Deve receber (pelo body da request), um parâmetro **username** e um **avatar**, contendo o nome do username do usuário e a sua foto de avatar:
        
        ```jsx
        {
            username: "bobesponja",
        		avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info"
        }
        ```
        
    - [ ]  Por fim, retornar a mensagem `“OK”`
- **POST** `/tweets`
    - [ ]  Deve receber (pelo body da request), os parâmetros `username` e `tweet`:
        
        ```jsx
        {
        	username: "bobesponja",
          tweet: "eu amo o hub"
        }
        ```
        
    - [ ]  Salvar esse tweet num array de tweets do servidor
    - [ ]  Por fim, retornar a mensagem `“OK”`
- **GET** `/tweets` com paginação
    - [ ]  Retornar os 5 últimos tweets publicados
    - [ ]  Esse endpoint deverá receber a página identificada via query string (`?page=1`).
    - [ ]  Deve retornar corretamente os tweets da “página” (`page`) atual, esse endpoint também será chamado ao clicar no botão “**Carregar mais**” (isso já foi feito no front-end). A primeira página corresponde aos últimos 5 tweets, a segunda do 6 ao 10, a terceira do 11 ao 15, etc…
        
        ```jsx
        [
        	{
        		username: "bobesponja",
        		avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info",
        		tweet: "eu amo o hub"
        	}
        ]
        ```
        
- **GET** `/tweets/USERNAME`
    - [ ]  Retornar todos os tweets publicados do usuario recebido por parâmetro de rota
        
        ```jsx
        [
        	{
        		username: "bobesponja",
        		avatar: "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info",
        	  tweet: "eu amo o hub"
        	}
        ]
        ```