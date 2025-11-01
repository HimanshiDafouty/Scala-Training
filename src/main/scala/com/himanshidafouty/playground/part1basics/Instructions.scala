package com.himanshidafouty.playground.part1basics

object Instructions {
  //instructions v/s expressions
  //instructions - imperative programming , instructions are executed
  //expressions - functional programming , while expressions are evaluated
  val printing : Unit  = println("this is an instruction")//side effect

  // values evaluating to unit do not return anything meaningful , but they do perform something , they do perform instructions into real world .
  //Everything in scala is an expressions , we will model everything into expression. Instructions are expressions returning Unit
  val theUnit :Unit =()//anything returning Unit returns this token

  var aVariable = 10
  var reassignVariable : Unit = aVariable=20

  def main(args : Array[String]):Unit ={
    println(printing == theUnit)

    println(aVariable)

//    println(reassignVariable)

    // in the process of evaluating an expressions we do perform side effects using expressions

    var i = 0
    while(i<10)
      {
        i+=1
        println(println(i))

      }








  }


}
