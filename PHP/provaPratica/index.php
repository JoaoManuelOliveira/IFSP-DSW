<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <div class="geral">
        <form action="quiz.php" method="post">
            <div class="formulario">
                <label for="nome" class="nome">Nome:</label>
                <input type="text" name="nome">
                <div class="c1">
                    <h2 class="pergunta">O que é PHP?</h2>
                    <p class="pergunta">Qual é a resposta correta?</p>
                    <label for="a1">A) Uma linguagem de programação</label>
                    <input type="radio" name="p1" value="a1"><br>
                    <label for="a2">B) Um banco de dados</label>
                    <input type="radio" name="p1" value="b1"><br>
                    <label for="a3">C) Um tipo de sapateado</label>
                    <input type="radio" name="p1" value="c1"><br>
                    <label for="a4">D) Um time de futebol</label>
                    <input type="radio" name="p1" value="d1"><br>
                    <label for="a5">E) Um país</label>
                    <input type="radio" name="p1" value="e1"><br>
                </div>


                <div class="c1">
                    <h2 class="pergunta">O que é MySQL?</h2>
                    <p class="pergunta">Qual é a resposta correta?</p>
                    <label for="a1">A) Um carro</label>
                    <input type="radio" name="p2" value="a2"><br>
                    <label for="a2">B) Um banco de dados</label>
                    <input type="radio" name="p2" value="b2"><br>
                    <label for="a3">C) Um produto de limpeza</label>
                    <input type="radio" name="p2" value="c2"><br>
                    <label for="a4">D) Um tipo de guarda-chuva</label>
                    <input type="radio" name="p2" value="d2"><br>
                    <label for="a5">E) Um modelo de avião</label>
                    <input type="radio" name="p2" value="e2"><br>
                </div>


                <div class="c1">
                    <h2 class="pergunta">Para que time o Vladimir torce?</h2>
                    <p class="pergunta">Qual é a resposta correta?</p>
                    <label for="a1">A) Corinthians</label>
                    <input type="radio" name="p3" value="a3"><br>
                    <label for="a2">B) Avai</label>
                    <input type="radio" name="p3" value="b3"><br>
                    <label for="a3">C) Flamengo</label>
                    <input type="radio" name="p3" value="c3"><br>
                    <label for="a4">D) Chapecoense</label>
                    <input type="radio" name="p3" value="d3"><br>
                    <label for="a5">E) PAU FC (da França, pesquisa ai)</label>
                    <input type="radio" name="p3" value="e3"><br>
                </div>

                <div class="botao">
                    <br>
                    <input type="submit" value="Enviar" class="botao">
                </div>
            </div>
        </form>
    </div>
</body>

</html>