<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Apresentar Tabuada</title>
    <link rel="stylesheet" href="styleApresentarTabuada.css">
</head>

<body>
    <h1>Tabuada</h1>

    <div class="tabuada-container">
        <table>
            <thead>
                <tr>
                    <th>Operação</th>
                    <th>Resultado</th>
                </tr>
            </thead>
            <tbody>
                <?php
                if (isset($_POST["n"])) {
                    $numero = (int) $_POST["n"];
                    for ($i = 0; $i <= 10; $i++) {
                        $mult = $numero * $i;
                        echo "<tr>
                                <td>$numero x $i</td>
                                <td>$mult</td>
                              </tr>";
                    }
                } else {
                    echo "<tr><td colspan='2'>Nenhum número informado</td></tr>";
                }
                ?>
            </tbody>
        </table>
    </div>

    <a href="index.php" class="btn">Voltar</a>
</body>

</html>
