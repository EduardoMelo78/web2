document.querySelector("#formPost").addEventListener('submit', cadastrar);

function cadastrar(event) {
    event.preventDefault();

    const form = new FormData(event.target);

    const objeto = {
        userId: 1,
        title: form.get('titulo'),
        body: form.get('textoPostagem')
    };

    fetch('https://jsonplaceholder.typicode.com/posts', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(objeto)
    })
    .then(response => {
        console.log('Resposta do servidor:', response);
        if (response.ok) {
            return response.json(); 
        }
        throw new Error('Erro na resposta do servidor');
    })
    .then(post => {
        mostrar(post); 
    })
    .catch(erro => console.error("Deu ruim aqui..", erro));
}

function mostrar(post) {
    const resposta = document.querySelector("#resposta");
    
    resposta.innerHTML = `
        <div>Post Criado com Sucesso! Id: ${post.id}</div>
        <div>Postagem: ${post.title}</div>
    `;
}