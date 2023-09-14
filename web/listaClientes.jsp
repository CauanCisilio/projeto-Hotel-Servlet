<%-- 
    Document   : resposta
    Created on : 8 de set. de 2023, 12:20:40
    Author     : cauan
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cadastro - Cliente</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            display: flex;
            flex-direction: column;
            align-items: center; /* Centraliza horizontalmente */
            justify-content: center; /* Centraliza verticalmente */
            height: 100vh; /* Faz a página ocupar 100% da altura da viewport */
        }
        header {
            background-color: black;
            color: white;
            text-align: center;
            padding: 20px;
            width: 100%;
            position: fixed; /* Fixa o header no topo da página */
            top: 0; /* Define a posição inicial no topo */
            z-index: 1; /* Coloca o header acima do conteúdo */
        }
        header h1 {
            margin: 0;
            padding: 0;
            font-size: 36px;
        }
        .container {
            max-height: 70vh; /* Altura máxima da div container */
        }
        table {
            width: 95%; /* Aumentei a largura da tabela */
            /*border-collapse: collapse;*/
            border-radius: 20px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
            overflow-y: auto; /* Adiciona barra de rolagem vertical quando necessário */
        }
        table th, table td {
            padding: 10px;
            text-align: center;
        }
        table th {
            background-color: #3498db;
            color: white;
            border-radius: 5px 5px 0 0;
        }
        
        table tr:nth-child(even) {
            background-color: #blak
        }
        table tr:hover {
            background-color: #e0e0e0;
        }
        form {
            margin-bottom: 20px;
            display: flex;
            flex-direction: row;
            align-items: center;
        }
        .container-busca {
            width: 60%; /* Ajustei a largura do input */
            padding: 10px; /* Adicionei um espaçamento interno no input */
            border: 1px solid #ccc; /* Adicionei uma borda ao input */
            border-radius: 20px 0 0 20px; /* Borda arredondada no canto esquerdo */
            outline: none; /* Removi a borda de foco */
            margin-right: 10px; /* Espaçamento entre o input e o botão */
        }
        .btn-buscar {
            width: 60px; /* Defini o mesmo tamanho do input */
            padding: 10px; /* Adicionei espaçamento interno ao botão */
            background-color: #3498db;
            color: white;
            border: none;
            border-radius: 0 20px 20px 0; /* Borda arredondada no canto direito */
            cursor: pointer;
            transition: background-color 0.3s;
        }
        .btn-buscar:hover {
            background-color: #2980b9;
        }
        .btn-edita{
            text-decoration: none;
            color: white;
            background-color: black;
            padding: 8px;
            border-radius: 4px;
        }
        .btn-deleta{
            text-decoration: none;
            color: white;
            background-color: #8B0000;
            padding: 8px;
            border-radius: 4px;
        }
    </style>
</head>
<body>
    <header>
        <h1>Lista de Clientes</h1>
    </header>
    <div class="container">
        <form action="/Hotel/ServletListarClientes" method="POST">
            <input type="text" class="container-busca" name="nomeBusca" placeholder="Digite o nome">
            <button type="submit" class="btn-buscar">Buscar</button>
        </form>
        <table>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>CPF</th>
            </tr>
            <c:forEach items="${clientes}" var="cliente">
                <tr>
                    <td><c:out value="${cliente.id}" /></td> 
                    <td><c:out value="${cliente.nome}" /></td> 
                    <td><c:out value="${cliente.cpf}" /></td>
                    <td><a class="btn-edita" href="editaCliente.jsp">Editar</a></td>
                    <td><a class="btn-deleta" href="/ServletDeleta">Deletar</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
