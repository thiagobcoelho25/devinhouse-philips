(function atualizarHorario() {
  return setInterval(() => console.log(new Date().toLocaleTimeString('pt-BR', { hour12: false })), 2000)
})()