class HolaMundo {
  String nombre
  String saluda() {
    return "Hola " + this.nombre + " !!!"
  }
  static void main(args) {
    HolaMundo objeto = new HolaMundo()
    objeto.setNombre("@groovy2")
    println(objeto.saluda())
  }
}
