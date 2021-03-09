class HolaMundo {
  String nombre
  def saluda() {
    "Hola ${this.nombre} !!!"
  }
  static main(args) {
    def objeto = new HolaMundo(nombre: "@neodevelop")
    println(objeto.saluda())
    objeto.nombre = "@groovy6"
    println(objeto.saluda())
    objeto["nombre"] = "@makingdevs"
    println(objeto.saluda())
  }
}
