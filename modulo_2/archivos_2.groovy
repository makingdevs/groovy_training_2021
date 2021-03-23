File file = new File("hello.txt")
file.write "Hola Edmundo\n"
file.append("Cómo les va en este curso?\n")
file << "Estamos viendo archivos con Groovy"
100.times { i ->
  50.times { j ->
    file << "$i $j"
 }
}
println file.text

new File("hello_copy.txt").write(file.text)

logo = new File("md.png")
println logo.properties

new File("md_copy.png").withOutputStream { out ->
  out.write logo.readBytes()
}

// command = "copy ${logo.name} logo${new Date().format("ddMMyyyyhhss")}.png"
command = "cp ${logo.name} logo${new Date().format("ddMMyyyyhhss")}.png"
println command.execute()
println "ls -la".execute().text
