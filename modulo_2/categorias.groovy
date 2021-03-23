class PhoneFormat {
  static toFormat(numero) {
    if(numero.size() == 10) {
      return "Phone: ${numero[0..2]} - ${numero[3..5]} - ${numero[6..9]}"
    }
  }
}

use(PhoneFormat) {
  println "5512345678".toFormat()
  println new StringBuffer("5587654321").toFormat()
}

use(groovy.time.TimeCategory, PhoneFormat){
  println "*"*100
  println "5512345678".toFormat()
  println "5512345678".toFormat()
  println new Date() + 10.minutes
  println new Date() - 10.minutes
  println 10.minutes.from.now
  println 10.minutes.ago
  println 10.minute.from.now
  println 10.hours.ago
  println 10.months.ago
  println new Date() - 30 + 15.hours
  queDia = new Date() - 15 - 1.year.ago

  println new Date().format("EEEE dd 'de' MMMM 'del' yyyy")
}
