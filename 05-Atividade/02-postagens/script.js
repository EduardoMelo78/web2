

document.querySelector("#formPost").addEventListener('submit', cadastrar)

function cadastrar(event){
    event.preventDefault();

    const form = new FormData(event.target);

    objeto = {
        userId : 1,
        title : form.get('titulo'),
        body: form.get('textoPostagem')

    }

    fetch('https://jsonplaceholder.typicode.com/posts',
    {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(objeto)
    })
    .then(response => {
        console.log('Resposta do servidor:', response);
        if(response.ok)
            mostrar()
    })
    .catch( erro => console.error("Deu ruim aqui..", erro))
}



function mostrar(){
    fetch('https://jsonplaceholder.typicode.com/posts')
    .then( response => response.json())
    .then( postagem => {
        const resposta = document.querySelector("#resposta")
        div.innerHTML = ''
        
        postagem.map( post => {
            resposta.innerHTML += `
            <div>Post Criado com Sucesso! Id: ${post.id} </div>
            <div>Postagem: ${post.title}</div>
            
            `
        })
    } )
    .catch( erro => console.error("Deu ruim aqui..", erro))
}
