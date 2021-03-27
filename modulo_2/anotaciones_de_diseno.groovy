@Singleton
class Servicio {
  String saluda(String nombre = "Anonimo") {
    "Hello ${nombre}"
  }
}

s1 = Servicio.instance
s2 = Servicio.getInstance()

println s1.saluda("Juan")
println s2.saluda()

println s1
println s2

println s1 == s2

