package com.himanshidafouty.playground.part2OOPs

//object is a class defintion + the only possible instance of that type/class
object Objects {
  //singleton pattern - type with only one possible instance of that
  object A  // A type And the only possible instance of that type

  {
    //we can define fields and methods , just as if my singleton is a class , and only possible instance of that class
      val  aField = "Hi"
      def aMethod : Unit = println("Singleton's method")}

  class Person {
    def sayHi:Unit = println("Hi")
  }
  object Person { // companion object = object with same name as that of class on the same file, defines static method and field , that do not depend on instance of class, but they belong to the class itself and load only once in the memory and is shared among all the instance as it is

    val N_EYES = 2
    def canPlay=false

  }

  //objects can extend classes and traits
  trait canWalk {
    def tell():Boolean
  }

  object obj extends Person with canWalk{
    override def tell(): Boolean = true
  }


  val v1 = A
  val v2 = A

  def main(args: Array[String]): Unit = {
    println(v1==v2)

    //Scala code compiles to JVM Bytecode and that JVM bytecode to be compiled needs to map what JVM understand (class with static main method , that returns unit) , method main is static in scala , since we are defining it inside an object which provides equivalent static implementation as that of java

  }


}
