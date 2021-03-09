class HolaMundo {
  String nombre
  def saluda() {
    "Hola ${this.nombre} !!!"
  }
  static main(args) {
    def objeto = new HolaMundo()
    objeto.setNombre("@groovy5")
    println(objeto.saluda())
  }
}
