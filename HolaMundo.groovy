class HolaMundo {
  private String nombre
  String getNombre() {
    return nombre
  }
  void setNombre(String nombre) {
    this.nombre = nombre
  }
  String saluda() {
    return "Hola " + this.nombre + " !!!"
  }
  static void main(String[] args) {
    HolaMundo objeto = new HolaMundo()
    objeto.setNombre("@groovy")
    System.out.println(objeto.saluda())
  }
}
