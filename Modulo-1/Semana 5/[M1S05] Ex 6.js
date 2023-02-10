import Juros from "./Juros.js"

const aplicacao_1 = new Juros(10000, 0.07, 24)

console.log(`Primeira aplicação a juros simples: ${aplicacao_1.calcularJurosSimples()} e a juros compostos de ${aplicacao_1.calcularJurosCompostos()}`)

const aplicacao_2 = new Juros(10000, 0.15, 10)

console.log(`Segunda aplicação a juros simples: ${aplicacao_2.calcularJurosSimples()} e a juros compostos de ${aplicacao_2.calcularJurosCompostos()}`)

