const data_atual = new Date()

const INICIO_OUTONO = new Date(data_atual.getFullYear(), 2, 22);
const INICIO_INVERNO = new Date(data_atual.getFullYear(), 5, 22);
const INICIO_PRIMAVERA = new Date(data_atual.getFullYear(), 8, 22);
const INICIO_VERAO = new Date(data_atual.getFullYear(), 11, 22);

if (data_atual >= INICIO_OUTONO && data_atual < INICIO_INVERNO) {
  window.alert('Outono')
} else if (data_atual >= INICIO_INVERNO && data_atual < INICIO_PRIMAVERA) {
  window.alert('Inverno')
} else if (data_atual >= INICIO_PRIMAVERA && data_atual < INICIO_VERAO) {
  window.alert('Primavera')
} else {
  window.alert('Verão')
}

console.log(data_atual.getFullYear())