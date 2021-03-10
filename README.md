###Contexto:

Você está fazendo uma API REST que precisará controlar a aplicação de vacinas entre a população brasileira. O primeiro passo deve ser a construção de um cadastro de usuários, sendo obrigatórios dados como: nome, e-mail, CPF e data de nascimento, onde e-mail e CPF devem ser únicos.

O segundo passo é criar um cadastro de aplicação de vacinas, sendo obrigatórios dados como: nome da vacina, e-mail do usuário e a data que foi realizada a vacina.

Você deve construir apenas dois endpoints neste sistema, o cadastro do usuário e o cadastro da aplicação da vacina. Caso os cadastros estejam corretos, é necessário voltar o Status 201, caso hajam erros de preenchimento de dados, o Status deve ser 400.

###API
- `/usuario/`: Ponto de entrada para cadastro de usuário (POST).
```json
{
	"name":"José",
	"email":"jose@email.com",
	"cpf":"123.456.789-10",
	"dataNascimento":"1980-01-01"
}
```
- `/vacina/`: Ponto de entrada para cadastro de aplicações de vacinas (POST).
```json
{
	"name":"CoronaVac",
	"email":"jose@email.com",
	"dataVacina":"2021-03-09"
}
```

###IDE
Para o desenvolvimento do projeto foi utilizado e recomenda-se IDE Eclipse, utilizando Java 8.

#####Instalação 
1. Clone o repositório utilizando `git clone https://github.com/endrew166/api-rest-orange-talents.git` 
2. Importe o projeto Maven no Eclipse.
3. Execute o programa pela main da classe `CadastroAplication.java`

###Spring Dependencies
- H2 Database.
- Spring Web.
- Spring Boot DevTools.
- Spring Data JPA.
- Validation.

###Testes
Para execução de testes recomenda-se a ferramenta [Insomnia](https://insomnia.rest/ "Insomnia"). A API trabalha com o método POST é corpo em JSON, como exemplificado na seção API. 
