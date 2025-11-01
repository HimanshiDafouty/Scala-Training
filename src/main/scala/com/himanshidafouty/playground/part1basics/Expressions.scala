package com.himanshidafouty.playground.part1basics

object Expressions {
  //expressions are the structures that evaluates to a value
  println("Object is being loaded")
  val aNumber :Int = 40+2

  println(aNumber)
  def main(args:Array[String]):Unit={
    println("main started")
    val aNumber : Int = 46
    println(aNumber)
    println(if(1==2) true  else false)
    println(if(1==1) then true else false)
    //a code block is also an expression in scala which evaluates to a value , which is the last value of that codeblock
    println({
      var num = 56

      //bunch of expressions



      num+89
    })

    //pattern matching = "switch on steroids" - evaluates to a va;ue

    val someValue = 56
    val desc = someValue match{
      case 1 => "A"
      case 2 => "B"
      case 3 => "C"
      case 56 => "D"
    }

    println(desc)
    println("main completed")
  }
  println("Object loading completed ")

}
