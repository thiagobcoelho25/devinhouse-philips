import { Usuario } from './Usuario.js'

const form = document.getElementById("login-container")
const pMensagem = document.getElementById('p-mensagem')

const u1 = new Usuario(
  'Thiago',
  'dev@in.house',
  '123'
)

form.addEventListener('submit', (e) => {
  e.preventDefault()

  const validado = u1.autenticar(e.target["campo-usuario"].value, e.target["campo-senha"].value)

  if (validado) {
    pMensagem.innerHTML = 'Login realizado!'
  } else {
    pMensagem.innerHTML = 'Credenciais inválidas!'
  }
})