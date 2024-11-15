

fetch('https://restcountries.com/v3.1/all?fields=name,flags,capital')
.then(response => response.json())
.then(data => exibirDados(data))
.catch( erro => console.error('Estamos com problema', erro))


function exibirDados(paises){
    const box = document.querySelector("#box-pais")
    box.innerHTML = '';
    
    paises.forEach(pais => {
        box.innerHTML += 
        `
            <div class = "pais-box">
                <div class= "sobre">
                <div class= "pais-nome">${pais.name.common}</div>
                <div class="pais-capital">${pais.capital[0]}</div>
                </div>
                <img src="${pais.flags.svg}" alt="Bandeira de ${pais.name.common}" class="pais-bandeira">
            </div>
        `;
    });
}