import static groovyx.gpars.actor.Actors.*
import groovyx.gpars.actor.Actors

//def decriptor = reactor { code -> code.reverse() }
//def muestra   = reactor { println it }
//def main    = actor   {
//  decriptor 'terces pot'
//  react { plainText ->
//    muestra plainText
//  }
//}
//main.join()
//muestra.stop()
//muestra.join()

def passiveActor = Actors.actor{
  loop {
    react { msg -> println "Received: $msg"; }
  }
}
passiveActor.send 'Message 1'
passiveActor << 'Message 2'
passiveActor 'Message 3'

passiveActor.join()
