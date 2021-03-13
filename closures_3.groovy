def esPalindrome(frase, validacion){
  if(validacion(frase)) { "Es palindrome" }
  else { "NO es palindrome perro!" }
}

def validacionPalindrome = { it == it.reverse() }

println "'hola mundo' ${esPalindrome("hola mundo", validacionPalindrome)}"
println "'anitalavalatina' ${esPalindrome("anitalavalatina", validacionPalindrome)}"
