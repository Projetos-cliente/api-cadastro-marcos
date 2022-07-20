<h1 align="center"> Api Cadastro</h1> <br>

<p align="center">
  Api Cadastro com foco em validar e gravar regitros no banco de dados;
</p>



## Configurações de ambiente

Versões necessárias para rodar a aplicação

Maven:

```bash
3.6.3
```
Java:

```bash
11
```
Docker:

```
Client version: 20.10.11

Server version: 20.10.11
```




## Build


Para buildar o projeto, dentro da pasta raiz utilize o comando maven:
	
```bash
$ mvn clean install
```
	
Sem rodar os testes
	
```bash
$ mvn clean install -DskipTests
```

## Docker

Para criar as imagens, containers do docker e subir, dentro da pasta raiz  utilize o comando:

```bash
docker-compose up --build --force-recreate
```
	
	
Para derrubar e apagar o container utilize o comando:

```bash
docker-compose down
```

## Documentação dos endpoints - Swagger

Url para acesso a documentação: 

```bash
	http:localhost:8080/swagger-ui.html
```