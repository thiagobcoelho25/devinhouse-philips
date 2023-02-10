(async function obterDados() {
  const response = await fetch('https://api.coincap.io/v2/assets/bitcoin', {
    method: 'GET',
    headers: { 'Content-type': 'application/json; charset=UTF-8' },
  }
  )

  const { symbol, priceUsd } = await response.json().then((dados) => dados.data)

  console.log(`O preço do Bitcoin - ${symbol} em dólares hoje é $ ${priceUsd}.`)
})()

