@groovy.transform.TupleConstructor
@groovy.transform.ToString(includeNames=true)
@groovy.transform.EqualsAndHashCode
class Curso {

  String nombre
  Integer duracion
  BigDecimal costo

}

curso1 = new Curso("Groovy intermedio", 20, 12364.21)
curso2 = new Curso("Groovy intermedio", 20, 12364.21)
println curso1
println curso2
println curso1 == curso2
