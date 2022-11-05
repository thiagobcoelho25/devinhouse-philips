export default class Fatura {
  constructor(id, descricao, quantia = 0, preco = 0) {
    this.id = id
    this.descricao = descricao
    this.quantia = quantia
    this.preco = preco
  }

  obterValorTotal() {
    return this.quantia * this.preco
  }

  get valorTotal() {
    return this.quantia * this.preco
  }

}