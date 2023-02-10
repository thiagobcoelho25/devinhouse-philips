let numero = window.prompt("Digite um numero maior que -1: ");
let soma = 0
numero = parseInt(numero)
numero = numero !== numero ? 0 : numero

while (numero != -1) {
  soma = soma + numero

  numero = window.prompt("Digite um numero maior que -1: ");
  numero = parseInt(numero)
  numero = numero !== numero ? 0 : numero
}

window.alert(`A soma dos numero digitados foi de ${soma}`)
