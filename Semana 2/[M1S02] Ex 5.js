

let numero = window.prompt("Digite um numero para saber quantos pares e impares existem de 0 até o número digitado: ");
numero = parseInt(numero)

if (isNaN(numero) || numero < 0) {
  window.alert(`Numero invalido`)
} else {
  let impares = 0
  let pares = 0

  /*for(let i = 0; i < numero; i++){
    if()
  }*/

  if (numero % 2 == 0) {
    // 10 == 6 pares e 5 impares
    //12 == 7 pares e 6 impares
    pares = (numero / 2) + 1;
    impares = (numero / 2)
  } else {
    //9 == 5 pares e 5 impares
    //11 === 6 pares e 6 impares
    impares = Math.ceil(numero / 2)
    pares = impares
  }

  window.alert(`O numero ${numero} possui ${pares} pares e ${impares} impares`)

}

