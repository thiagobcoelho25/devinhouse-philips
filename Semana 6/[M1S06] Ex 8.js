const lista_html = document.getElementsByTagName("ul")[0]

const input = document.getElementById('input')


input.addEventListener('change', (event) => obterDados(event.target.value))

async function obterDados(input = 4) {
  try {
    input = Number.parseInt(input)

    if (input > 0 && input <= 10) {
      const response = await fetch(`https://randomuser.me/api/?results=${input}`, {
        method: 'GET',
        headers: { 'Content-type': 'application/json; charset=UTF-8' }
      })

      if (response.status != 200) {
        const text_error = await response.json().error
        throw new Error(text_error);
      }

      lista_html.replaceChildren()
      const resultados = await response.json().then((dados) => dados.results)

      resultados.map(elemento => pupularLista(elemento, lista_html))
    } else {
      lista_html.replaceChildren()
    }

  } catch (error) {
    alert(error)
  }
}

function pupularLista(elemento, lista_html) {
  const item = document.createElement('li');
  const img = document.createElement('img');
  const span = document.createElement('span');
  const nome = document.createElement('p');
  const email = document.createElement('p');
  const endereco = document.createElement('p');

  img.src = elemento.picture.large
  nome.innerText = `${elemento.name.title} ${elemento.name.first} ${elemento.name.last}`
  email.innerText = elemento.email
  endereco.innerText = `${elemento.location.street.name} ${elemento.location.city} ${elemento.location.state} ${elemento.location.country}`

  span.appendChild(nome)
  span.appendChild(email)
  span.appendChild(endereco)

  item.appendChild(img)
  item.appendChild(span)

  lista_html.appendChild(item)
}

obterDados()