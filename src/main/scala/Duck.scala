class Duck(fb1 : IFlyBehaviour, qb1:IQuackBehaviour,db1:IDisplayBehaviour) {

def fly() = {
  fb1.fly()
}
  def quack()= {
    qb1.quack()
  }

  def display() = {
    db1.display()
  }


}
