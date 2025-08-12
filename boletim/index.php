<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Boletim</title>
    <link rel="stylesheet" href="styleIndex.css">
</head>

<body>
    <h1>Boletim</h1>
    <h2>Preencha os dados do aluno:</h2>
    <form action="apresentarMedia.php" method="get">
        <label for="nota1" id="nota1">Nota 1:</label>
        <input type="number" max="10" min="0" name="nota1" required>

        <label for="nota1" id="nota1">Nota 2:</label>
        <input type="number" max="10" min="0" name="nota2" required>

        <label for="nota1" id="nota1">Nota 3:</label>
        <input type="number" max="10" min="0" name="nota3" required>

        <label for="nota1" id="nota1">Frequência em %:</label>
        <input type="number" min="0" max="100" name="frequencia" required>

        <label for="notaExame" id="notaExame">Nota do Exame:</label>
        <input type="number" max="10" min="0" name="notaExame">

        <br>
        <input type="submit" value="Enviar">


    </form>
</body>

</html>