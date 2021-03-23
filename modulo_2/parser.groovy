document = new XmlSlurper().parse('makingdevs.xml')
println "Entrenamiento en ${document.'@organization'} !!!"
document.roadmap.category.each { category ->
   println "\t- Category: ${category.'@name'}"
   for(course in category.course)
    println "\t\t- ${course.text().trim()}"
}
