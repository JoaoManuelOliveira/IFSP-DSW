<?php
session_start();

// Lista inicial de produtos, caso não exista
if (!isset($_SESSION['produtos'])) {
    $_SESSION['produtos'] = [
        ["Arroz", 20.50, 3],
        ["Feijão", 10.99, 2],
        ["Óleo", 8.83, 3],
        ["Detergente", 3.00, 8]
    ];
}

// Remover produto se índice passado
if (isset($_GET['remover'])) {
    $indice = (int)$_GET['remover'];
    if (isset($_SESSION['produtos'][$indice])) {
        unset($_SESSION['produtos'][$indice]);
        $_SESSION['produtos'] = array_values($_SESSION['produtos']); // Reindexa
    }
    header("Location: index.php");
    exit();
}
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Produtos</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h2 class="titulo">Produtos</h2>

    <table>
        <thead>
            <tr>
                <th>Nome</th>
                <th>Preço (R$)</th>
                <th>Quantidade</th>
                <th>Total (R$)</th>
                <th>Ações</th>
            </tr>
        </thead>
        <tbody>
            <?php
            $totalCompra = 0;

            foreach ($_SESSION['produtos'] as $indice => $produto) {
                $totalProduto = $produto[1] * $produto[2]; // preço × quantidade
                $totalCompra += $totalProduto;

                echo "<tr>
                        <td>{$produto[0]}</td>
                        <td>{$produto[1]}</td>
                        <td>{$produto[2]}</td>
                        <td>" . number_format($totalProduto, 2, ',', '.') . "</td>
                        <td>
                            <a href='index.php?remover=$indice' class='btn-remover'>🗑️</a>
                        </td>
                      </tr>";
            }
            ?>
        </tbody>
        <tfoot>
            <tr>
                <td colspan="3" style="text-align:right; font-weight:bold;">Total da compra:</td>
                <td colspan="2" style="font-weight:bold;"><?php echo "R$ " . number_format($totalCompra, 2, ',', '.'); ?></td>
            </tr>
        </tfoot>
    </table>

    <a href="adicionarProduto.php" class="btn">Adicionar Produto</a>
</body>
</html>
