class HolaMundo {
  String nombre
  def saluda() { "Hola ${this.nombre} !!!" }
}

def objeto = new HolaMundo(nombre: "@groovy7")
println objeto.saluda()
