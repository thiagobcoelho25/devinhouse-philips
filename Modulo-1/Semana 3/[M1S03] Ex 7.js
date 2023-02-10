const pessoa = {
  nome: 'Ada',
  idade: 36,
  profissao: 'matemática'
};

const funcaoDesctruc = (obj) => {
  const { nome, idade, profissao } = obj

  return `Este(a) é ${nome}, tem ${idade} anos e é ${profissao}.`
}

console.log(funcaoDesctruc(pessoa))