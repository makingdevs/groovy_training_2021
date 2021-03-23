class Perfil {
  private String bio
  private Date bornDate
  private Persona persona
  private String twitter
  private String facebook

}

class Pedido {
  Persona comprador
  Date dateCreated
  Date lastUpdated

  String toString() {
    "$comprador - $dateCreated"
  }
}


Persona persona = new Persona()
persona.setNombre("Desarrollador");

println persona

Perfil perfil = new Perfil()
//perfil.setBio("My bio")

Pedido pedido = new Pedido()
pedido.setDateCreated(new Date())
pedido.setComprador(persona)
println pedido.dump()

