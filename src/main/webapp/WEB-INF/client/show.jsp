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
    <div id="page-content-wrapper">
        Client

        ${client.getIdClient()}
        ${client.getName()}
        ${client.getSocialName()}
        ${client.getCpf()}
    </div>
</div>
</div>

</body>
</html>