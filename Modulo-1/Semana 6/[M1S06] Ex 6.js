(async function obterDados() {
  const response = await fetch('https://api.agify.io/?country_id=BR&name=thiago', {
    method: 'GET',
    headers: { 'Content-type': 'application/json; charset=UTF-8' },
  }
  )

  const dados = await response.json()

  console.log(dados.age, dados.name)
})()

