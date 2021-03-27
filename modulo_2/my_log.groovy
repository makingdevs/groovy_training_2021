@Grapes(
  @Grab(group='commons-logging', module='commons-logging', version='1.2')
)

// @Grapes(
//   @Grab(group='org.slf4j', module='slf4j-log4j12', version='1.7.30', scope='test')
// )

import groovy.util.logging.*
@Commons
//@Slf4j
//@Log
class Service {
  def metodo(){
    log.info("Hola mundo")
  }
}

new Service().metodo()
