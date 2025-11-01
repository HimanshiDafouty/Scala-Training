package com.himanshidafouty.playground.part1basics

object Functions {

  ///function -reusable block of code that we can parameterize

  //returning a meaningful value

  def aFunction(a : String , b :String):String={
    a+ " "+ b //pure computation
  }

  //returning Unit
  def aFunction2 ={
    println("Hello")//side effect
    //last expression get returned , as it is just a cde block
  }

  def main(args:Array[String]):Unit={
    println(aFunction("Hello" , "World"))
    println(aFunction2)

  }

}
