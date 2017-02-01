<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cliente</title>
</head>
<body>

<div id="wrapper">
    <div id="sidebar-wrapper">
        <%@include file='../template/sidebar.jsp'%>
    </div>
    <div id="page-content-wrapper" class="top">

        <form action="/clients" method="put">
            <div class="form-group">
                <label for="name">Nome</label>
                <input type="text" class="form-control" id="name" name="name" value="${client.getName()}">
            </div>
            <div class="form-group">
                <label for="nameSocial">Nome</label>
                <input type="text" class="form-control" id="nameSocial" name="nameSocial" value="${client.getSocialName()}">
            </div>
            <div class="form-group">
                <label for="cpf">Cpf</label>
                <input type="cpf" class="form-control" id="cpf" name="cpf" value="${client.getCpf()}">
            </div>
            <div class="form-group">
                <label for="fone">Telefone</label>
                <input type="text" class="form-control" id="fone" name="fone" value="${client.getFone()}">
            </div>
            <%--<div class="form-group">--%>
            <%--<label for="birthday">Data de Nascimento</label>--%>
            <%--<input type="date" class="form-control" id="birthday" name="birthday" value="${client.getBirthday()}">--%>
            <%--</div>--%>
            <button type="submit" class="btn btn-default">Salvar</button>
        </form>
    </div>
</div>
</div>

</body>
</html>