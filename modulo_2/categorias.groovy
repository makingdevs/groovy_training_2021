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
