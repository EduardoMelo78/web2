var turma = []

fetch('URL')
.then()
.then()
.catch( erro => )

    console.log(turma)

    const tabela = document.querySelector("#tabela-turma")

turma.map(item => {
    tabela.innerHTML += `
        <tr>
        <td>${item.disciplina}</td>
        <td>${item.professor}</td>
        <td>${item.alunos}</td>
    </tr>
    `
})




  