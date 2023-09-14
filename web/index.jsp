<%-- 
    Document   : redirect
    Created on : 7 de set. de 2023, 21:47:44
    Author     : cauan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="./img/iconHome.png">
        <link rel="stylesheet" href="style.css">
        <title>Hotel</title>
        <style>
            body{
                font-family: Arial, sans-serif;
                background-image: url("./img/imgHotel.jpg");
                background-size: cover;
                background-repeat: no-repeat;
                margin: 0;
                padding: 0;
            }            
            header{
                background-color:#1C1C1C;
                color: white;
                height: 50px;
                padding: 10px;
                display: flex;
            }
            form{
                display: flex;
                flex-direction: column;
                padding: 5px;
                justify-items: center;
                text-align: left;
                width: 50%;
                height: 60vh;
                margin: 0 auto;
                background-color: rgba(255, 255, 255, 0.7);
                color:black;
                margin-top: 5%;
                border-radius: 4px;
                border: none;
            }
            input{
                padding: 5px;
                border-radius: 5px;
                border: none;
                background-color: #DCDCDC;
            }
            labe{
                text-align: left;
            }

            button{
                border-radius: 4px;
                border: none;
                justify-items: center;
                width: 100%;
                padding: 10px;
                background: #1C1C1C;
                color: white;
                cursor: pointer;
                border: none;
            }
            .input-name, .input-cpf, .input-data{
                margin-bottom: 10px; /* Adicione espaço entre os elementos com uma margem inferior */
                display:flex;
                flex-direction: column; 
                width: 70%;
                margin: 0 auto;
                padding: 10px;
            }
            .btn-cadastrar{
                padding: 10px;
                margin: 0 auto; 
                width: 70%;
            }    
            li{
                text-decoration: none;
                list-style-type: none;
                color: white;
            }
            h2{
               text-align: center;
            }
            header li a {
                text-decoration: none;
                color: white;
            }
            .home{
                margin-left:4%;
            }
            .cliente{
                margin-left:7%;
            }
            input:focus {
                border-color: blue;
            }
            a{
                margin: 20px;
                text-decoration: none;
                color: white;
            }
           
        </style>
    </head>
    <body>      
        <header>   
           <!-- comment 
                 <li class="home"><a href="#"><image src="./img/iconHome.png">Home</a></li>
                 <li class="cliente"><a href="#"><image src="./img/iconCliente.png">Clientes</a></li>
               -->
               <a href="/Hotel/ServletListarClientes">Ver clientes</a>
               </header>
        <form action="/Hotel/ServletCadastro" method="post">
            <h2>Cadastro de cliente</h2>
            <div class="input-name">
                <label>Nome</label>
                    <input type="text" name="nome">
            </div>
            <div class="input-cpf">
                <label>CPF</label> 
                <input type="text" maxlength="11" name="cpf">  
            </div>
            <div class="input-data">
                <label>Data Nascimento </label>
                    <input type="date" name="data">
            </div>
            <div class="btn-cadastrar"> 
                <button class="btn-envio" type="submit">Cadastrar</button>
            </div>
                
        </form>
    </body>
</html>
