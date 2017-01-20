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

        <form action="/clients" method="post">
            <div class="form-group">
                <label for="name">Nome</label>
                <input type="text" class="form-control" id="name" name="name">
            </div>
            <div class="form-group">
                <label for="cpf">Cpf</label>
                <input type="cpf" class="form-control" id="cpf" name="cpf">
            </div>
            <button type="submit" class="btn btn-default">Salvar</button>
        </form>
    </div>
</div>




</div>

</body>
</html>