<?php
session_start();

// Se o formulário foi enviado, adiciona produto à sessão
if (isset($_POST['nome'], $_POST['preco'], $_POST['estoque'])) {
    $novoProduto = [
        $_POST['nome'],
        (float)$_POST['preco'],
        (int)$_POST['estoque']
    ];

    $_SESSION['produtos'][] = $novoProduto;

    // Redireciona de volta para a tabela
    header("Location: index.php");
    exit();
}
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Adicionar Produto</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h2 class="titulo">Adicionar Produto</h2>

    <form action="" method="post">
    <label>Nome:</label>
    <input type="text" name="nome" required><br><br>

    <label>Preço (R$):</label>
    <input type="number" name="preco" min="0.01" step="0.01" required><br><br>

    <label>Quantidade:</label>
    <input type="number" name="estoque" min="1" required><br><br>

    <input type="submit" value="Adicionar">
</form>

    <br>
    <a href="index.php" class="btn">Voltar</a>
</body>
</html>
