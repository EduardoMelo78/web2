turma = [
    {
    curso :"Técnico em eletro",
    disciplina :"projeto",
    professor: "Jurema Gomes",
    turno : "vespertino",
    alunos : 50
    },

    {
        curso :"Técnico em biocombustiveis",
        disciplina :"Alimentação",
        professor: "Gecilma Gomes",
        turno : "matutino",
        alunos : 70
        },
  {
            curso :"Técnico em nutrição",
            disciplina :"Alimentação de bovinos",
            professor: "Maine Melo",
            turno : "diurno",
            alunos : 10
            },
    ]

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




  