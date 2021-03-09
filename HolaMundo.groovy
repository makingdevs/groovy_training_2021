class HolaMundo {
  String nombre
  def saluda() {
    return "Hola ${this.nombre} !!!"
  }
  static def main(args) {
    def objeto = new HolaMundo()
    objeto.setNombre("@groovy4")
    println(objeto.saluda())
  }
}
