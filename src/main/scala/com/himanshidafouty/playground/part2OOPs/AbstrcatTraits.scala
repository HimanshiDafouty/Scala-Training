package com.himanshidafouty.playground.part2OOPs

object AbstrcatTraits {
  //Abstract classes - classes that do not have each and every field implemented and that is for derived classes to implement them
  abstract  class A {
    val v1 :String
    //concrete method
    def play():Unit ={
      println("HI")
    }
  }
  //can not be instantiated
  val obj1 = new A{
    override val v1: String = "A"  }

  //whatever class extends an abstract class either need to be abstrcat or provide an implementation for abstract fields and methods
  class B extends A{
    override val v1: String = "B"

    override def play(): Unit = println("B play")

  }
  val obj2 = B()


  //Traits - are just like abstract classes , in  a way that they can have methods or fields without implementation
  trait C {
    def playGame:Unit
  }
  trait D extends C{
    override def playGame: Unit = "C"
  }
  //difference between abstract class and traits is that classes ca extends only one class while we can have multiple inheritance in case of traits
  trait E {
    val v1 : String
  }
  class F extends B with D with E{
     override val v1: String = "F"


  }

  def main(args: Array[String]): Unit = {
    obj2.play()
    obj1.play()

  }

}
