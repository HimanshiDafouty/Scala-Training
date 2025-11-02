package com.himanshidafouty.playground.part2OOPs

object OOPBasics {

  // a class is essentially a blueprint, that defines how an object should look and behave - state and behaviour(methods)

  //object is the real instance of class  which occupies memory and hold data


  class Person(var name : String , var age : Int) { // class definition also contains the definition of its CONSTRUCTOR , constructor args are not necessarily fields , we can make them field by providing val keyword in front of constructor parameter.
    //fields
    val allCaps = name.toUpperCase()

    //methods
    def greet(someone:String):String={
      s"Hi $someone says $name"

    }
    //we can have multiple methods with same name - overloading , but they should differ in function definition/signature

  }

  val p1 = new Person("Pikachu" , 4)
  def main(args: Array[String]): Unit = {
    println(p1.name)
    println(p1.allCaps)
    println(p1.greet("Charmender"))

  }

}
