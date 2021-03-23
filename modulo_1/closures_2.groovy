def cuadrado(n, block) {
  for(int i=1; i<=n; i++) {
    block(i)
  }
}

cuadrado(5, { if(it%2 == 1) println "El cuadrado de $it, es ${it*it}" })
println "*"*100
cuadrado(5) { if(it%2 == 1) println "El cuadrado de $it, es ${it*it}" }
println "-"*100
cuadrado(5) { number -> if(number%2 == 1) println "El cuadrado de $number, es ${number*number}" }
