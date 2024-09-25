# Simple Login App

Este é um projeto Java simples de uma aplicação de login com tela gráfica, conectada a um banco de dados MySQL para validação de usuários.

## Tecnologias Utilizadas
- **Java**: Para desenvolver a aplicação.
- **Swing**: Para criar a interface gráfica.
- **MySQL**: Para armazenar as informações dos usuários.
- **Maven**: Gerenciador de dependências.
- **GitHub**: Para versionamento de código.
- **Railway**: Para hospedar o banco de dados MySQL remotamente.

## Funcionalidades
- Tela de login com validação de credenciais.
- Conexão a banco de dados MySQL para verificação dos usuários.
- Fácil configuração e implementação.

## Pré-requisitos
Antes de rodar a aplicação, certifique-se de ter os seguintes softwares instalados:
- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [MySQL](https://dev.mysql.com/downloads/installer/)
- [Maven](https://maven.apache.org/download.cgi)

## Configuração do Banco de Dados

Crie um banco de dados MySQL local ou remoto com o nome `login_app` e a seguinte tabela:

```sql
CREATE DATABASE login_app;
USE login_app;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
);

