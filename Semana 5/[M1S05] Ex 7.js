import { Time } from "./Time.js"
import { Partida } from "./Partida.js"

const time_1 = new Time("time 1", "T1", 0, 0, 0, 0, 0)

const time_2 = new Time("time 2", "T2", 0, 0, 0, 0, 0)

const partida_1 = new Partida("T1", 3, "T2", 1)
time_1.computarPartida(partida_1)
time_2.computarPartida(partida_1)

const partida_2 = new Partida("T2", 2, "T1", 2)
time_1.computarPartida(partida_2)
time_2.computarPartida(partida_2)

const partida_3 = new Partida("T1", 7, "T2", 1)
time_1.computarPartida(partida_3)
time_2.computarPartida(partida_3)

console.log(time_1.exibirSituacao())
console.log(time_2.exibirSituacao())