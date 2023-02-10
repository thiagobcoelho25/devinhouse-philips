export default class Personagem {
  constructor(nome) {
    this.nome = nome
    this.percentualVida = 100
  }

  sofreuDano(percentualDano) {
    this.percentualVida = percentualDano >= this.percentualVida ? 0 : this.percentualVida - percentualDano
  }

  usouKitMedico() {
    this.percentualVida = this.percentualVida < 90 ? this.percentualVida + 10 : 100
  }

}