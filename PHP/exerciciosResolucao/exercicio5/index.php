<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exercicio 5</title>
    <link rel="stylesheet" href="styleIndex.css">
</head>

<body>
    <form action="media.php" method="post">
        <label for="n1">NOTA 1:</label>
        <input type="number" name="nota1" id="nota1" min="0.1" max="10" step="any" required>
        <label for="n1">NOTA 2:</label>
        <input type="number" name="nota2" id="nota2" min="0.1" max="10" step="any" required>
        <input type="submit" value="Calcular Média">

    </form>
</body>

</html>