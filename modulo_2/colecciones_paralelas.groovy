def procesos = [300,400,500,100,200,900,200,200,1000,150]

def benchmark(closure){
  start = System.currentTimeMillis()
  closure()
  end = System.currentTimeMillis()
  println "Tiempo: ${end - start} ms."
}

benchmark {
  procesos.each {
    Thread.sleep(it)
    println it
  }
}
