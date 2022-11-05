export class CalculadoraDeArea {

  constructor(tipo, base, altura) {
    this.tipo = tipo
    this.base = base
    this.altura = altura
  }

  calcular() {
    let result = 0
    switch (this.tipo) {
      case "triangulo":
        result = (this.altura * this.base) / 2
        break;

      case "quadrado":
      case "retangulo":
        result = this.base * this.altura
        break;

      default:
        break;
    }
    return result
  }
}