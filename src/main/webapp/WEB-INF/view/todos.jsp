<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Todos for ${name}</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <H1>Add a Todos</H1>
    <form:form action="/add-todos" method="post" commandName="todo">

        <fieldset class="form-group">
        <form:label path="desc">Description</form:label>
        <form:input path="desc" type="text" class="form-control" required="required"></form:input>
        </fieldset>

        <input class ="btn btn-success" type="submit" value="Add"/>
    </form:form>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>