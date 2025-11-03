package com.himanshidafouty.playground.part2OOPs

object Inheritance {
  class Greet {
    val hi = "Hi"
    def hello()={
      println("Hello")
    }
  }
  class Meet extends Greet {
    def Hey ={
      hello()
      println("Hey Greet")
    }

  }

  class Person(val name : String , age : Int) {

  }
  class child(name:String , age:Int) extends Person(name , age)//Must specify constructor arguments
  {

  }
  //extending  a class will necessarily copt its field and methods so that we can access it , and we also inherit the primary constructor

  def main (args : Array[String]):Unit={
    val m1= Meet()
    println(m1.hi)
    m1.Hey
    val child1 = new child("James" , 4)
    println(child1.name )




  }

}
