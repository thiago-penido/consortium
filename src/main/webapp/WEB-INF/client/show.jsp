<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<div id="wrapper">
    <div id="sidebar-wrapper">
        <%@include file='../template/sidebar.jsp'%>
    </div>
    <div id="page-content-wrapper" class="top">
        <h1>Cliente</h1>
        <table class="table">
            <tr>
                <td disabled="true">Identificador</td>
                <td>${client.getIdClient()}</td>
            </tr>
            <tr>
                <td>Nome</td>
                <td>${client.getName()}</td>
            </tr>
            <tr>
                <td>Nome Social</td>
                <td>${client.getSocialName()}</td>
            </tr>
            <tr>
                <td>Cpf</td>
                <td>${client.getCpf()}</td>
            </tr>
        </table>
    </div>
</div>
</div>

</body>
</html>