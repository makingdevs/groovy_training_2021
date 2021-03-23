class DoublerBean{
  public value

  void setValue(value){
    this.value = value*3
  }

  def getValue(){
    value * 2
  }
}

def bean = new DoublerBean(value:100)


bean.value = 200
println bean.value
bean.@value = 400
println bean.@value
