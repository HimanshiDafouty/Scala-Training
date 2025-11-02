package com.himanshidafouty.playground.part3FP

object FPBasics {
  case class Person(name:String , favMovie : String) {
    def apply(n:Int):String={
      s"$name like movie $favMovie and he had watched this movie $n times"

    }
  }

  trait SimpleMathFunction {
    def apply(n:Int):Int
  }

  val doubler: SimpleMathFunction= new SimpleMathFunction {
    override def apply(n: Int): Int = n*2
  }


  trait understandTraitGenrics[A , B] {
    def apply(args:A):B
  }

  val doubler_V2 = new understandTraitGenrics[Int , String] {
    override def apply(num: Int ): String = {
      val str = "Scala"
      var res : String =""
      var i =1 ;
      while( i<=num){
        res= res+str
        i+=1
      }
      res
    }
  }
  val d3 = new Function[Int, Int] {
    override def apply(v1: Int): Int = v1 * 2
  }
  val d4 = new Function2[String , Int , String] {
    override def apply(v1: String, v2: Int): String = s"$v1 ---- $v2"
  }
  def main(args: Array[String]): Unit = {
    val bob = Person("Bob" , "Kung-fu-panda")
    println(bob(4))
    println(doubler(5))
    println(doubler_V2(4))
    println(d3(6))
    println(d4("Hello" , 5))


  }

  //In FP , we work with functions as "first class citizens" elements of the language
  //we can pass functions as args and can return them as results

  //all functions /function values in scala are instances of these FunctionN traits with apply methods


}
