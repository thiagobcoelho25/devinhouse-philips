const verificaPalindromo = (palavra) => {
  const palavra_inversa = palavra.split("").reverse().join("")

  return palavra === palavra_inversa ? true : false
}


const teste1 = verificaPalindromo("ana");
console.log(teste1)

const teste2 = verificaPalindromo("julia");
console.log(teste2)