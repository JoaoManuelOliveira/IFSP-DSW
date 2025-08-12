<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Apresentacao</title>
    <link rel="stylesheet" href="styleApresentacao.css">
</head>

<body>
</body>

</html>

<?php
//floatval() converte para um numero real
$nota1 = floatval($_GET["nota1"]);
$nota2 = floatval($_GET["nota2"]);
$nota3 = floatval($_GET["nota3"]);
$frequencia = floatval($_GET["frequencia"]);

$media = ($nota1 + $nota2 + $nota3) / 3.0;

// Verifica se notaExame existe e se é numérica
//isset() é uma função que serve para verificar se uma variável está definida e não é nula.
if (isset($_GET["notaExame"]) && $_GET["notaExame"] !== "") {
    $notaExame = floatval($_GET["notaExame"]);
} else {
    $notaExame = null;
}
echo ('<div class="resultado">');
echo ("Situação Final");
echo ('</br>');
echo ("Nota 1: $nota1");
echo ('</br>');
echo ("Nota 2: $nota2");
echo ('</br>');
echo ("Nota 3: $nota3");
echo ('</br>');
echo ("Média Parcial: $media");
echo ('</br>');
echo ("Frequência: $frequencia%");
echo ('</br>');

if ($frequencia < 75.0) {
    echo "Reprovado por falta";
    echo ('</br>');
} else {
    if ($media >= 7.0) {
        echo "Aprovado!";
        echo ('</br>');
    } elseif ($media < 4.0) {
        echo "Reprovado!";
        echo ('</br>');
    } elseif ($notaExame === null) {
        echo "Necessita exame";
        echo ('</br>');
    } else {
        $mediaFinal = ($media + $notaExame) / 2.0;
        echo ("Média Final: $mediaFinal");
        echo ('</br>');
        echo ("Nota do Exame final: $notaExame");
        echo ('</br>');
        if ($mediaFinal >= 5) {
            echo "Aprovado por exame";
            echo ('</br>');
        } else {
            echo "Reprovado no exame";
            echo ('</br>');
        }
    }
}

echo ('</div>');
?>