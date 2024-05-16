<html>
<head>
<title>Todos for ${name}</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <H1>Add a Todos</H1>
    <form action="/add-todos" method="post">

        <fieldset class="form-group">
        <label>Description</label>
        <input name="desc" type="text" class="form-control" required="requirefd"/>
        </fieldset>

        <input class ="btn btn-success" type="submit" value="Add"/>
    </form>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>