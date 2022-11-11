function sleep(valor) {
  return new Promise((res, rej) => {
    setTimeout(() => res(valor), 3000)
  })
}

sleep('Teste 1').then(value => console.log(`Valor do teste foi ${value}`))
  .catch(error => console.log("Error na função sleep"))
  .finally(() => console.log('Teste finalizado'))