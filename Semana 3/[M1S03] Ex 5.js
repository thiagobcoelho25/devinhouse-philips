const somaTudo = (...args) => {
  return args.reduce((a, b) => a + b, 0)
}


const resultado = somaTudo(1, 2, 3, 4);
console.log(resultado);