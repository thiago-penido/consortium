<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Client</h1>
<ul>

    <li>${client.getIdClient()}</li>
    <li>${client.getName()}</li>
    <li>${client.getCpf()}</li>
    <li>${client.getSocialName()}</li>

</ul>
</body>
</html>