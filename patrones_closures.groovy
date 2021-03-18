import javax.swing.*
import java.awt.*
import java.awt.event.*

frame = new JFrame(size: [400,400], layout: new FlowLayout())

button = new JButton("Click")
positionLabel = new JLabel("")
msgLabel = new JLabel("")

frame.contentPane.add button
frame.contentPane.add positionLabel
frame.contentPane.add msgLabel
frame.contentPane.add new JTextField("Texto")

button.addActionListener({
  JOptionPane.showMessageDialog(frame, "Click en boton")
} as ActionListener)

displayMouseLocation = { positionLabel.text = "${it.x}, ${it.y}" }

frame.addMouseListener(displayMouseLocation as MouseListener)
frame.addMouseMotionListener(displayMouseLocation as MouseMotionListener)

handleFocus = [
  focusGained: { msgLabel.text ="Good to see u" },
  focusLost: { msgLabel.text ="bye bye" }
]

button.addFocusListener(handleFocus as FocusListener)

frame.show()
