import Personagem from "./Personagem.js"

const alyx = new Personagem("Alyx");

console.log(alyx.percentualVida); // 100

alyx.sofreuDano(50);

console.log(alyx.percentualVida); // 50

alyx.usouKitMedico();

console.log(alyx.percentualVida); // 60

const heisenberg = new Personagem("heisenberg");
heisenberg.sofreuDano(9)
console.log(heisenberg.percentualVida)
heisenberg.usouKitMedico()
console.log(heisenberg.percentualVida);