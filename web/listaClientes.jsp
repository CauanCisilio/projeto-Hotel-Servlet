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
            body{
                margin: 0 auto;
                padding: 0px;
                font-family: Arial, sans-serif;
            }
            table{
                margin: 0 auto;
                margin-top: 5%;
                padding: 10px;
                width: 25vw;
                border: 1px solid black;   
                text-align: center;
                border-radius: 3 px;
                padding: 0px;
            }
            td{
               border-radius: 3 px;
            }
            .column{
               
                background-color: blue; 
                color: white;
                
            }
        </style>
    </head>
    <body>
        <table>
            <tr class="column">
                <td>ID</td>
                <td>Nome</td>
                <td>CPF</td>
            </tr>
            <c:forEach items="${clientes}" var="cliente">
                <tr>
                    <td><c:out value="${cliente.id}" /></td> 
                    <td><c:out value="${cliente.nome}" /></td> 
                    <td><c:out value="${cliente.cpf}" /></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
