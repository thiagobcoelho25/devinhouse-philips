export default class Juros {
  constructor(capitalInicial, taxaAplicada, tempo) {
    this.capitalInicial = capitalInicial
    this.taxaAplicada = taxaAplicada
    this.tempo = tempo
  }


  calcularJurosSimples() {
    // J = C * i * t
    return this.capitalInicial * this.taxaAplicada * this.tempo
  }

  calcularJurosCompostos() {
    // M = C * (1 + i) ** t
    return this.capitalInicial * (1 + this.taxaAplicada) ** this.tempo
  }
}