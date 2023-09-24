<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style>
        body {
             font-family: Arial, sans-serif;
             background-color: #f4f4f4;
             display: flex; /* Adiciona um flex container ao corpo */
             justify-content: center; /* Centraliza horizontalmente o conteúdo */
             align-items: center; /* Centraliza verticalmente o conteúdo */
             min-height: 100vh; /* Garante que o formulário ocupe toda a altura da tela */
         }
         h2{
             text-align: left;
         }
         .container {
             width: 50%;
             text-align: center;
             background-color: #fff;
             padding: 20px;
             border-radius: 5px;
             box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
             margin-top: 50px;
         }

         .form-group {
             margin-bottom: 20px;
             width: 98%;
             text-align: left; /* Alinha o texto do rótulo à esquerda */
         }

         label {
             display: block;
             font-weight: bold;
             /* Removemos o alinhamento central aqui para alinhar à esquerda */
             /* text-align: left; */
             margin-bottom: 10px; /* Adiciona espaço entre os rótulos */
         }

         input[type="text"],
         input[type="password"] {
             width: 100%;
             padding: 10px;
             margin-top: 5px;
             margin-bottom: 10px;
             border: 1px solid #ccc;
             border-radius: 3px;
         }

         button {
             padding: 10px 20px;
             background-color: #007bff;
             width: 100%;
             color: #fff;
             border: none;
             cursor: pointer;
             border-radius: 3px;
         }

    </style>
</head>
<body>
    <div class="container">
        <h2>Login</h2>
        <hr>
        <form action="/Hotel/ServletLogin" method="POST">
            <div class="form-group">
                <label for="userName">Usuário:</label>
                <input type="text" id="userName" name="usuario" required>
            </div>
            <div class="form-group">
                <label for="password">Senha:</label>
                <input type="password" id="password" name="senha" required>
            </div>
            <button type="submit">Logar</button>
        </form>
    </div>
</body>
</html>
