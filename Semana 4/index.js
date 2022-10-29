const lista_contas = []

validarSenhasConferem = (senha, confirmacao) => {
  // const senha = document.getElementById('senha').value;
  // const confirmacao = document.getElementById('confirmacao').value;

  // if (evento.target.senha.value === evento.target.confirmacao.value) {
  //   return true;
  // }
  return senha.value === confirmacao.value ? true : false
}

geradorNumeroDeConta = () => Math.floor(1000 + Math.random() * 90000)

criarConta = (evento) => {
  evento.preventDefault();

  const { nome, cpf, celular, senha, confirmacao } = evento.target

  if (validarSenhasConferem(senha, confirmacao)) {
    const conta = {
      nome: nome.value,
      cpf: cpf.value,
      celular: celular.value,
      senha: senha.value,
      conta: geradorNumeroDeConta(),
      saldo: 0,
    };

    lista_contas.push(conta);
    alert(`Conta criada com sucesso! Número: ${conta.conta}`);
  } else {
    alert('Senhas não conferem');
  }

}

const mascaraTelefone = (valor) => {
  valor = valor.replace(/\D/g, "")
  valor = valor.replace(/^(\d{2})(\d)/g, "($1) $2")
  valor = valor.replace(/(\d)(\d{4})$/, "$1-$2")
  tel.value = valor // Insere o(s) valor(es) no campo
}

const tel = document.getElementById('celular') // Seletor do campo de telefone
tel.addEventListener('keypress', (e) => mascaraTelefone(e.target.value)) // Dispara quando digitado no campo
tel.addEventListener('change', (e) => mascaraTelefone(e.target.value)) // Dispara quando autocompletado o campo


const form = document.getElementsByTagName('form')[0]
form.addEventListener('submit', criarConta);