<?php
$nota1 = $_POST["nota1"];
$nota2 = $_POST["nota2"];
$media = ($nota1 + $nota2) / 2;

if ($media >= 6) {
    $resultado = "Aprovado!";
    $classe = "aprovado"; // classe para CSS verde
} else {
    $resultado = "Reprovado.";
    $classe = "reprovado"; // classe para CSS vermelho
}
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Média</title>
    <link rel="stylesheet" href="styleMedia.css">
</head>
<body>
    <h1 class="<?php echo $classe; ?>">Resultado da Média</h1>
    <p class="<?php echo $classe; ?>"><?php echo $resultado; ?> (Média: <?php echo number_format($media, 2); ?>)</p>
    <a href="index.php" class="btn">Voltar</a>
</body>
</html>
