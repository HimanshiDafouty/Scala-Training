package com.himanshidafouty.playground.part2OOPs

object OverridingPolymorphismAnonymousClass {
  //Overriding-providing a new implementation in derived classes

  class A {
    val v1 = "Hey"
    def play():Unit=println("Play")
  }

  class B extends  A{
    override val v1: String = "Hi"

    override def play(): Unit = println("Game")
  }

  val obj1 = B()
  //subtype polymorphism - in which we can have value of parent-type , provide an instance of derived type
  val obj2: A = B()

  //anonymous classes - class that do not really bear any name , they are the declaration of new classes with overriding implementation on the spot

  val obj3 = new A{
    override val v1 = "Play"

    override def play(): Unit = println("Game")
  }

  def main(args:Array[String]):Unit={
    println(obj1.v1)
    obj1.play()
    println(obj2.v1)
    println(obj3.v1)


  }

}
