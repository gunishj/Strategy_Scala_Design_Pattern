object mainObject {
 def main(args: Array[String]): Unit = {
  var noFly = new NoFly
  var noQuack = new NoQuack
  var noDisplay = new WindowDisplay
  var rubberDuck = new Duck(noFly, noQuack, noDisplay)
  println(rubberDuck.fly())
  println(rubberDuck.quack())
  println(rubberDuck.display())
 }


 //configure run
///https://stackoverflow.com/questions/12304177/intellij-right-click-on-a-test-does-not-present-a-run-option/19100245#:~:text=Rename%20the%20plugins%20directory%20and,incompatibilities%20with%20the%20cucumber%20plugin.&text=if%20you%20can%20see%20the,right%20click%20and%20press%20run.
//inside src-> main -> scala -> mark directory as sources root
 //add framework support of scala

}
