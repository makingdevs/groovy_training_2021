def adder = { x,y -> return x + y }
def addOne = adder.curry(1)
println addOne(6)

def funcionCombinatoria = { action1, action2, action3 ->
  action1()
  action2()
  action3()
}

funcionCombinatoria({ println "1" }, { println "2" }, { println "3" })
funcionCombinatoria({ println "1" }, { println "2" }) { println "3" }
def funcionCombinatoriaDelta1 = funcionCombinatoria.curry({ println "1" })
println "*"*100
funcionCombinatoriaDelta1({ println "2" }) { println "3" }

def funcionCombinatoriaDelta2 = funcionCombinatoriaDelta1.curry({ println "2" })
println "-"*100
funcionCombinatoriaDelta2() { println "3" }
