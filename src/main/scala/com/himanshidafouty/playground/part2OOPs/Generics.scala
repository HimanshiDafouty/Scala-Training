package com.himanshidafouty.playground.part2OOPs

import javax.swing.Box

object Generics {
  //reuse code on potentially different types
  //generics allows us to write classes , traits , or methods that work with different type without rewriting them for each type , help in code reusability and make our code type-safe

  class BoxInt(val int : Int)
  class BoxString( val str : String)

  // for every new type we need a new class

  //with generics

  class BoxType[A](val v1:A)

  val intObj = BoxType[Int](4)
  val strObj = BoxType[String]("Hello")



  def main(args: Array[String]): Unit = {
    println(intObj.v1)
    println(strObj.v1)

  }

}
