<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Todos for ${name}</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
    <div class="container">
    <H1>Hi ${name} your todos are</H1> </br>

    </br>

    <table class="table table-striped">
        <thead>
            <tr>
                <th>id</th>
                <th>user</th>
                <th>desc</th>
                <th>targetDate</th>
                <th>isDone</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach items="${todos}" var="todo">
                  <tr>
                    <td>${todo.id}</td>
                    <td>${todo.user}</td>
                    <td>${todo.desc}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                  </tr>
            </c:forEach>
        </tbody>

    </table>


<div>
<a class="btn btn-success" href="/add-todos">Add</a>
<a class="btn btn-success" href="/delete-todos">Delete</a>
</div>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</div>
</body>
</html>

