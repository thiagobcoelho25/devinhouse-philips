export class Time {
  constructor(nome, sigla, vitorias, derrotas, empates, golsMarcados, golsSofridos) {
    this.nome = nome
    this.sigla = sigla
    this.vitorias = vitorias
    this.derrotas = derrotas
    this.empates = empates
    this.golsMarcados = golsMarcados
    this.golsSofridos = golsSofridos
  }


  get numeroDeJogos() {
    return this.vitorias + this.derrotas + this.empates
  }

  get numeroDePontos() {
    return (this.vitorias * 3) + (this.derrotas * 0) + (this.empates * 1)
  }

  computarPartida(partida) {
    const { siglaTimeA, siglaTimeB, golsTimeA, golsTimeB } = partida

    if (siglaTimeA === this.sigla) {
      this.#calcularGolsMArcadosSofridos(golsTimeA, golsTimeB)
      this.#calcularVitoriasDerrotasEmpates(golsTimeA, golsTimeB)
    } else if (siglaTimeB === this.sigla) {
      this.#calcularGolsMArcadosSofridos(golsTimeB, golsTimeA)
      this.#calcularVitoriasDerrotasEmpates(golsTimeB, golsTimeA)
    }
  }

  #calcularVitoriasDerrotasEmpates(golsTimeCasa, golsTimeAdversario) {
    if (golsTimeCasa > golsTimeAdversario) {
      this.vitorias = this.vitorias + 1
    } else if (golsTimeAdversario > golsTimeCasa) {
      this.derrotas = this.derrotas + 1
    } else {
      this.empates = this.empates + 1
    }
  }

  #calcularGolsMArcadosSofridos(golsTimeCasa, golsTimeAdversario) {
    this.golsMarcados = this.golsMarcados + golsTimeCasa
    this.golsSofridos = this.golsSofridos + golsTimeAdversario
  }

  exibirSituacao() {
    return `
    nome: ${this.nome}
    sigla: ${this.sigla}
    gols marcados: ${this.golsMarcados}
    gols sofridos: ${this.golsSofridos}
    vitorias: ${this.vitorias}
    derrotas: ${this.derrotas}
    empates: ${this.empates}`
  }
}