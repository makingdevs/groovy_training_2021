bldr = new groovy.swing.SwingBuilder()

contador = 0

frame = bldr.frame(title: "Swing con Groovy", size: [200,200], layout: new java.awt.FlowLayout()) {
  lbl = label(text: "Label")
  btn = button(text: "puchurrame", actionPerformed: {
    contador++
    println contador
  })
}

frame.show()
