
let tipo_calculo = window.prompt("pergunte qual o tipo de cálculo se deseja fazer ( + , -, * ou /)");

let primeiro_valor = window.prompt("Qual o primeiro valor que deseja calcular");
primeiro_valor = parseInt(primeiro_valor)

let segundo_valor = window.prompt("Qual o segundo valor que deseja calcular");
segundo_valor = parseInt(segundo_valor)

if (!isNaN(primeiro_valor) && !isNaN(segundo_valor)) {
  switch (tipo_calculo) {
    case "+":
      window.alert(`O resultado do seu cálculo é: ${primeiro_valor + segundo_valor}`)
      break;

    case "-":
      window.alert(`O resultado do seu cálculo é: ${primeiro_valor - segundo_valor}`)
      break;

    case "*":
      window.alert(`O resultado do seu cálculo é: ${primeiro_valor * segundo_valor}`)
      break;
    case "/":
      window.alert(`O resultado do seu cálculo é: ${primeiro_valor / segundo_valor}`)
      break;

    default:
      window.alert(`Comando invalido`)
      break;
  }
} else {
  window.alert(`Valor invalido`)
}