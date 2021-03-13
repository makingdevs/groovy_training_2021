class Calculadora {
  def operacion
  Calculadora(_operacion_) { operacion = _operacion_ }
  def operar(a,b){
    println "Ejecutanto operación..."
    operacion(a,b)
  }
}

def calculadora_1 = new Calculadora({ a, b -> println "suma de ${a+b}" })
def operacion_desacoplada = { a, b -> println "multiplica de ${a*b}" }
def calculadora_2 = new Calculadora(operacion_desacoplada)

calculadora_1.operar(12, 12)
calculadora_2.operar(12, 12)
