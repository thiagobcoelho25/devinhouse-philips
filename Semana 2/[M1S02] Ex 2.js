/*const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout,
});

readline.question(`What's your name?: `, name => {
  console.log(`Hi ${name}!`);
  readline.close();
});*/

const idade = window.prompt("Qual sua idade?: ");
let mensagem = null;

if (idade <= 15) {
  mensagem = 'Jovens'
} else if (idade >= 65) {
  mensagem = 'Idosos'
} else {
  mensagem = 'Adultos'
}

window.alert(mensagem)