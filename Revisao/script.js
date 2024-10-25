//Variaveis 
var global    //global
let local   //escopo



//Funções
function nome_funcao(a,b){
    return a+b
}

a => {return "teste"}

//Estruturas
for(let i = 0; i<10; i++){
    console.log(i)
}


//Objeto
var turma = {
    curso :"Técnico em Informática",
    disciplina :"projeto",
    professor: "Maine Gomes",
    turno : "matutino",
    alunos : 50
}
console.log(turma)

var teste = document.querySelector("#disc")
console.log(teste)
teste.textContent = turma.disciplina

var prof = document.querySelector("#prof")
prof.textContent = turma.professor


//objeto.adicionarEvento('tipo','função')
const btn = document.querySelector("#carregar")
btn.addEventListener('click', mostrar)

function mostrar(){
    document.querySelector("#curso").textContent = turma.curso
    document.querySelector("#disc").textContent = turma.disciplina
    document.querySelector("#prof").textContent = turma.professor
    document.querySelector("#turno").textContent = turma.turno
    document.querySelector("#alunos").textContent = turma.alunos
}
