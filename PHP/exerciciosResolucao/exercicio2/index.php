<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exercicio 2</title>
    <style>
        body {
            text-align: center;
            justify-content: center;
            align-items: center;
            background-color: gray;
        }
    </style>
</head>

<body>
    <?php
    $alunos = array("Andrews", "Matheus Pietro", "Financeiro", "Vice", "JPC", "Manual", "Boliviano", "Ronaldinho");
    foreach ($alunos as $alunos) {
        echo ("Nome: $alunos<br>");
    }
    ?>
</body>

</html>