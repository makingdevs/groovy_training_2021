class Money{
  int amount
  String currency

  Money plus(Money other){
    if(null == other) return this
      if(other.currency != currency){
        throw new IllegalArgumentException("Invalid operation[$other.currency + $currency]")
      }
    return new Money(amount:amount + other.amount, currency:currency)
  }

  String toString(){
    "\$ $amount $currency"
  }
}


def money1 = new Money(amount: 100, currency: 'MXN')
def money2 = new Money(amount: 50, currency: 'MXN')
def money3 = new Money(amount: 100, currency: 'DLL')

println money1 + money2
println money1 + null
println money1 + money3
