//@ThreadInterrupt
@TimedInterrupt(5)
//@ConditionalInterrupt({ counter >= 10 })
import groovy.transform.ThreadInterrupt
import groovy.transform.TimedInterrupt
import groovy.transform.ConditionalInterrupt

counter= 0

while(true) {
  Thread.sleep(3500)
  counter = 11
}
