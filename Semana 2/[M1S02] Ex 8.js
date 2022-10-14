let lista_primos = []
let quantidade_primos = 0

for (let i = 2; i <= 1000; i++) {
  let e_primo = true

  for (let j = 0; j < lista_primos.length; j++) {

    if ((i % lista_primos[j] == 0)) {
      e_primo = false
      break;
    }

  }

  if (e_primo) {
    lista_primos.push(i)
    quantidade_primos++
  }

}

console.log(lista_primos, quantidade_primos)