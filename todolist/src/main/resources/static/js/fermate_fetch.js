
const table = document.getElementById('fermate');
const url = 'http://localhost:8081/fermate';

fetch(url)
    .then((response) => {
        return response.json();
    })
    .then((data) => {
        let fermate = data;

        fermate.map(
            function(fermata) {
                aggiungi_tabella( `${fermata.id}`, `${fermata.nome}`,
                    `${fermata.zona}`);
            });
    })
    .catch(function(error) {
        console.log(error);
    });

function aggiungi_tabella(id_fermata,nome_fermata,zona_fermata){

    let tr = document.createElement('tr');
    let id = document.createElement('td');
    let nome = document.createElement('td');
    let zona = document.createElement('td');

    id.innerHTML = id_fermata;
    nome.innerHTML = nome_fermata;
    zona.innerHTML = zona_fermata;

    tr.appendChild(id);
    tr.appendChild(nome);
    tr.appendChild(zona);
    table.appendChild(tr);

}

function aggiungi(){
    aggiungi_tabella(document.getElementById("inputId").value,
        document.getElementById("inputNome").value,
        document.getElementById("inputZona").value
    )

}


