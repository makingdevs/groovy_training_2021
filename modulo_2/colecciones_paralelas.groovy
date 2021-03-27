import static groovyx.gpars.GParsPool.withPool
import java.util.concurrent.atomic.AtomicInteger

def procesos = [300,400,500,100,200,900,200,200,1000,150]

def benchmark(closure){
  start = System.currentTimeMillis()
  closure()
  end = System.currentTimeMillis()
  println "Tiempo: ${end - start} ms."
}

benchmark {
  withPool(){
    procesos.eachParallel {
      Thread.sleep(it)
      println it
    }
  }
}

withPool {
  benchmark {
    println procesos.collectParallel { it * it * it  }
  }
}

// Este método está en una clase Java/Groovy
def funcionExterna(it) { it * it * it  }
def procesamientoDeLista(lista) {
  lista.collect { Thread.sleep it; it * it * it }
}

benchmark{
  withPool{
    println procesamientoDeLista(procesos.makeConcurrent())
  }
}

println "*"*100
withPool {
  result = new AtomicInteger(0)
  procesos.eachParallel { result.addAndGet(it) }
  println result
  println procesos.sum()
}

withPool {
  final List lista = procesos.collectParallel { it*2 }
  println lista
  println procesos.collect { it*2 }
}
