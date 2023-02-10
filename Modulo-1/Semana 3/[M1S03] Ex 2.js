const mensagemOla = (nome) => {
  const input = document.querySelector('#input').value
  const texto = document.querySelector('#texto')
  texto.innerHTML = `Ola, ${input}`
}