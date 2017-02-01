<%@ page import="com.avepe.models.Client" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cliente</title>
</head>
<body>

<div id="wrapper">
    <div id="sidebar-wrapper">
        <%@include file='../template/sidebar.jsp' %>
    </div>

    <form class="navbar-form navbar-left" role="search" action="/clients" method="get">
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Search for..." id="nameFilter" name="leachByName">
            <span class="input-group-btn">
                <button class="btn btn-default" type="submit">Pesquisar</button>
            </span>
        </div>
        <a href="/clients/new" class="btn btn-success">Novo</a>
    </form>

    <table class="table">
        <c:forEach items="${clients}" var="client">
            <tr>
                <td>${client.getIdClient()}</td>
                <td>${client.getName()}</td>
                <td>${client.getSocialName()}</td>
                <td>${client.getCpf()}</td>
                <td>${client.getFone()}</td>
                <td>${client.getBirthday()}</td>
                <td><a href="/clients/${client.getIdClient()}" class="btn btn-info">Show</a></td>
                <td><a href="/clients/${client.getIdClient()}/edit" class="btn btn-danger">Edit</a></td>
            </tr>
        </c:forEach>
    </table>


</div>
</div>

</body>
</html>