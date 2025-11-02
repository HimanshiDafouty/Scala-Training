package com.himanshidafouty.playground.part2OOPs

object MethodNotation {
  //infix notation , in which we have instance method args very english like, only works with method having one args

  class A {
    //apply is special method in scala , which is treated in a way that we can altogether omit this apply if we have an instance of this class
    def apply(str:String):String={
      s"alice want to go for $str"
    }
    infix def hello(name:String):String={
      s"$name says hello "
    }// infix is a soft modifier to indicate that this method will be called infix

    //Method name in scala can be non-alphanumeric

    infix def ?&(movie : String) : String={
      s"alice like movie $movie"
    }


  }

  val alice =   A()

  def main(args:Array[String]):Unit={
    println(alice hello "alice") // instance method args  - infix notation , infix notation only works with methods having one args

    println(alice ?& "Twilight")
    println(alice("movie"))
    //as many apply methods we define in our classes,  we can as many way we can invoke the instance of those classes with exact args

    //apply method let us call an object like a function

  }

}
