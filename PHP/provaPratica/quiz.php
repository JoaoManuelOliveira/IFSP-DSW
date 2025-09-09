<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quiz</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <div class="resultado">
        <?php
        if ($_SERVER['REQUEST_METHOD'] === 'POST') {
            $nome = $_POST['nome'];
            $resposta1 = $_POST['p1'];
            $resposta2 = $_POST['p2'];
            $resposta3 = $_POST['p3'];
        }

        $cont = 0;
        if ($resposta1 == "a1")
            $cont += 1;
        if ($resposta2 == "b2")
            $cont += 1;
        if ($resposta3 == "c3")
            $cont += 1;

        echo "<h1>$nome, você fez $cont acerto(s)!</h1>";

        if ($cont === 0) {
            echo "<p>Não desanime, continue estudando!</p>";
        } else if ($cont === 1) {
            echo "<p>Você acertou pouco, mas está no caminho.</p>";
        } else if ($cont === 2) {
            echo "<p>Muito bem, quase perfeito!</p>";
        } else {
            echo "<p>Parabéns! Você acertou tudo!</p>";
        }

        echo '<a href="index.php">Voltar ao Quiz</a>';
        ?>
    </div>
</body>


</html>