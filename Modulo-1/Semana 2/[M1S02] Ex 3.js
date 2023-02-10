let numero = window.prompt("Qual numero para tabuada?: ");
numero = parseInt(numero)

if (numero !== numero || numero < 0) {
  window.alert("Numero invalido")
} else {
  let tabuada = ""
  for (let i = 0; i < 11; i++) {
    tabuada = tabuada + `${numero} x ${i} = ${numero * i}\n`;
  }

  window.alert(tabuada)
}

