async function obterClienteNoBancoDeDados(idCliente) {
  return { nome: 'bruce wayne', id: idCliente };
}


(async function processar() {
  const cliente = await obterClienteNoBancoDeDados(7)

  console.log(cliente)
})()

// function obterClienteNoBancoDeDados(idCliente) {
//   return new Promise((resolve, reject) => {
//     const cliente = { nome: 'bruce wayne', id: idCliente };
//     resolve(cliente);
//   });
// }

// function processar() {
//   obterClienteNoBancoDeDados(7)
//     .then(cliente => console.log(cliente));
// }

// processar();