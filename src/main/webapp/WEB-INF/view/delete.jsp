<html>
<head>
<title>Todos for ${name}</title>
</head>
<body>
    <H1>Delete a Todos</H1>
    <form action="/delete-todos" method="post">
        <input name="id" type="number" min="1" max="10"/>
        <input type="submit" value="Delete"/>
    </form>
</body>
</html>