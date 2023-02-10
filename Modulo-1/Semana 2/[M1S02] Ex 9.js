let valor_inicial = parseInt(window.prompt('Valor inicial'))

let raiz = parseInt(window.prompt('Raiz'))

let string_final = valor_inicial;

for (let i = 1; i < 10; i++) {
  string_final = string_final + `, ${(valor_inicial + (i * raiz))}`
}

window.alert(string_final)