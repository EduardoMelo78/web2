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
var turma = [
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

/*var teste = document.querySelector("#disc")
console.log(teste)
teste.textContent = turma.disciplina

var prof = document.querySelector("#prof")
prof.textContent = turma.professor*/


//objeto.adicionarEvento('tipo','função')
const btn = document.querySelector("#carregar")
btn.addEventListener('click', mostrar)

const btnNavegar = document.querySelector("#navegar")
btnNavegar.addEventListener('click', proximo)

function mostrar(){
    document.querySelector("#curso").textContent = turma[0].curso
    document.querySelector("#disc").textContent = turma[0].disciplina
    document.querySelector("#prof").textContent = turma[0].professor
    document.querySelector("#turno").textContent = turma[0].turno
    document.querySelector("#alunos").textContent = turma[0].alunos
}

var cont = 0;
function proximo (){
    document.querySelector("#curso").textContent = turma[cont].curso
    document.querySelector("#disc").textContent = turma[cont].disciplina
    document.querySelector("#prof").textContent = turma[cont].professor
    document.querySelector("#turno").textContent = turma[cont].turno
    document.querySelector("#alunos").textContent = turma[cont].alunos
    cont++
}








function teste(){

    turma.forEach( item => {const prof = item.professor
    alert(prof)})
}