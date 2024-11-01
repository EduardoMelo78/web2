var turma = []

fetch('https://viacep.com.br/ws/48603004/json/')
.then( response => response.json())
.then( data => patati(data))
.catch( erro => console.error("Deu ruim aqui...", erro))


    function patati(cep){

        const tabela = document.querySelector('#tabela-turma')
        
//turma.map(item => {

        
    tabela.innerHTML += `
        <tr>
        <td>${cep['logradouro']}</td>
        <td>${cep.bairro}</td>
        <td>${cep.localidade}</td>
        </tr>`
//})
    }




  