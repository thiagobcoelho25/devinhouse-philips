const lista_contas = []

validarSenhasConferem = (senha, confirmacao) => {
  // const senha = document.getElementById('senha').value;
  // const confirmacao = document.getElementById('confirmacao').value;

  // if (evento.target.senha.value === evento.target.confirmacao.value) {
  //   return true;
  // }
  return senha === confirmacao ? true : false
}

geradorNumeroDeConta = () => Math.floor(1000 + Math.random() * 90000)

criarConta = (evento) => {
  evento.preventDefault();

  const { nome, cpf, celular, senha, confirmacao } = evento.target

  if (validarSenhasConferem(senha.value, confirmacao.value)) {
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

validarConta = (conta, senha) => {

}

const sacar = (conta, valor) => {

}

const depositar = (conta, valor) => {

}

const saldo = (conta) => {

}

const efetuarOperacao = (evento) => {
  evento.preventDefault();

  const conta = parseInt(evento.target.conta.value);
  const senha = evento.target.senha.value;
  const valor = parseInt(evento.target.valor.value);

  const contaValida = validarConta(conta, senha);

  if (contaValida) {
    switch (evento.target.operacao.value) {
      case 'SAQUE':
        sacar(conta, valor);
        break;
      case 'DEPOSITO':
        depositar(conta, valor);
        break;
      case 'SALDO':
        saldo(conta);
        break;
      default:
        alert('Operação inválida');
    }
  } else {
    alert('Conta ou senha inválida');
  }
};

const formAcoes = document.getElementById('form-acoes');
formAcoes.addEventListener('submit', efetuarOperacao);

const desabilitarBotaoOperacaoCasoSaldo = (evento) => {
  const valor = document.getElementById('valor');

  valor.disabled = evento.target.value === 'SALDO';
};

const operacao = document.getElementById('operacao');
operacao.addEventListener('change', desabilitarBotaoOperacaoCasoSaldo);

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