function procuraMinMax(array) {

  if (Array.isArray(array) && array.length > 0) {
    maior = array[0]
    menor = array[0]

    for (let i = 1; i < array.length; i++) {
      if (maior < array[i]) maior = array[i]
      if (menor > array[i]) menor = array[i]
    }

    return `Maior valor é ${maior}, e menor valor é ${menor}`
  }

  return "Não é possível encontrar"
}

// testes
//
// [56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47]
// []
// [1]
// [1, -1]
// null
// [-2,-2,-2,-2]
// [20,10, 30]


// console.log(procuraMinMax([20, 10, 30]))